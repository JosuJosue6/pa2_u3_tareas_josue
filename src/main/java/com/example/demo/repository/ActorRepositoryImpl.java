package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Actor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ActorRepositoryImpl implements IActorRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Actor actor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(actor);
	}

	@Override
	public void actualizar(Actor actor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(actor);
	}

	@Override
	public Actor seleccionarPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Actor.class, id);
	}

	@Override
	public void eliminarPorID(Integer id) {
		// TODO Auto-generated method stub
		Actor actorEncontrado = this.seleccionarPorID(id);
		this.entityManager.remove(actorEncontrado);
	}

	@Override
	public List<Actor> seleccionarJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Actor> myQuery = this.entityManager.createQuery("SELECT a FROM Actor a JOIN a.actuaciones ac",
				Actor.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Actor> seleccionarLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Actor> myQuery = this.entityManager.createQuery("SELECT a FROM Actor a LEFT JOIN a.actuaciones ac",
				Actor.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Actor> seleccionarRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Actor> myQuery = this.entityManager.createQuery("SELECT a FROM Actor a RIGHT JOIN a.actuaciones ac",
				Actor.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Actor> seleccionarFullJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Actor> myQuery = this.entityManager.createQuery("SELECT a FROM Actor a FULL JOIN a.actuaciones ac",
				Actor.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Actor> seleccionarWhereJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Actor> myQuery = this.entityManager.createQuery("SELECT a FROM Actor a, Actua ac WHERE a = ac.actor",
				Actor.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Actor> seleccionarJoinFetch() {
		// TODO Auto-generated method stub
		TypedQuery<Actor> myQuery = this.entityManager.createQuery("SELECT a FROM Actor a JOIN FETCH a.actuaciones ac",
				Actor.class);
		return myQuery.getResultList();
	}

}
