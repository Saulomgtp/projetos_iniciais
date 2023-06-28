package application;

import java.util.Map;
import java.util.TreeMap;

public class Map1 {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");         //adicionando a "chave" e o "valor" no meu map
        // equivalente ao add /\

        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");

        System.out.println("Contem a chave 'phone': " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));  //get para exibir o valor
        System.out.println(cookies.size());


        System.out.println("All Cookies: ");

        for(String key : cookies.keySet()) {           //comando para andar pelo "Map" e exibir todos
            System.out.println(key + ": " + cookies.get(key));
        }




    }
}
