package com.example.demo.funcional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		List<Integer> listaNumero = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		
		// LIBRERIAS FUNCIONALES DE JAVA CON METODOS REFERENCIADOS
		// SUPLIER
		LOG.info("SUPLIER ****************************************************************");
		Stream<String> lista = Stream.generate(MetodosReferenciados::getIdHO).limit(2);
		lista.forEach(cadena -> LOG.info("SUPLIER: "+cadena));

		// CONSUMER
		LOG.info("CONSUMER ****************************************************************");
		List<String> listName = Arrays.asList("Josue","Luis","Diego","Andres");
		listName.forEach(MetodosReferenciados::aceptar);
		
		// PREDICATE
		LOG.info("PREDICATE ****************************************************************");
		Stream<Integer> listaFinal = listaNumero.stream().filter(MetodosReferenciados::evaluacion);
		listaFinal.forEach(numero -> LOG.info("Valor :" + numero));

		// FUNCTION
		LOG.info("FUNCTION ****************************************************************");
		Stream<String> listaCambiada = listaNumero.stream().map(MetodosReferenciados::aplicar);
		listaCambiada.forEach(MetodosReferenciados::aceptar);

		// UNARY OPERATOR
		LOG.info("UNARY OPERATOR ****************************************************************");
		Stream<Integer> listaCambiada2 = listaNumero.stream().map(MetodosReferenciados::aplicarUO);
		listaCambiada2.forEach(numero -> LOG.info("UNARY OPERATOR:" + numero));

	}
}
