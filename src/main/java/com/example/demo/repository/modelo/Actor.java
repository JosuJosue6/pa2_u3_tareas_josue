package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "actor")
public class Actor {
	
	@Id
	@GeneratedValue(generator = "sec_actor", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "sec_actor", sequenceName = "sec_actor",allocationSize = 1)
	@Column(name = "actr_id")
	private Integer id;
	
	@Column(name = "actr_nombre")
	private String nombre;
	
	@Column(name = "actr_apellido")
	private String apellido;
	
	@Column(name = "actr_edad")
	private Integer edad;
	
	@OneToMany(mappedBy = "actor", cascade = CascadeType.ALL)
	private List<Actua> actuaciones;

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public List<Actua> getActuaciones() {
		return actuaciones;
	}

	public void setActuaciones(List<Actua> actuaciones) {
		this.actuaciones = actuaciones;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
	
}
