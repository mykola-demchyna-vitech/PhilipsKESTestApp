package com.example.philipskes;

import com.philips.sapphire.infrastructure.kes.producer.components.SapphireKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    private final SapphireKafkaProducer sapphireKafkaProducer;

    @Autowired
    public DataController(SapphireKafkaProducer sapphireKafkaProducer) {
        this.sapphireKafkaProducer = sapphireKafkaProducer;
    }

    @GetMapping("/send")
    public String sendData() {
        System.out.println(sapphireKafkaProducer);
        return "";
    }

}
