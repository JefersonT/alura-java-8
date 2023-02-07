package br.com.alura.alurajava8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        // Data atual
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        // DataFutura
        LocalDate dataFutura = LocalDate.of(2099, 1, 25);
        // OU
//        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

        // Cra um período entre duas datas
        Period periodo = Period.between(agora, dataFutura);

        // Formatando data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatter.format(agora);
    }
}
