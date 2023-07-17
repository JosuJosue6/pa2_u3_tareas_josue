package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Actor;
import com.example.demo.repository.modelo.Actua;
import com.example.demo.repository.modelo.Pelicula;
import com.example.demo.service.IActorService;
import com.example.demo.service.IActuaService;
import com.example.demo.service.IPeliculaService;

@SpringBootApplication
public class Pa2U3P4TJoApplication implements CommandLineRunner {
	
	@Autowired
	private IActorService actorService;
	
	@Autowired
	private IActuaService actuaService;
	
	@Autowired
	private IPeliculaService peliculaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4TJoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		//Insercion en la DB
		/*
		//actores
		Actor actor1 = new Actor();
		actor1.setApellido("Apellido Actor 1");
		actor1.setNombre("Nombre Actor 1");
		actor1.setEdad(25);
		
		Actor actor2 = new Actor();
		actor2.setApellido("Apellido Actor 2");
		actor2.setNombre("Nombre Actor 2");
		actor2.setEdad(15);
		
		Actor actor3 = new Actor();
		actor3.setApellido("Apellido Actor 3");
		actor3.setNombre("Nombre Actor 3");
		actor3.setEdad(20);
		
		//Peliculas
		Pelicula pelicula1 = new Pelicula();
		pelicula1.setNombre("Pelicula 1");
		pelicula1.setClasificacion("A");
		
		Pelicula pelicula2 = new Pelicula();
		pelicula2.setNombre("Pelicula 2");
		pelicula2.setClasificacion("C");
		
		Pelicula pelicula3 = new Pelicula();
		pelicula3.setNombre("Pelicula 3");
		pelicula3.setClasificacion("B");
		
		Actua actua1 = new Actua();
		actua1.setDesempenio("Bueno");
		actua1.setActor(actor1);
		actua1.setPelicula(pelicula1);
		
		Actua actua2 = new Actua();
		actua2.setDesempenio("Regular");
		actua2.setActor(actor1);
		actua2.setPelicula(pelicula2);
		
		Actua actua3 = new Actua();
		actua3.setDesempenio("Malo");
		actua3.setActor(actor2);
		actua3.setPelicula(pelicula3);
		
		List<Actua> listaActuacionesA1 = new ArrayList<>();
		listaActuacionesA1.add(actua1);
		listaActuacionesA1.add(actua2);
		
		List<Actua> listaActuacionesA2 = new ArrayList<>();
		listaActuacionesA2.add(actua3);
	
		actor1.setActuaciones(listaActuacionesA1);
		actor2.setActuaciones(listaActuacionesA2);
		
		this.actorService.agregar(actor1);
		this.actorService.agregar(actor2);
		this.actorService.agregar(actor3);*/
		
		//JOINS Tarea 11
		
		System.out.println("\nINNER JOIN *****************************************");
		
		List<Actor> actoresInner = this.actorService.buscarJoin();
		for (Actor actor : actoresInner) {
			System.out.println(actor);
		}
		
		System.err.println();
		
		List<Pelicula> peliculasInner = this.peliculaService.buscarJoin();
		for (Pelicula pelicula : peliculasInner) {
			System.out.println(pelicula);
		}
		
		System.err.println();
		
		List<Actua> actuaInner = this.actuaService.buscarJoin();
		for (Actua pelicula : actuaInner) {
			System.out.println(pelicula);
		}
		
		System.out.println("\nLEFT JOIN *****************************************");
		
		List<Actor> actoresLJ = this.actorService.buscarLeftJoin();
		for (Actor actor : actoresLJ) {
			System.out.println(actor);
		}
		
		System.err.println();
		
		List<Pelicula> peliculasLJ = this.peliculaService.buscarLeftJoin();
		for (Pelicula pelicula : peliculasLJ) {
			System.out.println(pelicula);
		}
		
		System.out.println("\nRIGHT JOIN *****************************************");
		List<Actor> actoresRJ = this.actorService.buscarRightJoin();
		for (Actor actor : actoresLJ) {
			System.out.println(actor);
		}
		
		System.err.println();
		
		List<Pelicula> peliculasRJ = this.peliculaService.buscarRightJoin();
		for (Pelicula pelicula : peliculasRJ) {
			System.out.println(pelicula);
		}
		System.out.println("\nFULL JOIN *****************************************");
		List<Actor> actoresFJ = this.actorService.buscarFullJoin();
		for (Actor actor : actoresFJ) {
			System.out.println(actor);
		}
		
		System.err.println();
		
		List<Pelicula> peliculasFJ = this.peliculaService.buscarFullJoin();
		for (Pelicula pelicula : peliculasFJ) {
			System.out.println(pelicula);
		}
		
		System.out.println("\nWHERE JOIN *****************************************");
		List<Actor> actoresWJ = this.actorService.buscarWhereJoin();
		for (Actor actor : actoresWJ) {
			System.out.println(actor);
		}
		
		System.err.println();
		
		List<Pelicula> peliculasWJ = this.peliculaService.buscarWhereJoin();
		for (Pelicula pelicula : peliculasWJ) {
			System.out.println(pelicula);
		}
		
		System.out.println("\nJOIN FETCH *****************************************");
		List<Actor> actoresJF = this.actorService.buscarJoinFetch();
		for (Actor actor : actoresJF) {
			System.out.println(actor);
		}
		
		System.err.println();
		
		List<Pelicula> peliculasJF = this.peliculaService.buscarJoinFetch();
		for (Pelicula pelicula : peliculasJF) {
			System.out.println(pelicula);
		}
	}


}
