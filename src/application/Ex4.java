package application;
import java.util.Scanner;
import entities.Ex3;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex3 rect = new Ex3();

        System.out.print("Name: ");
        rect.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        rect.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        rect.tax = sc.nextDouble();
        System.out.println();
        System.out.println("Employee: " + rect);

        System.out.println();

        System.out.println("Which percentage to encrease salary?");
        double percentage = sc.nextDouble();
        rect.increaseSalary(percentage);
//      /\ ativar o percentage nos códigos mãe
        System.out.println();
        System.out.println("Update data: " + rect);


    }
}
// para string utilizar sc.nextLine();