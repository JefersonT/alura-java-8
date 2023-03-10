package br.com.alura.alurajava8;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");


		//ANTES DO JAVA 8
		System.out.println("ANTES DO JAVA 8");

		//ORDENAR COM COMPARADOR NATURAL
		System.out.println("---ORDENAR COM COMPARADOR NATURAL");
		Collections.sort(palavras);
		System.out.println(palavras);

		//ORDENAR COM COMPARADOR DEFINIDO
		System.out.println("---ORDENAR COM COMPARADOR DEFINIDO");
		Comparator<String> comparator = new ComparadorPorTamanho();
		Collections.sort(palavras, comparator);
		System.out.println(palavras);

		// IMPRIMIR CADA ELEMENTO DA LISTA
		System.out.println("---IMPRIMIR CADA ELEMENTO DA LISTA");
		for (String p : palavras) {
			System.out.println(p);
		}
	}

}
