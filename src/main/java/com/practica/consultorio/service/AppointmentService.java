package com.practica.consultorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.consultorio.model.entity.Appointment;
import com.practica.consultorio.model.repository.AppointmentRepository;

@Service
public class AppointmentService {
	
	@Autowired
    private AppointmentRepository AppointmentRepository;

	public Appointment create(Appointment appointment) {
        return AppointmentRepository.save(appointment);
    }

    public List<Appointment> getAll() {
        return AppointmentRepository.findAll();
    }

    public Appointment getById(Long id) {
        return AppointmentRepository.findById(id).orElse(null);
    }

    public Appointment update(Long id, Appointment appointment) {
    	appointment.setId(id);
        return AppointmentRepository.save(appointment);
    }

    public void delete(Long id) {
    	AppointmentRepository.deleteById(id);
    }
}