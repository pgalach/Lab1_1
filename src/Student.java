import java.util.Scanner;
public class Student {
    public static void  main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wypelnij kolejne dane dotyczace Studenta: ");
        System.out.println("Imie: ");
        String imie = scanner.nextLine();
        System.out.println("Nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Uczelmia: ");
        String uczelnia = scanner.nextLine();
        System.out.println("Kierunek: ");
        String kierunek = scanner.nextLine();
        System.out.println("Wiek: ");
        String wiek = scanner.nextLine();
        System.out.println("Nr. Albumu: ");
        String nr = scanner.nextLine();
        System.out.println("Semestr: ");
        String semestr = scanner.nextLine();

        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Uczelnia: " + uczelnia);
        System.out.println("Kierunek: " + kierunek);
        System.out.println("Wiek: " + wiek );
        System.out.println("Nr. Albumu: " + nr);
        System.out.println("Semestr: " + semestr);

        scanner.close();

    }
}
