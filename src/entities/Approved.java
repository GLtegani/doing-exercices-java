package entities;

import java.util.ArrayList;

public class Approved {
   private int quantity;
   private String studentName;
   private double gradeOne;
   private double gradeTwo;
   private double gradeAverage;
   private ArrayList<String> studentsNames = new ArrayList<>();
   private ArrayList<Double> grades = new ArrayList<>();
   private ArrayList<String> approvedStudents = new ArrayList<>();

   public Approved() {
   }

   public int getQuantity() {
      return quantity;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public void setStudentName(String studentName) {
      this.studentName = studentName;
   }

   public void setGradeOne(double gradeOne) {
      this.gradeOne = gradeOne;
   }

   public void setGradeTwo(double gradeTwo) {
      this.gradeTwo = gradeTwo;
   }

   private void setGradeAverage() {
      this.gradeAverage = (this.gradeOne + this.gradeTwo) / 2;
   }

   public void setStudentsNames() {
      this.studentsNames.add(this.studentName);
   }

   public ArrayList<Double> getGrades() {
      return grades;
   }

   public void setGrades() {
      this.setGradeAverage();
      this.grades.add(gradeAverage);
   }

   public ArrayList<String> getApprovedStudents() {
      return approvedStudents;
   }

   public void setApprovedStudents() {
      for(int i = 0; i < this.getQuantity(); i++) {
         if(this.getGrades().get(i) >= 6.0) {
            this.approvedStudents.add(this.studentsNames.get(i));
         }
      }
   }

   @Override
   public String toString() {
      return "Approved{" +
         "quantity=" + quantity +
         ", studentName='" + studentName + '\'' +
         ", gradeOne=" + gradeOne +
         ", gradeTwo=" + gradeTwo +
         ", gradeAverage=" + gradeAverage +
         ", studentsNames=" + studentsNames +
         ", grades=" + grades +
         ", approvedStudents=" + approvedStudents +
         '}';
   }
}
