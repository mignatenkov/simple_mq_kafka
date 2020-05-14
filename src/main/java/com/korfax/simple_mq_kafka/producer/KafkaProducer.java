package com.korfax.simple_mq_kafka.producer;

import com.korfax.simple_mq_kafka.model.SimpleEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaProducer {

    private final KafkaTemplate<Long, SimpleEntity> kafkaTemplate;
    private String topicName;

    @Autowired
    public KafkaProducer(KafkaTemplate<Long, SimpleEntity> kafkaTemplate, @Value("kafka.topicName") String topicName) {
        this.kafkaTemplate = kafkaTemplate;
        this.topicName = topicName;
    }

    public void send(SimpleEntity dto) {
        kafkaTemplate.send(topicName, dto);
    }

}
