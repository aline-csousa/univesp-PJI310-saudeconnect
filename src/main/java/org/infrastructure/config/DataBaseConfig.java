package org.infrastructure.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "org.domain.model")
@EnableJpaRepositories(basePackages = "org.domain.repository")
public class DataBaseConfig {
}
