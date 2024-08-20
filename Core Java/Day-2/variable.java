public class variable {
    public static void main(String[] args) {
        
        // Add Integer
        int currentbalance = 1000;
        int withdraw = 500;
        int deposit = 200;

        // Equation for new balance 
        int newbalance = currentbalance - withdraw + deposit;

        System.out.print("Your New Balance Is : ");
        System.out.print(newbalance);

    }
}


// Output Will Be - Your New Balance Is : 700
