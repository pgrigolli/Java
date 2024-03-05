package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.UsedProduct;
import entities.ImportedProduct;

public class ProductExemple {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();



        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            
            System.out.println("Product #" + i + " data: ");

            System.out.print("Common, used or imported? (c/u/i): ");
            char ch = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(ch == 'i'){

                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));

            }else if(ch == 'u'){

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));

            }else if(ch == 'c'){

                list.add(new Product(name, price));

            }


            
            
            
        }
        
        System.out.println();

        System.out.println("ETIQUETAS DE PREÇO: ");
        for (Product prod : list){
            System.out.println(prod.priceTag());
        }



      
 
        sc.close();
    }

    

    //PAREI 01:26:26 AULA 38
}

