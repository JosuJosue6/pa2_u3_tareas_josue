package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula {

	@Id
	@GeneratedValue(generator = "sec_pelicula", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "sec_pelicula", sequenceName = "sec_pelicula",allocationSize = 1)
	@Column(name = "peli_id")
	private Integer id;
	
	@Column(name = "peli_nombre")
	private String nombre;
	
	@Column(name = "peli_clasificacion")
	private String clasificacion;
	
	@OneToMany(mappedBy = "pelicula")
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

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public List<Actua> getActuaciones() {
		return actuaciones;
	}

	public void setActuaciones(List<Actua> actuaciones) {
		this.actuaciones = actuaciones;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", clasificacion=" + clasificacion + "]";
	}
	
	
}
