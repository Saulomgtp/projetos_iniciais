package secao1;



import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Data1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate d01 = LocalDate.now(); // data local

        LocalDateTime d02 = LocalDateTime.now(); // data e hora local

        Instant d03 = Instant.now();             // data e horário de londres   fuso horário 0

        LocalDate d04 = LocalDate.parse("2022-07-20");  // imprime a data e hora que estiver dentro das ""

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");   // imprime a data e hora que estiver dentro das ""

        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");   // imprime a data e hora que estiver dentro das ""

        // Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");   // NÃO USAR < DA ERRO


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //criando um método para formatação

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //criando um método para formatação

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); //utilizando a variável fmt1 para formatar o dado

        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); //utilizando a variável fmt2 para formatar o dado

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);



        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);













    }
}



