package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.example")
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class SpringConfig {
}
