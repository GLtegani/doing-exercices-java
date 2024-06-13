import entities.Person;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
//      EX 1
//      System.out.print("How many numbers will you enter? ");
//      int[] numbers = new int[sc.nextInt()];
//
//      for(int i = 0; i < numbers.length; i++) {
//         System.out.print("Type a number: ");
//         numbers[i] = sc.nextInt();
//      }
//
//      System.out.println("Negative numbers: ");
//
//      for(int i = 0; i < numbers.length; i++) {
//         if(numbers[i] < 0) {
//            System.out.printf("%d\n", numbers[i]);
//         }
//      }

//      EX 2

//      System.out.print("How many numbers will you enter? ");
//      double[] numbers = new double[sc.nextInt()];
//
//      for(int i = 0; i < numbers.length; i++) {
//         System.out.print("Type a number: ");
//         numbers[i] = sc.nextDouble();
//
//      }
//      System.out.print("Values = ");
//
//      for(int i = 0; i < numbers.length; i++) {
//         System.out.printf("%.1f  ", numbers[i]);
//      }
//
//      System.out.println();
//
//      System.out.print("Sum = ");
//      double sum = 0.0;
//      for(int i = 0; i < numbers.length; i++) {
//         sum += numbers[i];
//      }
//
//      System.out.printf("%.2f", sum);
//
//      System.out.println();
//
//      System.out.print("Average = ");
//      double average = 0.0;
//
//      for(int i = 0; i < numbers.length; i++) {
//         average += numbers[i] / numbers.length;
//      }
//
//      System.out.printf("%.2f", average);

//      EX 3

      System.out.print("How many people will be entered? ");
      int n = sc.nextInt();
      Person person = new Person(n);
      String[] name = new String[n];
      int[] age = new int[n];
      double[] height = new double[n];
      for(int i = 0; i < n; i++) {
         if(i >= 0) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            person.setName(name);

            System.out.print("Age: ");
            age[i] = sc.nextInt();
            person.setAge(age);

            sc.nextLine();

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
            person.setHeight(height);
         }
      }

      System.out.printf(person + "%n");

      System.out.print("Average height: ");
      System.out.printf("%.2f %n", person.averageHeight());

      System.out.print("Pessoas com menos de 16 anos: ");
      System.out.print(person.percentualUnder16() + "%");
      System.out.println();

      for(int i = 0; i < n; i++) {
         if(person.getAge()[i] < 16) {
            System.out.printf(person.getName()[i] + "%n");
         }
      }

      sc.close();
   }
}
