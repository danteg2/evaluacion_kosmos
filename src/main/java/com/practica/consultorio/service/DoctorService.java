package com.practica.consultorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.consultorio.model.entity.Doctor;
import com.practica.consultorio.model.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
    private DoctorRepository doctorRepository;

	public Doctor create(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }

    public Doctor getById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    public Doctor update(Long id, Doctor doctor) {
        doctor.setId(id);
        return doctorRepository.save(doctor);
    }

    public void delete(Long id) {
    	doctorRepository.deleteById(id);
    }
}
