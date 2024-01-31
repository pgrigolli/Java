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

        System.out.printf("Dados do produto: %s, $ %.2f, %d unidades, total %.2f", p1.name, p1.price, p1.quantity, p1.TotalValueInStock());

        
        

        sc.close();
    }

    
}
