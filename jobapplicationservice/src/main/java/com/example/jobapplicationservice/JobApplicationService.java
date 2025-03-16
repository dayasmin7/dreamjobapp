package com.example.jobapplicationservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobApplicationService {
    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    public JobApplication applyForJob(JobApplication application) {
        return jobApplicationRepository.save(application);
    }

    public List<JobApplication> getApplicationsByJobSeeker(Long jobSeekerId) {
        return jobApplicationRepository.findByJobSeekerId(jobSeekerId);
    }
}
