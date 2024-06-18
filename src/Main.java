import entities.Approved;
import entities.OlderPerson;
import entities.Person;

import java.util.ArrayList;
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

//      System.out.print("How many people will be entered? ");
//      int n = sc.nextInt();
//      Person person = new Person(n);
//      String[] name = new String[n];
//      int[] age = new int[n];
//      double[] height = new double[n];
//      for(int i = 0; i < n; i++) {
//         if(i >= 0) {
//            sc.nextLine();
//            System.out.printf("Dados da %da pessoa: %n", i + 1);
//            System.out.print("Name: ");
//            name[i] = sc.nextLine();
//            person.setName(name);
//
//            System.out.print("Age: ");
//            age[i] = sc.nextInt();
//            person.setAge(age);
//
//            sc.nextLine();
//
//            System.out.print("Height: ");
//            height[i] = sc.nextDouble();
//            person.setHeight(height);
//         }
//      }
//
//      System.out.printf(person + "%n");
//
//      System.out.print("Average height: ");
//      System.out.printf("%.2f %n", person.averageHeight());
//
//      System.out.print("Pessoas com menos de 16 anos: ");
//      System.out.print(person.percentualUnder16() + "%");
//      System.out.println();
//
//      for(int i = 0; i < n; i++) {
//         if(person.getAge()[i] < 16) {
//            System.out.printf(person.getName()[i] + "%n");
//         }
//      }

//      EX 4

//      System.out.print("Quantos numeros voce vai digitar? ");
//      int[] numbersToType = new int[sc.nextInt()];
//      ArrayList<Integer> pairsNumbers = new ArrayList<>();
//
//      sc.nextLine();
//
//      for(int i = 0; i < numbersToType.length; i++) {
//         System.out.print("Digite um numero: ");
//         numbersToType[i] = sc.nextInt();
//
//         if(numbersToType[i] % 2 == 0) {
//            pairsNumbers.add(numbersToType[i]);
//         }
//
//      }
//
//      System.out.printf("NUMEROS PARES: %n");
//
//      for(int number : pairsNumbers) {
//         System.out.printf("%d  ", number);
//      }
//
//      System.out.printf("%nQUANTITADE DE PARES = %d", pairsNumbers.size());

//      EX 5

//      System.out.print("Quantos numeros voce vai digitar? ");
//      double[] numbers = new double[sc.nextInt()];
//      double higherNumber = 0;
//      int index = 0;
//
//      sc.nextLine();
//
//      for(int i = 0; i < numbers.length; i++) {
//         System.out.print("Digite um numero: ");
//         numbers[i] = sc.nextDouble();
//      }
//
//      for(int i = 0; i < numbers.length; i++) {
//         if(numbers[i] > higherNumber) {
//            higherNumber = numbers[i];
//            index = i;
//         }
//      }
//
//      System.out.printf("MAIOR VALOR = %.1f%n", higherNumber);
//      System.out.printf("POSICAO DO MAIOR VALOR = %d", index);

//      EX 6

//      System.out.print("Quantos valores vai ter cada array? ");
//      int n = sc.nextInt();
//
//      int[] arrayA = new int[n];
//      int[] arrayB = new int[n];
//
//      sc.nextLine();
//
//      System.out.printf("Digite os valores do array A:%n");
//
//      for(int i = 0; i < arrayA.length; i++) {
//         System.out.printf("%do Numero: ", i);
//         arrayA[i] = sc.nextInt();
//      }
//
//      sc.nextLine();
//      System.out.printf("Digite os valores do array B:%n");
//
//      for(int i = 0; i < arrayB.length; i++) {
//         System.out.printf("%do Numero: ", i);
//         arrayB[i] = sc.nextInt();
//      }
//
//      int[] arrayC = new int[n];
//
//      for(int i = 0; i < arrayC.length; i++) {
//         arrayC[i] = arrayA[i] + arrayB[i];
//      }
//
//      System.out.printf("VETOR RESULTANTE:%n");
//
//      for(int i = 0; i < arrayC.length; i++) {
//         System.out.printf("%d%n", arrayC[i]);
//      }

//      EX 7

//      System.out.print("Quantos elementos vai ter o array? ");
//      int[] numbersArray = new int[sc.nextInt()];
//      ArrayList<Integer> pairNumbers = new ArrayList<>();
//      double pairMedia = 0.0;
//
//      for(int i = 0; i < numbersArray.length; i++) {
//         System.out.print("Digite um numero: ");
//         numbersArray[i] = sc.nextInt();
//         if(numbersArray[i] % 2 == 0) {
//            pairNumbers.add(numbersArray[i]);
//         }
//      }
//
//      for(int i = 0; i < pairNumbers.size(); i++) {
//         pairMedia = pairMedia + pairNumbers.get(i);
//      }
//
//      pairMedia /= pairNumbers.size();
//      if(pairNumbers.size() == 0) {
//         System.out.print("NENHUM NUMERO PAR");
//      } else {
//         System.out.printf("MEDIA DOS PARES = %.1f", pairMedia);
//      }

//      EX 8

//      OlderPerson person = new OlderPerson();
//      System.out.print("Quantas pessoas voce vai digitar? ");
//      person.setQuantity(sc.nextInt());
//
//      sc.nextLine();
//      for(int i = 0; i < person.getQuantity(); i++) {
//         System.out.printf("Dados da %da pessoa:%n", i + 1);
//         System.out.print("Nome: ");
//         person.setName(sc.nextLine());
//         System.out.print("Idade: ");
//         person.setAge(sc.nextInt());
//         person.setPeopleName();
//         person.setPeopleAge();
//         sc.nextLine();
//      }
//
//      for(int i = 0; i < person.getQuantity(); i++) {
//         if(person.getPeopleAge().get(i) > person.getOlderAge()) {
//            person.setOlderAge(person.getPeopleAge().get(i));
//            person.setIndexOlderAge(i);
//         }
//      }
//
//      person.setOlderName(person.getPeopleName().get(person.getIndexOlderAge()));
//
//      System.out.printf("PESSOA MAIS VELHA: %s", person.getOlderName());

//      EX 9

//      Approved student = new Approved();
//      System.out.print("Quantos alunos serao digitados? ");
//      student.setQuantity(sc.nextInt());
//
//      sc.nextLine();
//
//      for(int i = 0; i < student.getQuantity(); i++) {
//         System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i + 1);
//         System.out.print("Nome: ");
//         student.setStudentName(sc.next());
//         System.out.printf("Primeira nota: ");
//         student.setGradeOne(sc.nextDouble());
//         System.out.print("Segunda nota: ");
//         student.setGradeTwo(sc.nextDouble());
//
//         student.setStudentsNames();
//         student.setGrades();
//      }
//
//      student.setApprovedStudents();
//
//      System.out.printf("Alunos aprovados: %n");
//      for(int i = 0; i < student.getApprovedStudents().size(); i++) {
//         System.out.printf("%s %n", student.getApprovedStudents().get(i));
//      }
//
//      System.out.print(student);

      sc.close();
   }
}
