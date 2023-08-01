package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MetodosReferenciados {
	
	private static final Logger LOG = LoggerFactory.getLogger(MetodosReferenciados.class);
	
	//Supplier
	public Integer getId() {
		
		return 8;
	}
	
	//Consumer
	public void aceptar(String arg) {
		
		String cadena = "Equipo";
		LOG.info(cadena+ " "+ arg);
		
	}
	
	//Predicate
	public boolean evaluacion(Integer arg) {
		Integer numero =10;
		boolean cumple = false;
		
		if (numero.compareTo(arg)==0) {
			
			cumple = true;
		}
		
		return cumple;
	}
	
	//FUNCTION
	public String aplicar(Integer arg) {
		
		return arg.toString().concat(" cambio a string");
	}

	//UNARY OPERATOR
	public Integer aplicarUO(Integer arg) {
		return arg * 100;
	}
}
