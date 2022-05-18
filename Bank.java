import java.util.ArrayList;
import java.util.List;
public class Bank {
    private List<Klient> klienci = new ArrayList<>();
    public void dodajKlienta(Klient k){
        klienci.add(k);
    }
    List<Klient> getKlienci(){
        return klienci;
    }
    public Bank(){

    }
}
