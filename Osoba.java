public class Osoba extends Klient {
    private String imie;
    private String nazwisko;
    private String PESEL;
    public Osoba(String imie, String nazwisko, String PESEL){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public String getPESEL(){
        return PESEL;
    }
}
