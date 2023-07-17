package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Actua;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ActuaRepositoryImpl implements IActuaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Actua actua) {
		// TODO Auto-generated method stub
		this.entityManager.persist(actua);
	}

	@Override
	public void actualizar(Actua actua) {
		// TODO Auto-generated method stub
		this.entityManager.persist(actua);
	}

	@Override
	public Actua seleccionarPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Actua.class,id);
	}

	@Override
	public void eliminarPorID(Integer id) {
		// TODO Auto-generated method stub
		Actua actuaEncontrado = this.seleccionarPorID(id);
		this.entityManager.remove(actuaEncontrado);
	}

	@Override
	public List<Actua> seleccionarJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Actua> myQuery = this.entityManager.createQuery("SELECT a FROM Actua a JOIN a.actor ac",
				Actua.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Actua> seleccionarLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Actua> myQuery = this.entityManager.createQuery("SELECT a FROM Actua a LEFT JOIN a.actor ac",
				Actua.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Actua> seleccionarRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Actua> myQuery = this.entityManager.createQuery("SELECT a FROM Actua a RIGHT JOIN a.actor ac",
				Actua.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Actua> seleccionarFullJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Actua> myQuery = this.entityManager.createQuery("SELECT a FROM Actua a FULL JOIN a.actor ac",
				Actua.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Actua> seleccionarWhereJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Actua> myQuery = this.entityManager.createQuery("SELECT a FROM Actua a, Actor ac WHERE a = ac.actuaciones",
				Actua.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Actua> seleccionarJoinFetch() {
		// TODO Auto-generated method stub
		TypedQuery<Actua> myQuery = this.entityManager.createQuery("SELECT a FROM Actua a JOIN FETCH a.actor ac",
				Actua.class);
		return myQuery.getResultList();
	}

}
