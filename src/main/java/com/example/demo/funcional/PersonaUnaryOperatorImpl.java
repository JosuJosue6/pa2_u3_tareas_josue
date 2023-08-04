package com.example.demo.funcional;

public class PersonaUnaryOperatorImpl implements IPersonaUnaryOperator<Integer>{

	@Override
	public Integer aplicar(Integer arg) {
		// TODO Auto-generated method stub
		Integer calculo = arg * 10;
		return calculo;
	}

}
