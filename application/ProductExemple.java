package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ProductExemple {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com um produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();

        Product p1 = new Product(name, price);

        System.out.println(p1);
        
        System.out.println();
        System.out.print("Entre com a quantidade de produtos a serem adicionados ao estoque: ");
        int quantity_add = sc.nextInt();
        p1.AddProducts(quantity_add);
        System.out.println("Produtos adicionados com sucesso. Quantidade atual: " + p1.quantity);
        System.out.println(p1);
        
        System.out.print("Entre com a quantidade de produtos a serem removidos do estoque: ");
        quantity_add = sc.nextInt();
        p1.RemoveProducts(quantity_add);
        System.out.println("Produtos removidos com sucesso. Quantidade atual: " + p1.quantity);
        System.out.println(p1);
        
        

        sc.close();
    }

    
}
