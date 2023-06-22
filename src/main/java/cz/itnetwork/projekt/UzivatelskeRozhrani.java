package cz.itnetwork.projekt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Třída reprezentuje uživatelské rozhraní
 */
public class UzivatelskeRozhrani {
    /**
     * Databáze
     */
    private Databaze databaze;
    private Scanner sc = new Scanner(System.in, "Windows-1250");

    /**
     * Konstruktor pro inicializaci nové instance
     */
    public UzivatelskeRozhrani(){
        databaze = new Databaze();
    }

    /**
     * Metoda pro zjištění křestního jména pojištěného
     * @return křestní jméno
     */
    public String zjistiJmeno(){
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno= sc.nextLine();
        return jmeno;
    }

    /**
     * Metoda pro zjištění příjmení pojištěného
     * @return příjmení
     */
    public String zjistiPrijmeni(){
        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeni = sc.nextLine();
        return prijmeni;
    }

    /**
     * Metoda pro zjištění telefonního čísla pojištěného
     * @return telefonní číslo
     */
    public String zjistiTelefon(){
        System.out.println("Zadejte telefonní číslo:");
        String telefon = sc.nextLine();
        return telefon;
    }

    /**
     * Metoda pro zjištění věku pojištěného
     * @return věk pojištěného
     */
    public int zjistiVek(){
        System.out.println("Zadejte věk:");
        while(true){
            try{
                int vek = Integer.parseInt(sc.nextLine());
                return vek;
            } catch (Exception exception) {
                System.out.println("Nesprávně zadáno, zadejte prosím znovu");
            }
        }

    }

    /**
     * Metoda pro výpis všech pojištěných
     */
    public void vypisPojistene(){
        ArrayList<Pojisteny> pojisteni = databaze.vratVsechnyPojistene();
        if(pojisteni.size()>0){
            for(Pojisteny pojisteny:pojisteni) {
                System.out.println(pojisteny);
            }
            System.out.println();
            System.out.println("Pokračujte libovolnou klávesou...");
        } else  {
            System.out.println("Nebyly nalezeny žádné záznamy");
        }

    }

    /**
     * Metoda pro výpis přidání pojištěného
     */
    public void pridejPojisteneho(){
        String jmeno = zjistiJmeno();
        String prijmeni = zjistiPrijmeni();
        String telefon = zjistiTelefon();
        int vek = zjistiVek();
        databaze.pridejPojisteneho(jmeno, prijmeni, telefon, vek);
        System.out.println();
        System.out.println("Data byla uložena, pokračujte libovolnou klávesou...");
    }
    public void vyhledejPojistene(){
        String jmeno = zjistiJmeno();
        String prijmeni = zjistiPrijmeni();
        ArrayList<Pojisteny> vyhledaniPojisteni = databaze.vyhledejPojistene(jmeno, prijmeni);
        if(vyhledaniPojisteni.size()>0){
            for(Pojisteny vyhledanyPojisteny:vyhledaniPojisteni){
                System.out.println(vyhledanyPojisteny);
            }
            System.out.println();
            System.out.println("Pokračujte libovolnou klávesou...");
        } else {
            System.out.println();
            System.out.println("Vyhledávání neodpovídají žádné záznamy");
        }
    }
    public void vypisUvodniObrazovku(){
        System.out.println("-----------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("-----------------------------");
        System.out.println();


    }
}
