package cz.itnetwork.projekt;

import java.util.ArrayList;

/**
 * Třída reprezentuje databázi pojištěných
 */
public class Databaze {
    /**
     * Pojištěné osoby
     */
    private ArrayList<Pojisteny> pojisteni;

    /**
     * Konstruktor pro inicializaci nové instance
     */
    public Databaze(){
        pojisteni = new ArrayList<Pojisteny>();
    }

    /**
     * Metoda pro přidání pojištěného
     * @param jmeno křestní jméno
     * @param prijmeni příjmení
     * @param telefon telefonní číslo
     * @param vek věk
     */
    public void pridejPojisteneho(String jmeno, String prijmeni, String telefon, int vek){
        pojisteni.add(new Pojisteny(jmeno, prijmeni, telefon, vek));
    }

    /**
     * Metoda pro vyhledání pojištěných
     * @param hledaneJmeno křestní jméno
     * @param hledanoPrijmeni příjmení
     * @return vrátí pojištěné odpovídající zadanému jménu a příjmení
     */
    public ArrayList<Pojisteny> vyhledejPojistene(String hledaneJmeno, String hledanoPrijmeni){
        ArrayList<Pojisteny> vyhledane = new ArrayList<Pojisteny>();
        for(Pojisteny pojisteny:pojisteni){
            if(pojisteny.getJmeno().equals(hledaneJmeno) && pojisteny.getPrijmeni().equals(hledanoPrijmeni)){
                vyhledane.add(pojisteny);
            }
        }
        return vyhledane;
    }
    public ArrayList<Pojisteny> vratVsechnyPojistene(){
        ArrayList<Pojisteny> vsichniPojisteni = new ArrayList<Pojisteny>();
        for(Pojisteny pojisteny:pojisteni){
            vsichniPojisteni.add(pojisteny);
        }
        return vsichniPojisteni;
    }
}
