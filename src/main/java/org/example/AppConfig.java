package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    @Bean
    public StartText StartText() {
        return new StartText();
    }

    @Bean
    @Lazy
    public UseText UseText() {
        return new UseText();
    }
}
