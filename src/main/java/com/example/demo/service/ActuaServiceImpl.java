package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IActuaRepository;
import com.example.demo.repository.modelo.Actua;

@Service
public class ActuaServiceImpl implements IActuaService{

	@Autowired
	private IActuaRepository actuaRepository;
	
	@Override
	public void agregar(Actua actua) {
		// TODO Auto-generated method stub
		this.actuaRepository.insertar(actua);
	}

	@Override
	public void actualizar(Actua actua) {
		// TODO Auto-generated method stub
		this.actuaRepository.actualizar(actua);
	}

	@Override
	public Actua buscarPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.actuaRepository.seleccionarPorID(id);
	}

	@Override
	public void borrarPorID(Integer id) {
		// TODO Auto-generated method stub
		this.actuaRepository.eliminarPorID(id);
	}

	@Override
	public List<Actua> buscarJoin() {
		// TODO Auto-generated method stub
		return this.actuaRepository.seleccionarJoin();
	}

	@Override
	public List<Actua> buscarLeftJoin() {
		// TODO Auto-generated method stub
		return this.actuaRepository.seleccionarLeftJoin();
	}

	@Override
	public List<Actua> buscarRightJoin() {
		// TODO Auto-generated method stub
		return this.actuaRepository.seleccionarRightJoin();
	}

	@Override
	public List<Actua> buscarFullJoin() {
		// TODO Auto-generated method stub
		return this.actuaRepository.seleccionarFullJoin();
	}

	@Override
	public List<Actua> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.actuaRepository.seleccionarWhereJoin();
	}

	@Override
	public List<Actua> buscarJoinFetch() {
		// TODO Auto-generated method stub
		return this.actuaRepository.seleccionarJoinFetch();
	}

}
