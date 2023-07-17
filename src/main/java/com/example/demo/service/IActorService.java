package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Actor;

public interface IActorService {

	public void agregar(Actor actor);
	
	public void actualizar(Actor actor);
	
	public Actor buscarPorID(Integer id);
	
	public void borrarPorID(Integer id);
	
	public List<Actor> buscarJoin();
	
	public List<Actor> buscarLeftJoin();
	
	public List<Actor> buscarRightJoin();
	
	public List<Actor> buscarFullJoin();
	
	public List<Actor> buscarWhereJoin();
	
	public List<Actor> buscarJoinFetch();
}
