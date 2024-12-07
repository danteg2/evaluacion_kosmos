package com.practica.consultorio.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="office")
public class Office {

	public Office(Long id, Integer officeNumber, Integer floorNumber) {
		super();
		this.id = id;
		this.officeNumber = officeNumber;
		this.floorNumber = floorNumber;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="office_number", nullable=false)
	private Integer officeNumber;
	
	@Column(name="floor_number", nullable=false)
	private Integer floorNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(Integer officeNumber) {
		this.officeNumber = officeNumber;
	}

	public Integer getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(Integer floorNumber) {
		this.floorNumber = floorNumber;
	}
}
