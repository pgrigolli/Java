package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ProductExemple {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product();
        
        System.out.println("Entre com um produto: ");
        System.out.print("Nome: ");
        p1.name = sc.nextLine();
        System.out.print("Preço: ");
        p1.price = sc.nextInt();
        System.out.print("Quantidade em estoque: ");
        p1.quantity = sc.nextInt();

        System.out.println(p1);

        System.out.println();
        System.out.print("Entre com a quantidade de produtos a serem adicionados ao estoque: ");
        int quantity = sc.nextInt();
        p1.AddProducts(quantity);
        System.out.println("Produtos adicionados com sucesso. Quantidade atual: " + p1.quantity);
        System.out.print("Entre com a quantidade de produtos a serem removidos do estoque: ");
        quantity = sc.nextInt();
        p1.RemoveProducts(quantity);
        System.out.println("Produtos removidos com sucesso. Quantidade atual: " + p1.quantity);
        
        

        sc.close();
    }

    
}
