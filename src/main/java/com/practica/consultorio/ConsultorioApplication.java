package com.practica.consultorio;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.practica.consultorio.model.entity.Doctor;
import com.practica.consultorio.model.entity.Office;
import com.practica.consultorio.model.entity.Patient;
import com.practica.consultorio.model.repository.DoctorRepository;
import com.practica.consultorio.model.repository.OfficeRepository;
import com.practica.consultorio.model.repository.PatientRepository;

@SpringBootApplication
public class ConsultorioApplication {

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private OfficeRepository officeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ConsultorioApplication.class, args);
	}
	
	@Bean
	InitializingBean sendDatabase() {
	    return () -> {
	    	doctorRepository.save(new Doctor(null, "Manuel", "Cabrera", "Sanchez", "Ginecologia", null));
	    	doctorRepository.save(new Doctor(null, "Juan", "Guzman", "", "Cardiologia", null));
	    	doctorRepository.save(new Doctor(null, "Pedro", "Rios", "Lopez", "Urologia", null));
	    	doctorRepository.save(new Doctor(null, "Luisa", "Cruz", "Garcia", "Ginecologia", null));
	    	
	    	patientRepository.save(new Patient(null, "Maria", "Hernadez", "Sanchez"));
	    	patientRepository.save(new Patient(null, "Cristina", "Perez", "Cruz"));
	    	patientRepository.save(new Patient(null, "Jose", "Guzman", "Lopez"));
	    	
	    	officeRepository.save(new Office(null, 1,1));
	    	officeRepository.save(new Office(null, 1,2));
	    	officeRepository.save(new Office(null, 1,3));
	    	officeRepository.save(new Office(null, 2,4));
	    	officeRepository.save(new Office(null, 2,5));
	      };
	   }

}
