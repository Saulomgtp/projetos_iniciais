package secao1;

import entities.Reserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class enum8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        try {
            System.out.print("Número do quarto: ");
            int numeroQuarto = sc.nextInt();
            sc.nextLine();
            System.out.print("Data do check-in (dd/MM/yyyy): ");
            String checkin = sc.nextLine();
            System.out.print("Data do check-out (dd/MM/yyyy): ");
            String checkout = sc.nextLine();

            Reserva reserva = new Reserva(numeroQuarto, LocalDate.parse(checkin, DateTimeFormatter.ofPattern("dd/MM/yyyy")), LocalDate.parse(checkout, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println(reserva);

            System.out.println();

            System.out.println("Entre com os dados para atualizar sua reserva: ");
            System.out.print("Data do check-in (dd/MM/yyyy): ");
            String checkinAtualizado = sc.nextLine();
            System.out.print("Data do check-out (dd/MM/yyyy): ");
            String checkoutAtualizado = sc.nextLine();

            reserva.datasAtualizadas(LocalDate.parse(checkinAtualizado, DateTimeFormatter.ofPattern("dd/MM/yyyy")), LocalDate.parse(checkoutAtualizado, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println(reserva);
        }
        catch (DateTimeParseException e) {
            System.out.println("Formato da data inválida");
        }
        catch (NullPointerException e) {
            System.out.println();
        }
        System.out.println("Programa finalizado");
    }
}


