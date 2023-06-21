package entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reserva {

    private Integer numeroQuarto;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reserva() {

    }

    public Reserva(Integer numeroQuarto, LocalDate checkin, LocalDate checkout) {
        if (!checkout.isAfter(checkin)) {
            System.out.println("A data de saída deve ser após a data de entrada!");
        } else {
            this.numeroQuarto = numeroQuarto;
            this.checkin = checkin;
            this.checkout = checkout;
        }
    }
    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public Integer duracao () {
        return (int) ChronoUnit.DAYS.between(checkin, checkout);
    }
    public void datasAtualizadas (LocalDate checkin, LocalDate checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }
    public String toString() {
        return "Reserva: Quarto " + numeroQuarto + ", check-in: " + checkin.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", check-out: " + checkout.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", " + duracao() + " noites.";
    }
}