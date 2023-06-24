/* UML CLASS DIAGRAM:
-----------------------------------------
Person
-----------------------------------------
- Name : String    
- City : String
- Phone : String
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

public class Person {
  private String Name;
  private String City;
  private String Phone;
  
  public Person(){ }
  
  public Person(String name, String city, String phone){
    this.Name = name;
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
    return String.format("Person: %s stays in %s, with phone# %s",getName(),getCity(),getPhone());
  }
}