package com.korfax.simple_mq_kafka.service;

import com.korfax.simple_mq_kafka.model.SimpleEntity;
import com.korfax.simple_mq_kafka.producer.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Slf4j
@Service
public class MainScheduledService {

    private KafkaProducer producer;

    @Autowired
    public MainScheduledService(KafkaProducer producer) {
        this.producer = producer;
    }

    @Scheduled(initialDelay = 5000, fixedDelay = 5000)
    public void produce() {
        SimpleEntity dto = new SimpleEntity("se_" + LocalTime.now());
        log.info("<= sending {}", dto.toString());
        producer.send(dto);
    }

}
