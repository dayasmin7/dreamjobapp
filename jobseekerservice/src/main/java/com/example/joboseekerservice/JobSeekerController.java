package com.example.joboseekerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobseeker")
public class JobSeekerController {
    @Autowired
    private JobSeekerService jobSeekerService;

    @PostMapping("/register")
    public ResponseEntity<JobSeeker> registerJobSeeker(@RequestBody JobSeeker jobSeeker) {
        return new ResponseEntity<>(jobSeekerService.registerJobSeeker(jobSeeker), HttpStatus.CREATED);
    }
}