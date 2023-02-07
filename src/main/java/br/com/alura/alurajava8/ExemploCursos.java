package br.com.alura.alurajava8;

import java.util.*;
import java.util.stream.Collectors;
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

        System.out.println("SOMA O NUMEROS DE ALUNOS");
        int sum = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println(sum);

        // Retorna uma Stream de String apartir de uma Stream de cursos
        Stream<String> nomes = cursos.stream().map(Curso::getNome);


        System.out.println("IMPRIMI QUAL QUER CURSO COM MAIS DE 100 ALUNOS");
        // Retorna qualquer elemento do filtro
        Optional<Curso> cursoAny = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .findAny();

        cursoAny.ifPresent(c -> System.out.println(c.getNome()));

        System.out.println("IMPRIMI O PRIMEIRO CURSO COM MAIS DE 100 ALUNOS");
        // Retorna o primeiro elemento do filtro
        Optional<Curso> curso1 = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .findFirst();

        System.out.println("IMPRIME A MÉDIA DE ALUNOS");
        OptionalDouble average = cursos.stream()
                .mapToInt(Curso::getAlunos)
                .average();
        System.out.println(average);

        // Transformando Stream em List
        List<Curso> list = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .collect(Collectors.toList());
    }
}
