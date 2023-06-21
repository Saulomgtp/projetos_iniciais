package secao1;

import entities.ContaEmpresaHeranca;
import entities.ContaHeranca;
import entities.ContaPoupancaHeranca;

import java.util.Scanner;

public class enum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       ContaHeranca acc1 = new ContaHeranca(1001, "Alex", 1000.0);
       acc1.saqueConta(200.0);
       System.out.println(acc1.getSaldoConta());

       ContaHeranca acc2 = new ContaPoupancaHeranca(1002, "Maria", 1000.0, 0.01);

       acc2.saqueConta(200.0);
       System.out.println(acc2.getSaldoConta());

       ContaHeranca acc3 = new ContaEmpresaHeranca(1002, "Maria", 1000.0, 500.);

       acc3.saqueConta(200.0);
       System.out.println(acc3.getSaldoConta());




    }
}


