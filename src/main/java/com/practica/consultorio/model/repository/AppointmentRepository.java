package com.practica.consultorio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.consultorio.model.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
