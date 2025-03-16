package com.example.employerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerService {
    @Autowired
    private EmployerRepository employerRepository;

    public Employer registerEmployer(Employer employer) {
        return employerRepository.save(employer);
    }
}