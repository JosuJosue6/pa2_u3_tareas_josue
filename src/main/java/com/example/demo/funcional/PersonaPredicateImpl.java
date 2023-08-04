package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonaPredicateImpl implements IPersonaPredicate<Integer> {

	private static final Logger LOG = LoggerFactory.getLogger(PersonaPredicateImpl.class);
	@Override
	public boolean evaluar(Integer arg) {
		// TODO Auto-generated method stub
		boolean valorVerdad = false;
		if(arg>5) {
			valorVerdad = true;
			LOG.info("El numero: "+arg+" es mas grande que cinco.");
		}
		return valorVerdad;
	}

}
