public class ATM {
    public static void main(String[] args) {
        //float bal = 30000;
        double withdrawal = 4500;
        double curr_bal = 30000;
        double amt_bal = curr_bal - withdrawal;
        System.out.println("Account balance = "+curr_bal);
        //(curr_bal = bal - withdrawal);
        if (withdrawal % 5 == 0 && curr_bal >= withdrawal + 0.5) {
             amt_bal = curr_bal - (withdrawal + 0.5); //0.5 is the bank charges
        }
        System.out.println("Amount to be withdraw = "+withdrawal);
        System.out.println("Bank Charges = 0.5");
        System.out.println("Current Balance = "+amt_bal);
    }
}