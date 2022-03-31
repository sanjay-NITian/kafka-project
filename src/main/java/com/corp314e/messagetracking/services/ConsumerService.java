package com.corp314e.messagetracking.services;

import java.io.IOException;

public interface ConsumerService {
    void consumeFromTopic(String msg) throws IOException;
}
