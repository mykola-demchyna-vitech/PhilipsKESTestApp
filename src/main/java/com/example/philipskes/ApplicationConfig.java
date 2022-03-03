package com.example.philipskes;

import com.newrelic.api.agent.Insights;
import com.newrelic.api.agent.NewRelic;
import com.philips.sapphire.infrastructure.logging.SpringLogger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class ApplicationConfig {

    @Bean
    public Insights getInsights() {
        return NewRelic.getAgent().getInsights();
    }


}
