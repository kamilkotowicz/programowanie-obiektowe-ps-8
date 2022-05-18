public class Firma extends Klient {
    private String nazwa;
    private String KRS;
    public Firma(String nazwa, String KRS){
        this.nazwa = nazwa;
        this.KRS = KRS;
    }
    public String getNazwa(){
        return nazwa;
    }
    public String getKRS(){
        return KRS;
    }
}
