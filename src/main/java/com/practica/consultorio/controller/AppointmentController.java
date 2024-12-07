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

import com.practica.consultorio.model.entity.Appointment;
import com.practica.consultorio.service.AppointmentService;

@RestController
@RequestMapping("/api/v1")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;

    @GetMapping("appointments")
    public List<Appointment> getAll() {
        return appointmentService.getAll();
    }
    
	@PostMapping("appointment")
	public void create(@RequestBody Appointment appointment) {
		appointmentService.create(appointment);		
	}
	
	@GetMapping("appointment/{id}")
	public Appointment getById(@PathVariable Long id) {
		return appointmentService.getById(id);
	}
	
	@PutMapping("appointment/{id}")
	public Appointment update(@PathVariable Long id, @RequestBody Appointment appointment) {
		return appointmentService.update(id, appointment);
	}
	
	@DeleteMapping("appointment/{id}")
	public void delete(@PathVariable Long id) {
		appointmentService.delete(id);
	}
}