package application;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Notebook");
        set.add("TV");
        set.add("Tablet");

        System.out.println(set.contains("Tablet"));

        set.removeIf(x -> x.length() >= 3);

        for (String p : set) {
            System.out.println(p);
        }

    }
}
