package com.practica.consultorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.consultorio.model.entity.Patient;
import com.practica.consultorio.service.PatientService;

@RestController
@RequestMapping("/api/v1")
public class PatientController {

	@Autowired
	private PatientService patientService;

    @GetMapping("patients")
    public List<Patient> getAll() {
        return patientService.getAll();
    }
    
	@PostMapping("patient")
	public void create(@RequestBody Patient patient) {
		patientService.create(patient);		
	}
	
	@GetMapping("patient/{id}")
	public Patient getById(@PathVariable Long id) {
		return patientService.getById(id);
	}
	
	@PutMapping("patient/{id}")
	public Patient update(@PathVariable Long id, @RequestBody Patient patient) {
		return patientService.update(id, patient);
	}
	
	@DeleteMapping("patient/{id}")
	public void delete(@PathVariable Long id) {
		patientService.delete(id);
	}
}
