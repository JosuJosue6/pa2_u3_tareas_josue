package com.example.demo.repository.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "actua")
public class Actua {

	@Id
	@GeneratedValue(generator = "sec_actua", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "sec_actua", sequenceName = "sec_actua",allocationSize = 1)
	@Column(name = "actu_id")
	private Integer id;
	
	@Column(name = "actu_desempenio")
	private String desempenio;
	
	@ManyToOne
	@JoinColumn(name = "actu_id_actor")
	private Actor actor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "actu_id_pelicula")
	private Pelicula pelicula;

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesempenio() {
		return desempenio;
	}

	public void setDesempenio(String desempenio) {
		this.desempenio = desempenio;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Actua [id=" + id + ", desempenio=" + desempenio + ", actor=" + actor + ", pelicula=" + pelicula + "]";
	}
}
