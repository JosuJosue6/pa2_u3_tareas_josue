package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Pelicula;

public interface IPeliculaService {

	public void agregar(Pelicula pelicula);
	
	public void actualizar(Pelicula pelicula);
	
	public Pelicula buscarPorID(Integer id);
	
	public void borrarPorID(Integer id);
	
	public List<Pelicula> buscarJoin();
	
	public List<Pelicula> buscarLeftJoin();
	
	public List<Pelicula> buscarRightJoin();
	
	public List<Pelicula> buscarFullJoin();
	
	public List<Pelicula> buscarWhereJoin();
	
	public List<Pelicula> buscarJoinFetch();
	
}
