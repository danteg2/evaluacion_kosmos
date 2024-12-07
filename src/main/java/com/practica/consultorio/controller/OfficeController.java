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

import com.practica.consultorio.model.entity.Office;
import com.practica.consultorio.service.OfficeService;

@RestController
@RequestMapping("/api/v1")
public class OfficeController {

	@Autowired
	private OfficeService officeService;

    @GetMapping("offices")
    public List<Office> getAll() {
        return officeService.getAll();
    }
    
	@PostMapping("office")
	public void create(@RequestBody Office office) {
		officeService.create(office);		
	}
	
	@GetMapping("office/{id}")
	public Office getById(@PathVariable Long id) {
		return officeService.getById(id);
	}
	
	@PutMapping("office/{id}")
	public Office update(@PathVariable Long id, @RequestBody Office office) {
		return officeService.update(id, office);
	}
	
	@DeleteMapping("office/{id}")
	public void delete(@PathVariable Long id) {
		officeService.delete(id);
	}
}