package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] artikli=new Artikl[1000];
    public void dodajArtikl(Artikl a) {

        int i = 0;
        while (artikli[i] != null) i++;
        artikli[i] = a;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a=new Artikl("A",0,"0");
        for(int i=0;i<1000;i++) {
            if(artikli[i].getKod().equals(kod)) {

                a=artikli[i];
                for(int j=i;j<999;j++){

                    artikli[j]=artikli[j+1];
                }
                break;
            }
        }

        return a;
    }



    public Artikl[] getArtikli() {
        return artikli;
    }
}
