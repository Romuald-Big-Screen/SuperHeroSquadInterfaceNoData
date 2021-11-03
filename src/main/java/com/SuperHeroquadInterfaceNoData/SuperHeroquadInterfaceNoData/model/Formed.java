package com.SuperHeroquadInterfaceNoData.SuperHeroquadInterfaceNoData.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "formed")
public class Formed {
   @Column(unique = true)
   private int formedYear;

   public Formed() {
   }

   public Formed(int formedYear) {
      this.formedYear = formedYear;
   }

   public int getFormedYear() {
      return formedYear;
   }

   public void setFormedYear(int formedYear) {
      this.formedYear = formedYear;
   }
}
