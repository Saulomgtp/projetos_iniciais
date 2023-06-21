package secao1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
// tipo List<Tipo primitivo> variável = new Arraylist<>();                   Arraylist é uma classe do java e list também, tem que importar

        list.add("Maria");     //   adicionar valores a lista
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add("Joao");
        list.add (2, "Marco");
        list.add("Alexx");

        System.out.println(list.size());          // imprimir quantos dados tem na lista


        for (String lista : list) {           // for each que aprendemos
            System.out.println(lista);
        }

        System.out.println("--------------------------------------");

        list.remove(1);            // para remover a posição 1 da lista
        list.removeIf(x -> x.charAt(0) == 'M');     //        fazendo uma condição para remover na lista
//                     /\ predicado

        for (String lista : list) {
            System.out.println(lista);
        }

        System.out.println("--------------------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));   // list.indexOf(x) para saber a posição que o dado está ocupando na lista
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // Se caso for um dado que não está na lista volta com -1

        System.out.println("--------------------------------------");


        //        \/ criar um filtro para mostrar apenas os resultados iniciados com a letra "A"
        List<String> filtro = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
// criando nova lista /\ novo novo = list que vou importar.stream().filter(predicado).collect(Collectors.toList());

        for (String lista : filtro) {          //mudei a lista de "list" pra "filtro" que foi a nova lista que eu criei
            System.out.println(lista);
        }

        System.out.println("--------------------------------------");

//   iniciando um tipo primitivo qualquer = list.stream(). mesmo filtro do de cima.findFirst()
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);     //findFirst(). serve para localizar o primeiro resultado
//                                                                       orElse é pra se caso não localizar nenhum resultado
        System.out.println(name);






















    }
}


