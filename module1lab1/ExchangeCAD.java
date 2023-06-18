import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    //final as rate doesn't change
    final double EXCHANGE_RATE = 1.317;
    double maxexchange = 0.0; //maximum exchangable USD , step 1
    double ToExchange = 0.0; // USD for exchange , step 2
    double ExchangedMoney = 0.0; //CAD money 
    double exceedingUSD = 0.0; 
    //integers for each denomination of money
    int thousand = 0, hundred = 0, fifty = 0, twenty = 0, ten = 0, 
    five = 0, two = 0, one = 0, quarter = 0, dime = 0, nickel = 0, penny = 0;
    
    //Prompt the user to input the maximum exchange USD amount (as double)
    System.out.println("Please enter a maximum exchange USD amount:");
    maxexchange = reader.nextDouble(); 
    if(maxexchange < 0){
      System.out.println("Can not proceed with negative max value");
      System.exit(0);
    }
    //Prompt the user to input the USD amount for exchange (as double)
    System.out.println("Please enter a decimal USD amount for exchange:");
    ToExchange = reader.nextDouble(); 
    if(ToExchange < 0){
      System.out.println("Can not proceed with negative value");
      System.exit(0);
    }
    //used for exceeding amt & to only let max exchanged amt through
    if(ToExchange > maxexchange){
      exceedingUSD = ToExchange - maxexchange;
      ToExchange = ToExchange - exceedingUSD;
    }
    
    ExchangedMoney = EXCHANGE_RATE * ToExchange;
    double tempMoney = ExchangedMoney;
    
    //it is not very clean but works
    while(tempMoney >= 1000 && tempMoney != 0){
      tempMoney -= 1000;
      thousand++;
    }
    while(tempMoney >= 100 && tempMoney != 0){
      tempMoney -= 100;
      hundred++;
    }
    while(tempMoney >= 50 && tempMoney != 0){
      tempMoney -= 50;
      fifty++;
    }
    while(tempMoney >= 20 && tempMoney != 0){
      tempMoney -= 20;
      twenty++;
    }
    while(tempMoney >= 10 && tempMoney != 0){
      tempMoney -= 10;
      ten++;
    }
    while(tempMoney >= 5 && tempMoney != 0){
      tempMoney -= 5;
      five++;
    }
    while(tempMoney >= 2 && tempMoney != 0){
      tempMoney -= 2;
      twenty++;
    }
    while(tempMoney >= 1 && tempMoney != 0){
      tempMoney -= 1;
      one++;
    }

    while(tempMoney >= 0.25 && tempMoney != 0){
      tempMoney -= 0.25;
      quarter++;
    }
    while(tempMoney >= 0.1 && tempMoney != 0){
      tempMoney -= 0.1;
      dime++;
    }
    while(tempMoney >= 0.05 && tempMoney != 0){
      tempMoney -= 0.05;
      nickel++;
    }
    penny += tempMoney * 100;

    System.out.println("Paper currency CAD$: ");
    System.out.println("Number of CAD$1000: "+thousand);
    System.out.println("Number of CAD$100: "+hundred);
    System.out.println("Number of CAD$50: "+fifty);
    System.out.println("Number of CAD$20: "+twenty);
    System.out.println("Number of CAD$10 "+ten);
    System.out.println("Number of CAD$5: "+five);
    System.out.println("Number of CAD$2: "+two);
    System.out.println("Number of CAD$1: "+one);
    System.out.println("Number of CAD$0.25: "+ quarter);
    System.out.println("Number of CAD$0.10: "+ dime);
    System.out.println("Number of CAD$0.05: "+ nickel);
    System.out.println("Number of CAD$0.01: " + penny);
        
    System.out.printf("Total exchange amount CAD$: %.2f \n", ExchangedMoney);
    System.out.println("Exceeding amount USD$: "+ exceedingUSD);

    reader.close();
  }
}