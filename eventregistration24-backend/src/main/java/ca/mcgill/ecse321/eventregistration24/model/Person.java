package ca.mcgill.ecse321.eventregistration24.model;

import java.sql.Date;

import jakarta.persistence.Entity;

@Entity
public class Person extends Account
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Person Attributes
  private Date birthday;
  private String address;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Person(Integer aId, String aName, Date aBirthday, String aAddress)
  {
    super(aId, aName);
    birthday = aBirthday;
    address = aAddress;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setBirthday(Date aBirthday)
  {
    boolean wasSet = false;
    birthday = aBirthday;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public Date getBirthday()
  {
    return birthday;
  }

  public String getAddress()
  {
    return address;
  }

}