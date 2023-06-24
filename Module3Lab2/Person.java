/* UML CLASS DIAGRAM:
-----------------------------------------
Person
-----------------------------------------
- Name : String    
- City : String
- Phone : String
+ pin : int
-----------------------------------------
+ Person()
+ Person(Name : String, City : String, Phone : String)

+ getName() : String
+ getCity() : String
+ getPhone() : String
+ setName(newName : String) : void
+ setCity(newCity : String) void
+ setPhone(newPhone : String) : void

+ toString() : String
-----------------------------------------
*/
import java.math.*;

public class Person {
  private String Name;
  private String City;
  private String Phone;
  int pin;

  public Person(){
    //this.pin = (int)(Math.random()*100); 
  }
  
  public Person(String name, String city, String phone){
    this.Name = name;
    this.City = city;
    this.Phone = phone;
    this.pin = (int)(Math.random()*100);
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
  public void printInfo(){
    System.out.printf("Person: %s stays in %s, with phone# %s",getName(),getCity(),getPhone());
  }
}