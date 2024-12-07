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

import com.practica.consultorio.model.entity.Doctor;
import com.practica.consultorio.service.DoctorService;

@RestController
@RequestMapping("/api/v1")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;

    @GetMapping("doctors")
    public List<Doctor> getAll() {
        return doctorService.getAll();
    }
    
	@PostMapping("doctor")
	public void create(@RequestBody Doctor doctor) {
		doctorService.create(doctor);		
	}
	
	@GetMapping("doctor/{id}")
	public Doctor getById(@PathVariable Long id) {
		return doctorService.getById(id);
	}
	
	@PutMapping("doctor/{id}")
	public Doctor updateUser(@PathVariable Long id, @RequestBody Doctor doctor) {
		return doctorService.update(id, doctor);
	}
	
	@DeleteMapping("doctor/{id}")
	public void delete(@PathVariable Long id) {
		doctorService.delete(id);
	}	

}
