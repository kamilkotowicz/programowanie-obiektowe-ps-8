import java.util.ArrayList;
import java.util.List;
public class Klient {
    private List<Konto> konta = new ArrayList<>();
    public void dodajKonto(Konto k){
        konta.add(k);
    }
    public List<Konto> getKonta(){
        return konta;
    }
}
