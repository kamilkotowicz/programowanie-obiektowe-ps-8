public class Konto {
    private String nr;
    private double saldo;
    public Konto(String nr){
        this.nr = nr;
        saldo = 0;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getNr(){
        return nr;
    }
    public void wplac(double kwota){
        saldo+=kwota;// nie sprawdza czy kwota jest wieksza od 0
    }
    public void wyplac(double kwota){
        saldo-=kwota; //nie sprawdza czy kwota jest wieksza od 0 i czy na koncie jest wystarczajace saldo
    }
}
