/* UML CLASS DIAGRAM:
-----------------------------------------
Client
-----------------------------------------
- Name : String    
- City : String
- Phone : String
- CLIENT_ID : final int
- baseID : static int 
-----------------------------------------
+ Client(Name : String, City : String, Phone : String)

+ getName() : String
+ getCity() : String
+ getPhone() : String
+ getClientID() : int
+ getNewID() : int
+ setName(newName : String) : void
+ setCity(newCity : String) void
+ setPhone(newPhone : String) : void
+ toString() : String
-----------------------------------------
*/


public class Client extends Person
{
  private static int baseID = 5000;
  private final int CLIENT_ID;
  private String Name;
  private String City;
  private String Phone;
  
  public Client(String name, String city, String phone){
    this.Name = name;
    this.City = city;
    this.Phone= phone;
    this.CLIENT_ID = getNewID();
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
  public int getClientID(){
    return CLIENT_ID;
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
    return String.format("Client: %s [%d] stays in %s, with phone# %s",getName(),getClientID(),getCity(),getPhone());
  }
}