package com.kafkaproducer.dev.service;

import com.kafkaproducer.dev.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {
    @Autowired
    private KafkaTemplate<String, Person> kafkaTemplate;
    private static final String TOPIC = "EXAMPLE_TOPIC";
    @Override
    public String emitMessage(Person person) {
        kafkaTemplate.send(TOPIC, person);
        return "Message Published";
    }
}
