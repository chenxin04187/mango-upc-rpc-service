package com.tobehonor.mangoupc.rpc.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * xml引入生产者额外配置
 *
 * @author William Chan
 * @since 2023/9/17
 */
@Configuration
@ImportResource("classpath:providerconfig/*.xml")
public class ProviderDubboXmlConfig {

}
