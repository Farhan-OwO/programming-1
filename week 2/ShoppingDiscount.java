public class ShoppingDiscount{
    public static void main(String[] args) {
        double purchaseAmount = 150.0;
        boolean hasDiscount = purchaseAmount >= 50;
        boolean freeShipping = purchaseAmount >= 100;
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Eligible for Discount: " + hasDiscount);
        System.out.println("Eligible for Free Shipping: " + freeShipping);
        
    }
}