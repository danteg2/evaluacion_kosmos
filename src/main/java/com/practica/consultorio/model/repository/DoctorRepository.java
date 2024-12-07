package com.practica.consultorio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.consultorio.model.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
