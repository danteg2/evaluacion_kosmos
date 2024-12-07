package com.practica.consultorio.model.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="doctor")
public class Doctor extends Person {

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(Long id, String name, String firstName, String lastName, String specialty,
			List<Appointment> appointment) {
		super(id, name, firstName, lastName);
		this.specialty = specialty;
		this.appointment = appointment;
	}

	@Column(nullable=false, length=80)
	private String specialty;
	
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Appointment> appointment;

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

}
