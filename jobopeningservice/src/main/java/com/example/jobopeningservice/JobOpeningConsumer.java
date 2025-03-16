package com.example.jobopeningservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class JobOpeningConsumer {

    @Autowired
    private JobOpeningRepository jobOpeningRepository;

    @KafkaListener(topics = "job-openings", groupId = "job-openings-group")
    public void consumeJobOpening(String jobOpeningJson) {
        // Parse JSON, create JobOpening object, and save to database
        // jobOpeningRepository.save(...);
    }
}
