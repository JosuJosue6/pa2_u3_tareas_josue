package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Actor;

public interface IActorRepository {

	public void insertar(Actor actor);
	
	public void actualizar(Actor actor);
	
	public Actor seleccionarPorID(Integer id);
	
	public void eliminarPorID(Integer id);
	
	public List<Actor> seleccionarJoin();
	
	public List<Actor> seleccionarLeftJoin();
	
	public List<Actor> seleccionarRightJoin();
	
	public List<Actor> seleccionarFullJoin();
	
	public List<Actor> seleccionarWhereJoin();
	
	public List<Actor> seleccionarJoinFetch();
}
