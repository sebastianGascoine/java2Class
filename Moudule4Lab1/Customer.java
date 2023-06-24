/* UML CLASS DIAGRAM:
-----------------------------------------
Customer
-----------------------------------------
- Name : String    
- City : String
- Phone : String
- CUSTOMER_ID : int
- baseID : int
-----------------------------------------
+ Customer(Name : String, City : String, Phone : String)

+ getName() : String
+ getCity() : String
+ getPhone() : String
+ getCustomerID() : int
+ getNewID() : int
+ setName(newName : String) : void
+ setCity(newCity : String) void
+ setPhone(newPhone : String) : void
+ toString() : String
-----------------------------------------
*/


public class Customer extends Person
{
  private static int baseID = 50000;
  private final int CUSTOMER_ID;
  private String Name;
  private String City;
  private String Phone;
  
  public Customer(String name, String city, String phone){
    this.Name = name;
    this.City = city;
    this.Phone= phone;
    this.CUSTOMER_ID = getNewID();
  }
  //Accessors
  public String getName(){
      return Name; 
  }
  public String getCity(){
    return City; 
  }
  public String getPhone(){
      return Phone; 
  }
  public int getCustomerID(){
    return CUSTOMER_ID;
  }
  //For unique customer ID
  public int getNewID(){
    int newid = baseID;
    baseID++;
    return newid;
  }
  //Mutators
  public void setName(String newName){
      this.Name = newName; 
  }
  public void setCity(String newCity){
      this.City = newCity; 
  }
  public void setPhone(String newPhone){
      this.Phone = newPhone; 
  }
  //Overrided toString()
  public String toString(){
    return String.format("Customer: %s(%d) stays in %s, with phone# %s",getName(),getCustomerID(),getCity(),getPhone());
  }
}