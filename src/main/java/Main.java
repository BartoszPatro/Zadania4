/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {


    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Wybierz opcję: ");
      System.out.println("1. Dodaj studenta");
      System.out.println("2.Wypisz wszystkich studentów");
      System.out.println("3.Dodaj nowego studenta z konsoli z innymi danymi");

      int opcja=scanner.nextInt();

      switch(opcja)
        {
            case 1:
            System.out.println("Podaj imię studenta: ");
            String imie=scanner.nextLine();
            System.out.println("Podaj nazwisko studenta: ");
            String nazwisko=scanner.nextLine();
            System.out.println("Podaj wiek studenta: ");
            int wiek=scanner.nextInt();
            System.out.println("Nowy student to:" + imie + " " + nazwisko+ " " + wiek );
            s.addStudent(new Student(imie, wiek));





        }
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
      scanner.close();
    } catch (IOException e) {

    }
  }
}