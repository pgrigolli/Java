package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class EmployeeProgram {
 
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        List<Employee> list = new ArrayList<>();



        System.out.print("Number of employees: ");
        int quantityOfEmployees = sc.nextInt();





        for(int i = 1; i <= quantityOfEmployees; i++){

            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced? (y/n): ");
            char isOutsourced = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if(isOutsourced == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

            }else{
                list.add(new Employee(name, hours, valuePerHour));
            }

            
            
            
            
            
            
            
        }
        
        System.out.println();
        System.out.println("PAYMENTS");
        for(Employee emp : list){

            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));



        }
        sc.close();
    }



}
