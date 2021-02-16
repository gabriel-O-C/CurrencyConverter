package Main;

public class CurrencyConverter {
    public static double IoF = 0.06;
    public static double dollarToReal(double amount, double dollarPrice){
        return amount * dollarPrice * (1.0 + IoF);
    }


}
