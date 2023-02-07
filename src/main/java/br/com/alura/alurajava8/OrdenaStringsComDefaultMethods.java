package br.com.alura.alurajava8;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class OrdenaStringsComDefaultMethods {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");


		//APARTIR DO JAVA 8
		System.out.println("APARTIR DO JAVA 8");

		//ORDENAR COM COMPARADOR NATURAL
		System.out.println("---ORDENAR COM COMPARADOR NATURAL");
		Collections.sort(palavras);
		System.out.println(palavras);

		// ORDENAR COM COMPADADOR DEFINIDO
		System.out.println("---ORDENAR COM COMPADADOR DEFINIDO");
		Comparator<String> comparator2 = new ComparadorPorTamanho();
		palavras.sort(comparator2);
		System.out.println(palavras);

		// IMPRIMIR CADA ELEMENTO DA LISTA
		System.out.println("---IMPRIMIR CADA ELEMENTO DA LISTA");
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);

	}

}
