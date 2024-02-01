package entities;

public class Retangle {
    
    public double width;

    public double height;


    public double Area(){

        return height * width;

    };

    public double Perimeter(){

        return 2 * (height) + 2 * (width);

    };

    public double Diagonal(){

        return  Math.sqrt(width * width + height * height);


    };
}
