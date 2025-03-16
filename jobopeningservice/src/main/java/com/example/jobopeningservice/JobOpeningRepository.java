package com.example.jobopeningservice;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface JobOpeningRepository extends JpaRepository<JobOpening, Long>{

}
