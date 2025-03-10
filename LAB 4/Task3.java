class Bankaccount {
   int AccountNumber;
   double balance;
  
   
   Bankaccount (int AccountNumber, double balance){
      this.AccountNumber = AccountNumber;
      this.balance = balance;
   }
   
   void CheckBalance(){
     System.out.println("Balance of " + AccountNumber + " is: " + balance);
   }
   
   void withdraw(double amount){
       if (amount <= balance){
          balance = balance - amount;
          System.out.println("Withdrawn: " + amount + " from Account " + AccountNumber);
       } else {
          System.out.println("Insufficient balance of "+ AccountNumber);
       }
   }
   
   void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount + " in Account " + AccountNumber);
    }
   
   
   public static void main (String[] args){
         Bankaccount account1 = new Bankaccount(101, 1000); 
         Bankaccount account2 = new Bankaccount(102, 500);

        account1.CheckBalance(); // Check balance of account1
        account2.CheckBalance(); // Check balance of account2

        account1.withdraw(500);  // Withdraw 500 from account1
        account1.CheckBalance(); // Check balance of account1 after withdrawal

        account2.withdraw(3000); // Try to withdraw 3000 from account2 (should fail)
   }
  
}
