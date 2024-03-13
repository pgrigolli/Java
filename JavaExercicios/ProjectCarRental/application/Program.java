package ProjectCarRental.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import ProjectCarRental.entities.CarRental;
import ProjectCarRental.entities.Vehicle;
import ProjectCarRental.services.BrasilTaxService;
import ProjectCarRental.services.RentalService;

public class Program {
    
    public static void main(String args[]) throws ParseException{

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter car Rental data:");
        System.out.print("Car model: ");
        String model = sc.nextLine();


        System.out.print("Pickup (dd/MM/yyyy HH:ss): ");
        Date start = sdf1.parse(sc.nextLine());

        System.out.print("Return (dd/MM/yyyy HH:ss): ");
        Date finish = sdf1.parse(sc.nextLine());


        CarRental cr = new CarRental(start, finish, new Vehicle(model));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();


        RentalService rs = new RentalService(pricePerHour, pricePerDay, new BrasilTaxService());

        rs.processInvoice(cr);

        System.out.println("INVOICE");
        System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));


        sc.close();
    } 




}
