package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Actua;

public interface IActuaService {
	
	public void agregar(Actua actua);
	
	public void actualizar(Actua actua);
	
	public Actua buscarPorID(Integer id);
	
	public void borrarPorID(Integer id);
	
	public List<Actua> buscarJoin();
	
	public List<Actua> buscarLeftJoin();
	
	public List<Actua> buscarRightJoin();
	
	public List<Actua> buscarFullJoin();
	
	public List<Actua> buscarWhereJoin();
	
	public List<Actua> buscarJoinFetch();

}
