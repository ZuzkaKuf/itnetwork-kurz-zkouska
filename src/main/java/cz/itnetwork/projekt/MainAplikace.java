package cz.itnetwork.projekt;

import java.util.Scanner;

public class MainAplikace {
    public static void main(String[] args) {
        UzivatelskeRozhrani ui = new UzivatelskeRozhrani();
        Scanner sc = new Scanner(System.in, "Windows-1250");
        String volba = "";

        while (!volba.equals("4")){
            ui.vypisUvodniObrazovku();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = sc.nextLine();
            System.out.println();

            switch (volba){
                case "1":
                    ui.pridejPojisteneho();
                    break;
                case "2":
                    ui.vypisPojistene();
                    break;
                case "3":
                    ui.vyhledejPojistene();
                    break;
                case "4":
                    System.out.println("Libovolnou klávesou ukončíte program...");
                    break;
                default:
                    System.out.println("Zadali jste neplatnou volbu, stiskněte libovolnou klávesu a opakujte volbu");
            }
        }
    }
}
