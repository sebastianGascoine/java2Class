import java.io.*;

class Main {
  public static void main(String[] args) throws Exception {
    
    Person bob = new Person("Bob","Chula Vista","8581234567");
    Customer albert = new Customer("Albert","80A01","San Diego","6191234567");
    bob.printInfo();
    albert.printInfo();

  }
}