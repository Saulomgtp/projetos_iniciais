package secao1;



import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Data3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate d01 = LocalDate.now(); // data local
        LocalDate d04 = LocalDate.now(); // data local

        LocalDateTime d02 = LocalDateTime.now(); // data e hora local
        LocalDateTime d05 = LocalDateTime.now(); // data e hora local

        Instant d03 = Instant.now();             // data e horário de londres   fuso horário 0

        LocalDate semanaPassada = d01.minusWeeks(1);     //indo 1 semana atrás da data atual
        LocalDate proximaSemana = d04.plusWeeks(1);         //adicionando 1 semana da data atual

        LocalDateTime maisTresHoras = d05.plusHours(3);   //adicionando 3 horas
        LocalDateTime menosTresHoras = d02.minusHours(3); //removendo 3 horas


        System.out.println(semanaPassada);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println(semanaPassada.format(fmt1));
        System.out.println(proximaSemana.format(fmt1));
        System.out.println(maisTresHoras.format(fmt2));
        System.out.println(menosTresHoras.format(fmt2));


        Duration t1 = Duration.between(maisTresHoras, menosTresHoras);    // fazer diferença entre horas/dias/minutos
        Duration t2 = Duration.between(semanaPassada.atTime(0, 0), proximaSemana.atTime(0,0));     //para converter LocalDate em LocalDateTime usar \/
        //                                          .atTime para converter LocalDate em LocalDateTime     para poder usar o Duration = variável = Duration.between

        System.out.println(t1.toHours());     //  pode ser toDays, toMinutes... etc
        System.out.println(t2.toDays());     //  pode ser toDays, toMinutes... etc












    }
}



