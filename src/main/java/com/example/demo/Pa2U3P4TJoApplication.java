package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Semestre;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.MateriaService;
import com.example.demo.service.MatriculaService;

@SpringBootApplication
public class Pa2U3P4TJoApplication implements CommandLineRunner {

	/*
	 * @Autowired private IActorService actorService;
	 * 
	 * @Autowired private IActuaService actuaService;
	 * 
	 * @Autowired private IPeliculaService peliculaService;
	 */
	@Autowired
	private MateriaService materiaService;
	
	@Autowired
	private EstudianteService estudianteService;
	
	@Autowired
	private MatriculaService matriculaService;
	
	/*@Autowired
	private ITransferenciaService transferenciaService;

	@Autowired
	private ICuentaBancariaService bancariaService;*/

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4TJoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// Insercion en la DB
		/*
		 * //actores Actor actor1 = new Actor(); actor1.setApellido("Apellido Actor 1");
		 * actor1.setNombre("Nombre Actor 1"); actor1.setEdad(25);
		 * 
		 * Actor actor2 = new Actor(); actor2.setApellido("Apellido Actor 2");
		 * actor2.setNombre("Nombre Actor 2"); actor2.setEdad(15);
		 * 
		 * Actor actor3 = new Actor(); actor3.setApellido("Apellido Actor 3");
		 * actor3.setNombre("Nombre Actor 3"); actor3.setEdad(20);
		 * 
		 * //Peliculas Pelicula pelicula1 = new Pelicula();
		 * pelicula1.setNombre("Pelicula 1"); pelicula1.setClasificacion("A");
		 * 
		 * Pelicula pelicula2 = new Pelicula(); pelicula2.setNombre("Pelicula 2");
		 * pelicula2.setClasificacion("C");
		 * 
		 * Pelicula pelicula3 = new Pelicula(); pelicula3.setNombre("Pelicula 3");
		 * pelicula3.setClasificacion("B");
		 * 
		 * Actua actua1 = new Actua(); actua1.setDesempenio("Bueno");
		 * actua1.setActor(actor1); actua1.setPelicula(pelicula1);
		 * 
		 * Actua actua2 = new Actua(); actua2.setDesempenio("Regular");
		 * actua2.setActor(actor1); actua2.setPelicula(pelicula2);
		 * 
		 * Actua actua3 = new Actua(); actua3.setDesempenio("Malo");
		 * actua3.setActor(actor2); actua3.setPelicula(pelicula3);
		 * 
		 * List<Actua> listaActuacionesA1 = new ArrayList<>();
		 * listaActuacionesA1.add(actua1); listaActuacionesA1.add(actua2);
		 * 
		 * List<Actua> listaActuacionesA2 = new ArrayList<>();
		 * listaActuacionesA2.add(actua3);
		 * 
		 * actor1.setActuaciones(listaActuacionesA1);
		 * actor2.setActuaciones(listaActuacionesA2);
		 * 
		 * this.actorService.agregar(actor1); this.actorService.agregar(actor2);
		 * this.actorService.agregar(actor3);
		 */

		// JOINS Tarea 11

		/*
		 * System.out.println("\nINNER JOIN *****************************************");
		 * 
		 * List<Actor> actoresInner = this.actorService.buscarJoin(); for (Actor actor :
		 * actoresInner) { System.out.println(actor); }
		 * 
		 * System.err.println();
		 * 
		 * List<Pelicula> peliculasInner = this.peliculaService.buscarJoin(); for
		 * (Pelicula pelicula : peliculasInner) { System.out.println(pelicula); }
		 * 
		 * System.err.println();
		 * 
		 * List<Actua> actuaInner = this.actuaService.buscarJoin(); for (Actua pelicula
		 * : actuaInner) { System.out.println(pelicula); }
		 * 
		 * System.out.println("\nLEFT JOIN *****************************************");
		 * 
		 * List<Actor> actoresLJ = this.actorService.buscarLeftJoin(); for (Actor actor
		 * : actoresLJ) { System.out.println(actor); }
		 * 
		 * System.err.println();
		 * 
		 * List<Pelicula> peliculasLJ = this.peliculaService.buscarLeftJoin(); for
		 * (Pelicula pelicula : peliculasLJ) { System.out.println(pelicula); }
		 * 
		 * System.out.println("\nRIGHT JOIN *****************************************");
		 * List<Actor> actoresRJ = this.actorService.buscarRightJoin(); for (Actor actor
		 * : actoresLJ) { System.out.println(actor); }
		 * 
		 * System.err.println();
		 * 
		 * List<Pelicula> peliculasRJ = this.peliculaService.buscarRightJoin(); for
		 * (Pelicula pelicula : peliculasRJ) { System.out.println(pelicula); }
		 * System.out.println("\nFULL JOIN *****************************************");
		 * List<Actor> actoresFJ = this.actorService.buscarFullJoin(); for (Actor actor
		 * : actoresFJ) { System.out.println(actor); }
		 * 
		 * System.err.println();
		 * 
		 * List<Pelicula> peliculasFJ = this.peliculaService.buscarFullJoin(); for
		 * (Pelicula pelicula : peliculasFJ) { System.out.println(pelicula); }
		 * 
		 * System.out.println("\nWHERE JOIN *****************************************");
		 * List<Actor> actoresWJ = this.actorService.buscarWhereJoin(); for (Actor actor
		 * : actoresWJ) { System.out.println(actor); }
		 * 
		 * System.err.println();
		 * 
		 * List<Pelicula> peliculasWJ = this.peliculaService.buscarWhereJoin(); for
		 * (Pelicula pelicula : peliculasWJ) { System.out.println(pelicula); }
		 * 
		 * System.out.println("\nJOIN FETCH *****************************************");
		 * List<Actor> actoresJF = this.actorService.buscarJoinFetch(); for (Actor actor
		 * : actoresJF) { System.out.println(actor); }
		 * 
		 * System.err.println();
		 * 
		 * List<Pelicula> peliculasJF = this.peliculaService.buscarJoinFetch(); for
		 * (Pelicula pelicula : peliculasJF) { System.out.println(pelicula); }
		 */
/*
		// Propietarios
		Propietario propietario1 = new Propietario();
		propietario1.setApellido("Ocapana");
		propietario1.setCedula("1720525516");
		propietario1.setNombre("Josue");

		Propietario propietario2 = new Propietario();
		propietario2.setApellido("Perenguez");
		propietario2.setCedula("1715");
		propietario2.setNombre("Luis");

		// Cuenta Bancaria
		CuentaBancaria bancaria1 = new CuentaBancaria();
		bancaria1.setNumero("111");
		bancaria1.setPropietario(propietario1);
		bancaria1.setSaldo(new BigDecimal(200));
		bancaria1.setTipo("A");

		CuentaBancaria bancaria2 = new CuentaBancaria();
		bancaria2.setNumero("222");
		bancaria2.setPropietario(propietario2);
		bancaria2.setSaldo(new BigDecimal(100));
		bancaria2.setTipo("C");

		this.bancariaService.agregar(bancaria1);
		this.bancariaService.agregar(bancaria2);
		
		System.out.println("\nAntes de la transferencia");
		System.out.println(this.bancariaService.buscarPorNumero("111"));
		System.out.println(this.bancariaService.buscarPorNumero("222"));

		this.transferenciaService.realizarTransferencia("222", "111", new BigDecimal(1));

		System.out.println("\nDespues de la transferencia");
		System.out.println(this.bancariaService.buscarPorNumero("111"));
		System.out.println(this.bancariaService.buscarPorNumero("222"));
		
		System.out.println("\nLista de transferencias");
		List<Transferencia> transferenciaList = this.transferenciaService.buscarTransferenciasPorNumeroCuenta("222");
		for (Transferencia transferencia : transferenciaList) {
			System.out.println(transferencia);
			System.out.println();
		}
		System.out.println();
		*/
		
		//agregar provincia y estudiante
		/*Provincia provincia1 = new Provincia();
		provincia1.setNombre("Pichincha");
		provincia1.setRegion("Sierra");
		provincia1.setCapital("Quito");
		
		
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setApellido("Ocapana");
		estudiante1.setNombre("Josue");
		estudiante1.setCedula("1720525516");
		estudiante1.setProvincia(provincia1);
		
		List<Estudiante>estuP1 = new ArrayList<>();
		estuP1.add(estudiante1);
		
		provincia1.setEstudiantes(estuP1);
		
		this.estudianteService.agregar(estudiante1);*/
		
		//agregar materia y semestre
		/*Semestre semestre1 = new Semestre();
		semestre1.setEstado("matriculado");
		semestre1.setModalidad("Presencial");
		semestre1.setPeriodo("2023-2023");

		Materia materia1 = new Materia();
		materia1.setCodigo("1A");
		materia1.setHorasAcademicas("2");
		materia1.setNombre("PA2");
		materia1.setSemestre(semestre1);
		
		Materia materia2 = new Materia();
		materia2.setCodigo("1B");
		materia2.setHorasAcademicas("4");
		materia2.setNombre("Optimizacion");
		materia2.setSemestre(semestre1);
		
		List<Materia> mM1 = new ArrayList<>();
		mM1.add(materia1);
		mM1.add(materia2);
		
		semestre1.setMaterias(mM1);
		
		this.materiaService.agregar(materia1);*/
		
		List<String>codigosMateria = new ArrayList<>();
		codigosMateria.add("1A");
		codigosMateria.add("1B");
		
		this.matriculaService.matricular("1720525516", codigosMateria);
	}

}
