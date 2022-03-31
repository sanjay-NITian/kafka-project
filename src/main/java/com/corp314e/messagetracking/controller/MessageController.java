package com.corp314e.messagetracking.controller;

import com.corp314e.messagetracking.services.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MessageController {

    @Autowired
    ProducerService producer;

    @GetMapping("/get")
    public String getPatient(){
        return "abc";
    }

    @PostMapping("/send")
    public void registerUser(@RequestBody String msg) {
        producer.publishToTopic(msg);

    }
}

