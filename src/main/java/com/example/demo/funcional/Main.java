package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		//METODOS REFERENCIADOS 
		//SUPPLIER:

		MetodosReferenciados metodos = new MetodosReferenciados();
		IPersonaSupplier<Integer> personaSupplier4 = metodos::getId;
		LOG.info("\nMetodo Referenciado SUPPLIER: " + personaSupplier4.getId());

		//CONSUMER
		IPersonaConsumer<String> cunsumer3 = metodos::aceptar;
		LOG.info("\nMetodo Referenciado CONSUMER: ");
		cunsumer3.accept(" gg");

		//PREDICATE
		IPersonaPredicate<Integer> predicate5 = metodos::evaluacion;
		LOG.info("\nMetodo Referenciado PREDICATE: " + predicate5.evaluar(10));// true
		
		//FUNCTION
		IPersonaFunction<String, Integer> function = metodos :: aplicar;
		LOG.info("\nMetodo Referenciado FUNCTION: " + function.aplicar(8));
		
		//UNARY OPERATOR
		IPersonaUnaryOperator<Integer> uOperator = metodos :: aplicarUO;
		LOG.info("\nMetodo Referenciado UNARY OPERATOR: " + uOperator.aplicar(8));

		
		
		
	}
}
