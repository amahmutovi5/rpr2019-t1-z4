package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] niz=new Artikl[50];

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl b=new Artikl();

        for(int i=0;i<50;i++) {
            if(niz[i].getKod().equals(kod)) {
                b= niz[i];
                for(int j=i;j<49;j++){

                    niz[j]=niz[j+1];
                }
                break;
            }

        }
        return b;
    }


    public Artikl[] getArtikli() {
        return niz;
    }

    public boolean dodajArtikl(Artikl a) {
        int i=0;
        boolean k=false;
        while(niz[i]!=null) i++;
        if(i<50) {
            niz[i] = a;
            k = true;
        }
        return k;
    }

    public int dajUkupnuCijenuArtikala() {
        int i=0;
        int ukupno=0;
        while(niz[i]!=null) {
            ukupno=ukupno+niz[i].getCijena();
            i++;
        }
        return ukupno;
    }
}
