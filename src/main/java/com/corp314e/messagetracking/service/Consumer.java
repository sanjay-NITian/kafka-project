package com.corp314e.messagetracking.service;

import com.corp314e.messagetracking.filehandler.FileHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
    @KafkaListener(topics= Producer.TOPIC, groupId = "mygroup")
    public void consumeFromTopic(String msg) throws IOException {
        final String PATH = "C:\\Users\\sanjay\\OneDrive\\Desktop\\data.txt";
        FileHandler fileHandler = new FileHandler(PATH);
        fileHandler.append(msg);
    }
}
