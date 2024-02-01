package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary - tax;

    }

    public void IncreaseSalary(double percentage){

        double result = (grossSalary * percentage)/100;

        result += NetSalary();

        System.out.println("Dados atualizados: " + name + " $ " + result);
    }

}
