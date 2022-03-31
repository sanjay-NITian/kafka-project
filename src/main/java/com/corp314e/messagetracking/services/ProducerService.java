package com.corp314e.messagetracking.services;

public interface ProducerService {
    void publishToTopic(String msg);
}
