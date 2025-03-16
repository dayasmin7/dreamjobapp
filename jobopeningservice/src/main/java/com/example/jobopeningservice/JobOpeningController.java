package com.example.jobopeningservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job-openings")
public class JobOpeningController {

    @Autowired
    private JobOpeningRepository jobOpeningRepository;

    @GetMapping
    public Iterable<JobOpening> getAllJobOpenings() {
        return jobOpeningRepository.findAll();
    }

    // ... other endpoints for search, filter, delete
}
