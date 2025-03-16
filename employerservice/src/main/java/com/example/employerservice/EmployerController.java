package com.example.employerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employers")
public class EmployerController {

    @Autowired
    private EmployerRepository employerRepository;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public Employer registerEmployer(@RequestBody Employer employer) {
        return employerRepository.save(employer);
    }

    @PostMapping("/{employerId}/jobs")
    public void postJobOpening(@PathVariable Long employerId, @RequestBody String jobOpeningJson) {
        // Validation and creation of JobOpening object
        kafkaTemplate.send("job-openings", jobOpeningJson);
    }
    // ... other endpoints
}