package com.tobehonor.mangoupc.rpc.user.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Nacos消费者应用名配置
 *
 * @author William Chan
 * @since 2023/10/5
 */
@Configuration
public class NacosProjectNameConfig implements EnvironmentAware {
    
    private static final String ENV_PROJECT_NAME = "project.name";
    
    @Value("${spring.application.name}")
    private String applicationName;
    
    @Override
    public void setEnvironment(Environment environment) {
        String projectName = System.getProperty(ENV_PROJECT_NAME);
        if (projectName == null || projectName.trim() == "") {
            System.setProperty(ENV_PROJECT_NAME, applicationName);
        }
    }
}
