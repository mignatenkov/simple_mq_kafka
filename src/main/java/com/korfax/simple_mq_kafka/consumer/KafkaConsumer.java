package com.korfax.simple_mq_kafka.consumer;

import com.korfax.simple_mq_kafka.model.SimpleEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.korfax.simple_mq_kafka.SimpleMqKafkaApplication.TOPIC_NAME;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(id = "SimpleEntity", topics = {TOPIC_NAME}, containerFactory = "singleFactory")
    public void consume(SimpleEntity dto) {
        log.info("=> consumed {}", dto.toString());
    }

}
