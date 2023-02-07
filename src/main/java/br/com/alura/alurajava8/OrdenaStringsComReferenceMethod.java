package br.com.alura.alurajava8;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class OrdenaStringsComReferenceMethod {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");


		//USANDO REFERENCE METHOD - APARTIR DO JAVA 8
		System.out.println("USANDO LAMBDA");

		// ORDENAR COM COMPARATOR.COMPARING E METHOD REFERENCE
		System.out.println("---ORDENAR COM METHOD REFERENCE");
		palavras.sort(Comparator.comparing(String::length));

		// IMPRIMIR CADA ELEMENTO DA LISTA COM METHODO REFERENCE
		System.out.println("---IMPRIMIR CADA ELEMENTO DA LISTA");
		palavras.forEach(System.out::println);

	}

}
