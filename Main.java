class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them
    int daysdebitordefaulted= 40;
     int amountdebitorPayPerDay= 10000;
     int amountPaid= 275000;
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
    int TotalamountToPay;
   int DaysdebitorPaid;
   int amountLeft;
   int daysNotPaid;
   // calculate and print total amount the debtor is to pay
   TotalamountToPay= amountdebitorPayPerDay * daysdebitordefaulted;
    System.out.println("The total amount to be paid is");
   System.out.println("$"+ TotalamountToPay);


   // calculate and print the days the debtor paid for
    DaysdebitorPaid= amountPaid /amountdebitorPayPerDay;
  System.out.println("The days the debitor paid for is");
  System.out.println(DaysdebitorPaid + "days");
  // calculate and print the amount whose day was not captured because the amount was incomplete
  int amountNotCaptured= amountPaid % amountdebitorPayPerDay;
   System.out.println("The amount that wasn't captured is");
  System.out.println("$"+ amountNotCaptured);
   // calculate and print amount the debtor is left to pay
   amountLeft= TotalamountToPay - amountPaid;
   System.out.println("The amount the debtor is left to pay is");
   System.out.println("$"+ amountLeft);
   // calculate and print days the debtor has not payed for
   daysNotPaid= daysdebitordefaulted - DaysdebitorPaid;
   System.out.println("The days debitor has not payed is");
   System.out.println(daysNotPaid +"days");
   //kindly remove the statement below when you are done with the assignment
    
  }
}