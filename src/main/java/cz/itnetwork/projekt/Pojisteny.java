package cz.itnetwork.projekt;

/**
 * Třída reperezentuje pojištěného
 */
public class Pojisteny {
    /**
     * Křestní jméno pojištěného
     */
    private String jmeno;
    /**
     * Příjmení pojištěného
     */
    private String prijmeni;
    /**
     * Telefonní číslo pojištěného
     */
    private String telefon;
    /**
     * Věk pojištěného
     */
    private int vek;

    /**
     * Konstruktor pro inicializaci instance
     * @param jmeno křestní jméno
     * @param prijmeni příjmení
     * @param telefon telefonní číslo
     * @param vek věk
     */
    public Pojisteny (String jmeno, String prijmeni, String telefon, int vek){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefon = telefon;
        this.vek = vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    /**
     * Vrátí textovou reprezentaci pojištěného
     * @return textová reprezentace pojištěného
     */
    @Override
    public String toString(){
        return String.format("%s\t%s  %d\t\t%s", jmeno, prijmeni, vek, telefon);
    }

}
