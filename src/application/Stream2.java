package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);    //colocar dados na lista sem precisar do .add

        Stream<Integer> stream = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(stream.toArray()));


        int soma = list.stream().reduce(0,(x,y) -> x + y);  // pode ser feito com list.stream().reduce(0, Integer::sum);     Integer::sum

        System.out.println(soma);

        List<Integer> lista = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());   // utilizando funções diversar como stream e depois voltando para lista com o .collect(Collectors.toList()

        System.out.println(Arrays.toString(lista.toArray()));
    }
}
