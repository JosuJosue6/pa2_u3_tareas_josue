package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosHighOrder {
	private static final Logger LOG = LoggerFactory.getLogger(MetodosHighOrder.class);

	public static void metodo(IPersonaSupplier<String> funcion) { //En este metodo recibe una interfaz como argumento

		LOG.info("HIGH ORDER SUPPLIER "+funcion.getId());

	}

	public static void metodoConsummer(IPersonaConsumer<String> funcion, String t) {

		LOG.info("HIGH ORDER CONSUMMER");
		funcion.accept(t);
	}
	
	public static boolean metodoPredicate(IPersonaPredicate<Integer> funcion, Integer arg) {
		LOG.info("HIGH ORDER PREDICATE");
		return funcion.evaluar(arg);
	}
	
	public static String metodoFunction(IPersonaFunction<String, Integer> funcion, Integer arg) {
		LOG.info("HIGH ORDER FUNCTION ****" +funcion.aplicar(arg));
		return funcion.aplicar(arg);
	}
	
	public static Integer metodoUnaryOperator(IPersonaUnaryOperator<Integer>funcion, Integer arg) {
		LOG.info("HIGH ORDER UNARY OPERATOR: "+funcion.aplicar(arg));
		return funcion.aplicar(arg);
	}
}
