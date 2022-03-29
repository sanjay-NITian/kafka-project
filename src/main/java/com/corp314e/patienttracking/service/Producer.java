package com.corp314e.patienttracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    public static final String TOPIC = "test";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemp;

    public void publishToTopic(String msg){
        System.out.println("Publishing to topic: " + TOPIC);
        this.kafkaTemp.send(TOPIC, msg);
    }

}
