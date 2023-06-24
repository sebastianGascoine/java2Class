
import java.io.*;
import java.util.Scanner;

class lab21_1 {
  public static void main(String[] args) throws Exception {
    /*
      Person Array Order: Person, Client, Customer
      Files are laid out as
        Name
        Phone
        City
    */
    File personfile = new File("lab21_personinput.txt");
    File clientfile = new File("lab21_clientinput.txt");
    File customerfile = new File("lab21_customerinput.txt");
    Scanner input1 = new Scanner(personfile);
    Scanner input2 = new Scanner(clientfile);
    Scanner input3 = new Scanner(customerfile);
    
    int totalpersons = input1.nextInt();
    int totalclients = input2.nextInt();
    int totalcustomers = input3.nextInt();
    //clears the \n
    input1.nextLine();
    input2.nextLine();
    input3.nextLine();

    //int TOTAL_ENTRIES = totalpersons + totalclients + totalcustomers;
    int inputentries = 0;
    Person[] Everyone = new Person[9];
    for(int i=inputentries;i<totalpersons;i++){
      String tempName = input1.nextLine();
      String tempNum = input1.nextLine();
      String tempCity = input1.nextLine();
      Everyone[i] = new Person(tempName,tempCity,tempNum);
      inputentries = i;
    }
    inputentries++;
    
    int temp = totalclients+inputentries;
    for(int i=inputentries;i<temp;i++){
      String tempName = input2.nextLine(); //error here
      String tempNum = input2.nextLine();
      String tempCity = input2.nextLine();
      Everyone[i] = new Client(tempName,tempCity,tempNum);
      inputentries = i;
    }
    inputentries++;

    
    temp = totalcustomers+inputentries;
    for(int i=inputentries;i<temp;i++){
      String tempName = input3.nextLine();
      String tempNum = input3.nextLine();
      String tempCity = input3.nextLine();
      Everyone[i] = new Customer(tempName,tempCity,tempNum);
      inputentries = i;
    }
    
    for(Person P : Everyone){
      printOut(P);
      System.out.print("\n");
    }
    
    input1.close();
    input2.close();
    input3.close();
  }
  public static void printOut(Person x)
  {
    System.out.print(x);
  }
}