package com.example.philipskes;

import com.netflix.discovery.EurekaClient;
import com.newrelic.api.agent.Insights;
import com.philips.sapphire.canonicalmodels.avro.v1.devicedata.ObservationsEnvelope;
import com.philips.sapphire.infrastructure.kes.producer.components.KafkaAdminOperations;
import com.philips.sapphire.infrastructure.kes.producer.components.SapphireKafkaProducer;
import com.philips.sapphire.infrastructure.kes.producer.components.SapphireKafkaTemplate;
import com.philips.sapphire.infrastructure.kes.producer.config.ProducerConfiguration;
import com.philips.sapphire.infrastructure.kes.producer.validators.ValidationUtils;
import com.philips.sapphire.infrastructure.logging.*;
import com.philips.sapphire.infrastructure.trace.RequestTraceStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableEurekaClient
@Import(value= {
        SapphireKafkaProducer.class,
        SapphireKafkaTemplate.class,
        ValidationUtils.class,
        SpringLogger.class,
        LogHelper.class,
        RequestTraceStorage.class,
        LoggerObjectMapperFactoryBean.class,
        SapphireAuditor.class,
        NewRelicAvailabilityManager.class,
        ProducerConfiguration.class,
        KafkaAdminOperations.class
})
public class PhilipsKesTestAppApplication {

    public static void main(String[] args) {

        ObservationsEnvelope observationsEnvelope = new ObservationsEnvelope();



        SpringApplication.run(PhilipsKesTestAppApplication.class, args);
    }

}
