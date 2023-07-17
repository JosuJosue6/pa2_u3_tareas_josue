package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Actor;
import com.example.demo.repository.modelo.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PeliculaRepositoryImpl implements IPeliculaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pelicula);
	}

	@Override
	public void actualizar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.entityManager.merge(pelicula);
	}

	@Override
	public Pelicula seleccionarPorID(Integer id) {
		// TODO Auto-generated method stub
		
		return this.entityManager.find(Pelicula.class,id);
	}

	@Override
	public void eliminarPorID(Integer id) {
		// TODO Auto-generated method stub
		Pelicula peliculaEncontrada = this.seleccionarPorID(id);
		this.entityManager.remove(peliculaEncontrada);
		
	}

	@Override
	public List<Pelicula> seleccionarJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Pelicula> myQuery = this.entityManager.createQuery("SELECT p FROM Pelicula p JOIN p.actuaciones ac",
				Pelicula.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Pelicula> seleccionarLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Pelicula> myQuery = this.entityManager.createQuery("SELECT p FROM Pelicula p LEFT JOIN p.actuaciones ac",
				Pelicula.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Pelicula> seleccionarRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Pelicula> myQuery = this.entityManager.createQuery("SELECT p FROM Pelicula p RIGHT JOIN p.actuaciones ac",
				Pelicula.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Pelicula> seleccionarFullJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Pelicula> myQuery = this.entityManager.createQuery("SELECT p FROM Pelicula p FULL JOIN p.actuaciones ac",
				Pelicula.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Pelicula> seleccionarWhereJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Pelicula> myQuery = this.entityManager.createQuery("SELECT p FROM Pelicula p, Actua ac WHERE p = ac.pelicula",
				Pelicula.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Pelicula> seleccionarJoinFetch() {
		// TODO Auto-generated method stub
		TypedQuery<Pelicula> myQuery = this.entityManager.createQuery("SELECT p FROM Pelicula p JOIN FETCH p.actuaciones ac",
				Pelicula.class);
		return myQuery.getResultList();
	}

}
