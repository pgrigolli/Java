package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
// import entities.Product;

public class Vector {
    
    public static void main(String[] args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // double[] vect = new double[n];

        // for(int i = 0; i < n; i++){
        //     vect[i] = sc.nextDouble();
        // }

        // double sum = 0.0;
        // for(int i = 0; i < n; i++){
        //     sum += vect[i];
        // }

        // double avg = sum/n;

        // System.out.printf("AVG_HEIGHT: %.2f", avg);


        // System.out.print("Quantidade de posições do vetor: ");
        // int n = sc.nextInt();
        // Product[] vect = new Product[n];


        // for (int i = 0; i < n; i++){

        //     sc.nextLine();
        //     String name = sc.nextLine();
        //     double price = sc.nextDouble();
        //     vect[i] = new Product(name, price);

        // }


        // double sum = 0;
        // for(int i = 0; i < n; i++){

        //     sum += vect[i].getPrice();

        // }

        // double avg = sum/n;

        // System.out.printf("AVG PRICE: %.2f", avg);
        
        List<String> list = new ArrayList<>();
        
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");
        System.out.println(list.size());
        
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);



            sc.close();
    }



}
