package secao1;



import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Data2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate d01 = LocalDate.now(); // data local

        LocalDateTime d02 = LocalDateTime.now(); // data e hora local

        Instant d03 = Instant.now();             // data e horário de londres   fuso horário 0

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");  // para eu conseguir formatar a data no formato que eu desejar      APENAS DIA/ APENAS HORA, DIA E MÊS
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // para eu conseguir formatar a data no formato que eu desejar      APENAS DIA/ APENAS HORA, DIA E MÊS
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());  //para usar o instant = withZone(ZoneId.systemDefault());


        System.out.println(d01);
        System.out.println(d01.format(fmt1));

        System.out.println(d02);
        System.out.println(d02.format(fmt2));

        System.out.println(d03);
        System.out.println(fmt3.format(d03)); //  formato como variável e formatar o instant















    }
}



