package br.com.alura.alurajava8;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class OrdenaStringsComLambda {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");


		//USANDO LAMBDA - APARTIR DO JAVA 8
		System.out.println("USANDO LAMBDA");

		// ORDENAR COM COMPADADOR DEFINIDO COM LAMBDAS
		System.out.println("---ORDENAR COM COMPADADOR DEFINIDO COM LAMBDAS");
		palavras.sort((s1, s2) -> {
			if (s1.length() > s2.length())
			return 1;
			if (s1.length() < s2.length())
				return -1;
			return 0;
		});

		// ORDENAR COM COMPADADOR DEFINIDO COM LAMBDAS - SIMPLIFICADO
		System.out.println("---ORDENAR COM COMPADADOR DEFINIDO COM LAMBDAS - SIMPLIFICADO");
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// ORDENAR COM COMPARATOR.COMPARING E LAMBDA
		System.out.println("---ORDENAR COM COMPARATOR.COMPARING E LAMBDA");
		palavras.sort(Comparator.comparing(s -> s.length()));

		// IMPRIMIR CADA ELEMENTO DA LISTA - COM LAMBDA
		System.out.println("---IMPRIMIR CADA ELEMENTO DA LISTA");
		palavras.forEach(s -> System.out.println(s));

	}

}
