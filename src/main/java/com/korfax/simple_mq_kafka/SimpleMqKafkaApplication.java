package com.korfax.simple_mq_kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SimpleMqKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleMqKafkaApplication.class, args);
    }

}
