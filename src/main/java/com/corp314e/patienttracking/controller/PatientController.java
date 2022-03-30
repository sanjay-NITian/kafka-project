package com.corp314e.patienttracking.controller;

import com.corp314e.patienttracking.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PatientController {

    @Autowired
    Producer producer;

    @GetMapping("/getpatient")
    public String getPatient(){
        return "abc";
    }

    @PostMapping("/postpatient")
    public void registerUser(@RequestBody String msg) {
        producer.publishToTopic(msg);

    }
}
