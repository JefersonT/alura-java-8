package br.com.alura.alurajava8;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Curso {
    private String nome;
    private int alunos;
}
