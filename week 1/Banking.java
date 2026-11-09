public class Banking {
    public static void main(String[] args) {
        System.out.println(" -----------------------------------");
        System.out.println("!           COMMERCE BANK           !");
        System.out.println("!                                   !");
        System.out.println(" -----------------------------------");
        String firstName = "Farhan bin";
        System.out.println("First Name : " + firstName);
        String lastName = "asad";
        System.out.println("Last Name : " + lastName);
        String date = "23 may 2024";
        System.out.println("Date:" + date);

        int startingBalance = 54983;
        System.out.println("Starting Balance :" + startingBalance);
        int transaction = 3143;
        String transactionDescription = "Cash Withdrawal";
        System.out.println("Transaction no 1:" + transaction + " " + transactionDescription);
        int transaction2 = 1235;
        String transactionDescription2 = "Cash Deposit";
        System.out.println("Transaction no 2:" + transaction2 + " " + transactionDescription2);

        int finalBalance = (startingBalance - transaction + transaction2);
        System.out.println("Final Balance :" + finalBalance);
    }
}