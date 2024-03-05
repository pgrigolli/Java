
package Exercicios;

import java.awt.*;

public class Ex02 {

    
    public static void main(String[] args){

        System.out.println(System.getProperty("user.country"));
        System.out.println(System.getProperty("user.language"));
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

        int width = (int)size.getWidth();

        int height = (int)size.getHeight();


        System.out.println("Current Screen resolution : " 
                            + "width : " + width
                            + " height : " + height);



    }


}
