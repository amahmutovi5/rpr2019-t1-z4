package ba.unsa.etf.rpr;

public class Artikl {
    String naziv = new String();
    int cijena;
    String kod;


    public Artikl(String s,int c,String k) {
        naziv=s;
        cijena=c;
        kod=k;
    }
    public Artikl() {
        naziv="";
        cijena=0;
        kod="";
    }
    public Artikl(Artikl a) {
        kod=a.getKod();
        cijena=a.getCijena();
        naziv=a.getNaziv();
    }
    public String getKod() {
        return kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }
}
