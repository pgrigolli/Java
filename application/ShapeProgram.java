package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entitiesEnums.Color;

public class ShapeProgram {
    
    public static void main(String[] args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>(); 

        System.out.print("Enter with the quantity of shapes: ");
        int quantity = sc.nextInt();

        for(int i = 1; i <= quantity; i++){

            System.out.println("Enter shape #" + i + " data: ");
            System.out.print("Rectangle or circle? (r/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(ch == 'r'){
                System.out.print("Height: ");
                double height = sc.nextDouble();

                System.out.print("Width: ");
                double width = sc.nextDouble();

                list.add(new Rectangle(color, height, width));

            }

            else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }




        }




        for(Shape sh : list){
            System.out.println(sh.area());
        }





        sc.close();
    }




}
