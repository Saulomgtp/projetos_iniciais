package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {
    public static void main(String[] args) {


        List<String> a = Arrays.asList("a", "bb", "ccc");
        List<String> b = Arrays.asList("hello", "there");

        List<String> a1 = a.stream().map(x -> x + "*").collect(Collectors.toList());
        List<String> a2 = b.stream().map(x -> x + "*").collect(Collectors.toList());

        System.out.println(a1);
        System.out.println(a2);


    }

}
