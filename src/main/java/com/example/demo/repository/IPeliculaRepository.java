package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Pelicula;

public interface IPeliculaRepository {

	public void insertar(Pelicula pelicula);
	
	public void actualizar(Pelicula pelicula);
	
	public Pelicula seleccionarPorID(Integer id);
	
	public void eliminarPorID(Integer id);
	
	public List<Pelicula> seleccionarJoin();
	
	public List<Pelicula> seleccionarLeftJoin();
	
	public List<Pelicula> seleccionarRightJoin();
	
	public List<Pelicula> seleccionarFullJoin();
	
	public List<Pelicula> seleccionarWhereJoin();
	
	public List<Pelicula> seleccionarJoinFetch();
}
