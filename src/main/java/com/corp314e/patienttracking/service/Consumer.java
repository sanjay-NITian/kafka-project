package com.corp314e.patienttracking.service;

import com.corp314e.patienttracking.filehandler.FileHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
    @KafkaListener(topics="test", groupId = "mygroup")
    public void consumeFromTopic(String msg) throws IOException {
//        System.out.println("Consumed message : " + msg);
        FileHandler fileHandler = new FileHandler("C:\\Users\\sanjay\\OneDrive\\Desktop\\data.txt");
        fileHandler.append(msg);
    }
}
