package io.github.devbhuwan.workflow.service.strater.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Bhuwan Upadhyay
 */
@Configuration
//@ConditionalOnClass(T.class)
@EnableConfigurationProperties(WorkflowServiceProperties.class)
public class ActivitiWorkflowServiceAutoConfiguration {

    @Autowired
    private WorkflowServiceProperties serviceProperties;

}
