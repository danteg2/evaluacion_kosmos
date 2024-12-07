package com.practica.consultorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.consultorio.model.entity.Patient;
import com.practica.consultorio.model.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
    private PatientRepository patientRepository;

	public Patient create(Patient patient) {
        return patientRepository.save(patient);
    }

    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    public Patient getById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    public Patient update(Long id, Patient patient) {
    	patient.setId(id);
        return patientRepository.save(patient);
    }

    public void delete(Long id) {
    	patientRepository.deleteById(id);
    }
}