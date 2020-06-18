package com.kafkaproducer.dev.controller;

import com.kafkaproducer.dev.model.Person;
import com.kafkaproducer.dev.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
    ProducerService producerService;

    @Autowired
    public MessageController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/produce")
    public String savePerson( @RequestBody Person person){
        return producerService.emitMessage(person);
    }

}
