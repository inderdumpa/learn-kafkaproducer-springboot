package com.kafkaproducer.dev.config;

import com.kafkaproducer.dev.model.Person;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaAppConfig {
    @Bean
    public ProducerFactory<String, Person> producerFactory(){
        Map<String, Object> kafkaConfig = new HashMap<>();

        kafkaConfig.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        kafkaConfig.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        kafkaConfig.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        return new DefaultKafkaProducerFactory<>(kafkaConfig);
    }

    @Bean
    public KafkaTemplate<String, Person> kafkaTemplate(){
        return new KafkaTemplate<>(producerFactory());
    }
}
