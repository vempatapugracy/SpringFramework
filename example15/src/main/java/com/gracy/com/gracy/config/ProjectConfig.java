package com.gracy.com.gracy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.gracy.beans","com.gracy.services"})
public class ProjectConfig {
}
