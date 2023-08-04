package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		// METODOS HIGH ORDER
		// SUPPLIER*******************************************************************************
		// CLASE
		IPersonaSupplier<String> pSupplier = new PersonaSupplierImpl();
		MetodosHighOrder.metodo(pSupplier);

		// LAMBDA
		MetodosHighOrder.metodo(() -> "5555888HO");

		// METODOS REFERENCIADOS
		MetodosHighOrder.metodo(MetodosReferenciados::getIdHO);

		// CONSUMMER******************************************************************************
		// CLASE
		IPersonaConsumer<String> pConsummer = new PersonaConsumerImpl();
		MetodosHighOrder.metodoConsummer(pConsummer, "test Clase");

		// LAMBDA
		MetodosHighOrder.metodoConsummer(cadena -> LOG.info("HO -Lambda" + cadena), " test Lambda");

		// METODOS REFERENCIADOS
		MetodosHighOrder.metodoConsummer(MetodosReferenciados::aceptar, "test Referenciados");

		// PREDICATE******************************************************************************
		// CLASE
		IPersonaPredicate<Integer> personaPredicate = new PersonaPredicateImpl();
		MetodosHighOrder.metodoPredicate(personaPredicate, 8);

		// LAMBDA
		MetodosHighOrder.metodoPredicate(expresion -> {
			boolean v = expresion>2;
			LOG.info("El resultado es: " + v);
			return expresion > 0;
		}, 1);

		// METODOS REFERENCIADOS
		MetodosHighOrder.metodoPredicate(MetodosReferenciados::evaluacion, 10);

		// FUNCTION*******************************************************************************
		// CLASE
		IPersonaFunction<String, Integer> personaFunction = new PersonaFunctionImpl();
		MetodosHighOrder.metodoFunction(personaFunction, 4);

		// LAMBDA
		MetodosHighOrder.metodoFunction(arg -> arg.toString().concat(" en string"), 5);

		// METODOS REFERENCIADOS

		MetodosHighOrder.metodoFunction(MetodosReferenciados::aplicar, 15);

		// UNARY OPERATOR
		// ************************************************************************
		// CLASE
		IPersonaUnaryOperator<Integer> personaUnaryOperator = new PersonaUnaryOperatorImpl();
		MetodosHighOrder.metodoUnaryOperator(personaUnaryOperator, 6);

		// LAMBDA
		MetodosHighOrder.metodoUnaryOperator(arg -> arg + 20, 5);

		// METODOS REFERENCIADOS
		MetodosHighOrder.metodoUnaryOperator(MetodosReferenciados::aplicarUO, 8);

	}
}
