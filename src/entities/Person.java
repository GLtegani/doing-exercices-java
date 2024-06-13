package entities;

import java.util.Arrays;

public class Person {
   private int n;
   private String[] name = new String[n];
   private int[] age = new int[n];
   private double[] height = new double[n];
   private double heightsSum;
   private double newPeople = 0.0;

   public Person(int n) {
      this.n = n;
   }

   public int getN() {
      return n;
   }

   public String[] getName() {
      return name;
   }

   public int[] getAge() {
      return age;
   }

   public double[] getHeight() {
      return height;
   }

   public void setN(int n) {
      this.n = n;
   }

   public void setName(String[] name) {
      this.name = name;
   }

   public void setAge(int[] age) {
      this.age = age;
   }

   public void setHeight(double[] height) {
      this.height = height;
   }

   private void setHeightsSum(int i) {
      this.heightsSum += height[i];
   }

   public double averageHeight() {
      for(int i = 0; i < n; i++) {
         setHeightsSum(i);
      }

      return heightsSum / n;
   }

   public double percentualUnder16() {
      for(int i = 0; i < n; i++) {
         if(age[i] < 16) {
            newPeople++;
         }
      }
      return (newPeople / n) * 100;
   }

   @Override
   public String toString() {
      return "Person{" +
         "n=" + n +
         ", name=" + Arrays.toString(name) +
         ", age=" + Arrays.toString(age) +
         ", height=" + Arrays.toString(height) +
         ", heightsSum=" + heightsSum +
         '}';
   }
}
