package br.com.alura.alurajava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

//        // Sort com lambda
//        cursos.sort(Comparator.comparing(c -> c.getAlunos()));
        // Sort com methd reference
        cursos.sort(Comparator.comparing(Curso::getAlunos));
        System.out.println("LISTA DE CURSOS");
        cursos.forEach(curso -> System.out.println(curso.getNome()));

        System.out.println("LISTA DE CURSOS >= 100 ALUNOS");
        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .forEach(curso -> System.out.println(curso.getNome()));

        System.out.println("QTD DE ALUNOS NOS CURSOS >= 100 ALUNOS");
        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

//        System.out.println("QTD DE ALUNOS NOS CURSOS >= 100 ALUNOS (TESTE)");
//        cursos.stream()
//                .filter(curso -> curso.getAlunos() >= 100)
//                .forEach(c -> System.out.println(c.getAlunos()));

        int sum = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println(sum);

        Stream<String> nomes = cursos.stream().map(Curso::getNome);
    }
}
