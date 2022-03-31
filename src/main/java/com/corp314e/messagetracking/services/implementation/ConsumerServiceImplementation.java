package com.corp314e.messagetracking.services.implementation;

import com.corp314e.messagetracking.services.ConsumerService;
import com.corp314e.messagetracking.utilities.FileHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConsumerServiceImplementation implements ConsumerService {

    @KafkaListener(topics = ProducerServiceImplementation.TOPIC, groupId = "mygroup")
    public void consumeFromTopic(String msg) throws IOException {
        final String PATH = "C:\\Users\\sanjay\\OneDrive\\Desktop\\data.txt";
        FileHandler fileHandler = new FileHandler(PATH);
        fileHandler.append(msg);
    }
}
