public class SalesTax
{
    public static void main(String[] args)
    {
        final double SALES_TAX = 0.05; // Tax variable, doesn't change
        final double PURCHASE_PRICE = 25.99; // Pretend input
        double taxPrice = 0; // Initialize variables
        double totalPrice = 0;
        String askPrice = "What is the price of your purchase?";
        System.out.println(askPrice);
        taxPrice = PURCHASE_PRICE * SALES_TAX;
        totalPrice = PURCHASE_PRICE + taxPrice;
        System.out.println("A 5% sales tax on your purchase is $" + taxPrice + " giving you a total price of $" + totalPrice); // outputs the variable

    }
}