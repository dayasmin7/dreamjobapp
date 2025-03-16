package com.example.jobapplicationservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
	List<JobApplication> findByJobSeekerId(Long jobSeekerId);
}
