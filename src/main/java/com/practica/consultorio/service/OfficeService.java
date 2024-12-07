package com.practica.consultorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.consultorio.model.entity.Office;
import com.practica.consultorio.model.repository.OfficeRepository;

@Service
public class OfficeService {
	
	@Autowired
    private OfficeRepository officeRepository;

	public Office create(Office office) {
        return officeRepository.save(office);
    }

    public List<Office> getAll() {
        return officeRepository.findAll();
    }

    public Office getById(Long id) {
        return officeRepository.findById(id).orElse(null);
    }

    public Office update(Long id, Office office) {
    	office.setId(id);
        return officeRepository.save(office);
    }

    public void delete(Long id) {
    	officeRepository.deleteById(id);
    }
}