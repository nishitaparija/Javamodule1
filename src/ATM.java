public class ATM {
    public static void main(String[] args)
    /*{ double withdrawal = 2400, with_amt;
        float bal = 50000;
        double acc_bal = bal - withdrawal;
        if(with_amt == .5 withdrawal)
        {
            System.out.println("Withdrawal is feasible.");
        }else{
            System.out.println("Withdrawal not feasible.");
        }
        System.out.println("Account Balance = "+acc_bal);
    }
}*/ {
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