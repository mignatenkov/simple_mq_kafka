package com.korfax.simple_mq_kafka.consumer;

import com.korfax.simple_mq_kafka.model.SimpleEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(id = "SimpleEntity", topics = {"server.testEntity"}, containerFactory = "singleFactory")
    public void consume(SimpleEntity dto) {
        log.info("=> consumed {}", dto.toString());
    }

}
