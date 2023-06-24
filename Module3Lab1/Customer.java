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
+ getCustomerID() : String
+ setName(newName : String) : void
+ setCity(newCity : String) void
+ setPhone(newPhone : String) : void
+ setID(newID : String) : void
+ toString() : String
-----------------------------------------
*/


public class Customer extends Person
{
  private String customerID;
  private String Name;
  private String City;
  private String Phone;
  
  public Customer(String name, String id, String city, String phone){
    this.Name = name;
    this.customerID = id;
    this.City = city;
    this.Phone = phone;
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
  public String getCustomerID(){
    return customerID;
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
  public void setID(String newID){
      this.customerID = newID; 
  }
  public void printInfo(){
    System.out.printf("\nCustomer: %s(%s) stays in %s, with phone# %s",
                         getName(), getCustomerID(), getCity(), getPhone());
  }
}