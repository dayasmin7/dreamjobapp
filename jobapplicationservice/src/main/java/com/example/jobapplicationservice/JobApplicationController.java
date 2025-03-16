package com.example.jobapplicationservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application")
public class JobApplicationController {
    @Autowired
    private JobApplicationService jobApplicationService;

    @PostMapping("/apply")
    public ResponseEntity<JobApplication> applyForJob(@RequestBody JobApplication application) {
        return new ResponseEntity<>(jobApplicationService.applyForJob(application), HttpStatus.CREATED);
    }

    @GetMapping("/status/{jobSeekerId}")
    public ResponseEntity<List<JobApplication>> getApplications(@PathVariable Long jobSeekerId) {
        return ResponseEntity.ok(jobApplicationService.getApplicationsByJobSeeker(jobSeekerId));
    }
}