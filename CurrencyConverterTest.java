package Test;

import Main.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarPrice = scan.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double amount = scan.nextDouble();
        double totalReais = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("Amount to be paid in reais= %.2f%n", totalReais);



        scan.close();
    }
}
