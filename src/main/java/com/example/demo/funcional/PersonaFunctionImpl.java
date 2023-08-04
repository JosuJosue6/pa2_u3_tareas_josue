package com.example.demo.funcional;

public class PersonaFunctionImpl implements IPersonaFunction<String, Integer>{

	@Override
	public String aplicar(Integer arg) {
		// TODO Auto-generated method stub
		String cadenaFin = "Cadena con el numero: "+arg.toString();
		return cadenaFin;
	}



}
