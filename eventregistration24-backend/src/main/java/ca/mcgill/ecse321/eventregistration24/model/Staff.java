package ca.mcgill.ecse321.eventregistration24.model;

import jakarta.persistence.Entity;

@Entity
public class Staff extends Account
{

  public Staff(int aId, String aName)
  {
    super(aId, aName);
  }
  
}