package com.example.employerservice;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long>{

}
