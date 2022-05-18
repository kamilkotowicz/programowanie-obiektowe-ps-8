import java.util.List;

public class Main{
    public static void main(String[] args) {
        Bank b = stworzBank();
        List<Klient> klienci = b.getKlienci();
        double suma_firma=0,suma_osoba=0,suma_duza_firma=0,suma_wazna_osoba=0;
        for (Klient klient : klienci){
            List<Konto>konta = klient.getKonta();
            for (Konto konto: konta){
                double saldo = konto.getSaldo();
                if(klient instanceof Firma){
                    suma_firma+=saldo;
                }
                if(klient instanceof Osoba){
                    suma_osoba+=saldo;
                }
                if(klient instanceof DuzaFirma){
                    suma_duza_firma+=saldo;
                }
                if(klient instanceof WaznaOsoba){
                    suma_wazna_osoba+=saldo;
                }
            }
        }
        System.out.println("Laczne srodki na kontach wszystkich firm: " + suma_firma);
        System.out.println("Laczne srodki na kontach wszystkich osob fizycznych: " + suma_osoba);
        System.out.println("Laczne srodki na kontach duzych firm i waznych osob lacznie: " + (suma_duza_firma+suma_wazna_osoba));
        System.out.println("Laczne srodki na kontach zwyklych osob: " + (suma_osoba-suma_wazna_osoba));
    }


    public static Bank stworzBank(){
        Bank b = new Bank();
        Klient k1 = new DuzaFirma("Duza firma","1234567890");
        Klient k2 = new Firma("Mala firma","1234567891");
        Klient k3 = new WaznaOsoba("Wazna","Osoba","01234567890");
        Klient k4 = new Osoba("Zwykla","Osoba","01234567891");
        b.dodajKlienta(k1);
        b.dodajKlienta(k2);
        b.dodajKlienta(k3);
        b.dodajKlienta(k4);
        Konto k11 = new Konto("11");
        Konto k12 = new Konto("12");
        Konto k13 = new Konto("13");
        Konto k21 = new Konto("21");
        Konto k31 = new Konto("31");
        Konto k32 = new Konto("32");
        Konto k41 = new Konto("41");
        k1.dodajKonto(k11);
        k1.dodajKonto(k12);
        k1.dodajKonto(k13);
        k2.dodajKonto(k21);
        k3.dodajKonto(k31);
        k3.dodajKonto(k32);
        k4.dodajKonto(k41);
        k11.wplac(264000);
        k12.wplac(975000);
        k13.wplac(358000);
        k21.wplac(8000);
        k31.wplac(6000);
        k32.wplac(6000);
        k41.wplac(600);
        return b;
    }

}