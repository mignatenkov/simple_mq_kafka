package com.korfax.simple_mq_kafka.producer;

import com.korfax.simple_mq_kafka.model.SimpleEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.korfax.simple_mq_kafka.SimpleMqKafkaApplication.TOPIC_NAME;

@Slf4j
@Service
public class KafkaProducer {

    private final KafkaTemplate<Long, SimpleEntity> kafkaTemplate;

    @Autowired
    public KafkaProducer(KafkaTemplate<Long, SimpleEntity> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(SimpleEntity dto) {
        kafkaTemplate.send(TOPIC_NAME, dto);
    }

}
