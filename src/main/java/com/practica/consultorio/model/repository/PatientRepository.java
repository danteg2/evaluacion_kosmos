package com.practica.consultorio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.consultorio.model.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}

