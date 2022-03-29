package com.corp314e.patienttracking.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics="test", groupId = "mygroup")
    public void consumeFromTopic(String msg){
        System.out.println("Consumed message : " + msg);
    }
}
