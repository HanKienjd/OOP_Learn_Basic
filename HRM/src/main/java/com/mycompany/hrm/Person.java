
package com.mycompany.hrm;

/**
 *
 * @author handev
 */
public class Person {
    private String name;
    private String birthday;
    private String address;
    private String gender;
    
    public Person(){
        
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getBirthday(){
        return birthday;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    
    public String getAddress(){
          return address;
      }
    public void setAddress(String address){
          this.address = address;
      }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public String showInfo(String name, String birthday, String address, String gender){
        return "Person : name:" + name + ",birthday: " + birthday + ", address: " + address + ",gender: " + gender;
    }
    
}
