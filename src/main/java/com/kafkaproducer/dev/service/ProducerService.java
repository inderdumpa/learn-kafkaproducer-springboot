package com.kafkaproducer.dev.service;

import com.kafkaproducer.dev.model.Person;

public interface ProducerService {
    public String emitMessage(Person person);
}
