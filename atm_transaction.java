import java.util.Scanner;
    public class atm_transaction
    {

        public static void main(String args[] )
        {
            int balance = 10000, withdraw, deposit;
            Scanner s = new Scanner(System.in);
            while(true)
            {
                System.out.println("Automated Teller Machine");
                System.out.println("Choose 1 for Transactions History");
                System.out.println("Choose 2 for Withdraw");
                System.out.println("Choose 3 for Deposit");
                System.out.println("Choose 4 for Transfer");
                System.out.println("choose 5 for Exit");
                System.out.print("Choose the operation you want to perform:");
                int n = s.nextInt();
                switch(n)
                {
                    case 1:
                        System.out.println("show transaction history");
                        System.out.println("");

                    case 2:
                        System.out.print("Enter money to be withdrawn:");
                        withdraw = s.nextInt();
                        if(balance >= withdraw)
                        {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;

                    case 3:
                        System.out.print("Enter money to be deposited:");
                        deposit = s.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully deposited");
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("Balance : "+balance);
                        System.out.println("");
                        break;

                    case 5:
                        System.exit(0);
                }
            }
        }
    }

