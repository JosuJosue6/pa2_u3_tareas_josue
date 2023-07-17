package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IActorRepository;
import com.example.demo.repository.modelo.Actor;

@Service
public class ActorServiceImpl implements IActorService{

	@Autowired
	private IActorRepository actorRepository;
	
	@Override
	public void agregar(Actor actor) {
		// TODO Auto-generated method stub
		this.actorRepository.insertar(actor);
	}

	@Override
	public void actualizar(Actor actor) {
		// TODO Auto-generated method stub
		this.actorRepository.actualizar(actor);
	}

	@Override
	public Actor buscarPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.actorRepository.seleccionarPorID(id);
	}

	@Override
	public void borrarPorID(Integer id) {
		// TODO Auto-generated method stub
		this.actorRepository.eliminarPorID(id);
	}

	@Override
	public List<Actor> buscarJoin() {
		// TODO Auto-generated method stub
		return this.actorRepository.seleccionarJoin();
	}

	@Override
	public List<Actor> buscarLeftJoin() {
		// TODO Auto-generated method stub
		return this.actorRepository.seleccionarLeftJoin();
	}

	@Override
	public List<Actor> buscarRightJoin() {
		// TODO Auto-generated method stub
		return this.actorRepository.seleccionarRightJoin();
	}

	@Override
	public List<Actor> buscarFullJoin() {
		// TODO Auto-generated method stub
		return this.actorRepository.seleccionarFullJoin();
	}

	@Override
	public List<Actor> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.actorRepository.seleccionarWhereJoin();
	}

	@Override
	public List<Actor> buscarJoinFetch() {
		// TODO Auto-generated method stub
		return this.actorRepository.seleccionarJoinFetch();
	}

}
