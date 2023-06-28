package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);    //colocar dados na lista sem precisar do .add

        Stream<Integer> stream = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(stream.toArray()));   //Arrays.toString   para imprimir              stream.toArray para transformar o stream em array

        Stream<String> stream1 = Stream.of("Maria", "Alex", "Bob");                 // Stream.of para criar uma stream

        stream1.forEach(System.out::println);

        Stream<Integer> stream2 = Stream.iterate(0, x -> x + 2);        //criei uma lista infinita criando uma função para criação da mesma

        System.out.println(Arrays.toString(stream2.limit(30).toArray()));      //coloquei o .limit para trazer até o 30 resultado

        Stream<Long> stream3 = Stream.iterate(new Long[] {0L, 1l}, x -> new Long[] {x[1], x[0]+x[1]}).map(x -> x[0]);

        System.out.println(Arrays.toString(stream3.limit(30).toArray()));






    }




}
