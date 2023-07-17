package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPeliculaRepository;
import com.example.demo.repository.modelo.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService {

	@Autowired
	private IPeliculaRepository peliculaRepository;
	
	@Override
	public void agregar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.peliculaRepository.insertar(pelicula);
	}

	@Override
	public void actualizar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.peliculaRepository.actualizar(pelicula);
	}

	@Override
	public Pelicula buscarPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.peliculaRepository.seleccionarPorID(id);
	}

	@Override
	public void borrarPorID(Integer id) {
		// TODO Auto-generated method stub
		this.peliculaRepository.eliminarPorID(id);
	}

	@Override
	public List<Pelicula> buscarJoin() {
		// TODO Auto-generated method stub
		return this.peliculaRepository.seleccionarJoin();
	}

	@Override
	public List<Pelicula> buscarLeftJoin() {
		// TODO Auto-generated method stub
		return this.peliculaRepository.seleccionarLeftJoin();
	}

	@Override
	public List<Pelicula> buscarRightJoin() {
		// TODO Auto-generated method stub
		return this.peliculaRepository.seleccionarRightJoin();
	}

	@Override
	public List<Pelicula> buscarFullJoin() {
		// TODO Auto-generated method stub
		return this.peliculaRepository.seleccionarFullJoin();
	}

	@Override
	public List<Pelicula> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.peliculaRepository.seleccionarWhereJoin();
	}

	@Override
	public List<Pelicula> buscarJoinFetch() {
		// TODO Auto-generated method stub
		return this.peliculaRepository.seleccionarJoinFetch();
	}

}
