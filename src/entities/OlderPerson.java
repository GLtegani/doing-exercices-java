package entities;

import java.util.ArrayList;
import java.util.Arrays;

public class OlderPerson {
   private int quantity;
   private String name;
   private int age;
   private int olderAge = 0;
   private String olderName;
   private int indexOlderAge;
   private ArrayList<String> peopleName = new ArrayList<>();
   private ArrayList<Integer> peopleAge = new ArrayList<>();

   public OlderPerson() {
   }

   public int getQuantity() {
      return quantity;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public ArrayList<String> getPeopleName() {
      return peopleName;
   }

   public void setPeopleName() {
      peopleName.add(name);
   }

   public ArrayList<Integer> getPeopleAge() {
      return peopleAge;
   }

   public void setPeopleAge() {
      peopleAge.add(age);
   }

   public int getOlderAge() {
      return olderAge;
   }

   public void setOlderAge(int olderAge) {
      this.olderAge = olderAge;
   }

   public int getIndexOlderAge() {
      return indexOlderAge;
   }

   public void setIndexOlderAge(int indexOlderAge) {
      this.indexOlderAge = indexOlderAge;
   }

   public String getOlderName() {
      return olderName;
   }

   public void setOlderName(String olderName) {
      this.olderName = olderName;
   }

   @Override
   public String toString() {
      return "OlderPerson{" +
         "quantity=" + quantity +
         ", name='" + name + '\'' +
         ", age=" + age +
         ", olderAge=" + olderAge +
         ", indexOlderAge=" + indexOlderAge +
         ", peopleName=" + peopleName +
         ", peopleAge=" + peopleAge +
         '}';
   }
}
