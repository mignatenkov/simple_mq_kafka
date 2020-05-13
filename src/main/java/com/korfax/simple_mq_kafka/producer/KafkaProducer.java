package com.korfax.simple_mq_kafka.producer;

import com.korfax.simple_mq_kafka.model.SimpleEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaProducer {

    private final KafkaTemplate<Long, SimpleEntity> kafkaStarshipTemplate;

    @Autowired
    public KafkaProducer(KafkaTemplate<Long, SimpleEntity> kafkaStarshipTemplate) {
        this.kafkaStarshipTemplate = kafkaStarshipTemplate;
    }

    public void send(SimpleEntity dto) {
        kafkaStarshipTemplate.send("server.testEntity", dto);
    }

}
