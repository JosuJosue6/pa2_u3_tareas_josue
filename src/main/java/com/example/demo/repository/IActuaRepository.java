package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Actua;

public interface IActuaRepository {

	public void insertar(Actua actua);
	
	public void actualizar(Actua actua);
	
	public Actua seleccionarPorID(Integer id);
	
	public void eliminarPorID(Integer id);
	
	public List<Actua> seleccionarJoin();
	
	public List<Actua> seleccionarLeftJoin();
	
	public List<Actua> seleccionarRightJoin();
	
	public List<Actua> seleccionarFullJoin();
	
	public List<Actua> seleccionarWhereJoin();
	
	public List<Actua> seleccionarJoinFetch();
}
