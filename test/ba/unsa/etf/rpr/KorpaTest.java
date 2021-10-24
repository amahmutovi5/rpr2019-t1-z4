package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
//import sun.nio.cs.KOI8_R;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void izbaciArtiklSaKodom() {

        Korpa k=new Korpa();

        Artikl  a= new Artikl("a",1000,"kodd");
        k.dodajArtikl(a);
        assertEquals(1000,k.izbaciArtiklSaKodom("kodd").getCijena());
    }

    @Test
    void getArtikli() {
        Korpa k=new Korpa();
        Artikl a= new Artikl("A",1500,"swe0");
        Artikl b= new Artikl("b",1420,"12lk");
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        assertEquals("A",k.getArtikli()[0].getNaziv());

    }

    @Test
    void dodajArtikl() {
        Korpa k= new Korpa();
        Artikl a= new Artikl("a",200,"3325");
        assertTrue( k.dodajArtikl(a));

    }
    @Test
    void dodajArtikl2() {
        Korpa k= new Korpa();
        Artikl a= new Artikl("a",200,"3325");


        assertThrows(ArrayIndexOutOfBoundsException.class,()-> {
            for(int i=0;i<=50;i++) {
                k.dodajArtikl(a);
            }});
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k= new Korpa();
        Artikl a= new Artikl("a",200,"3325");

        Artikl b= new Artikl("b",1500,"332554");
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        assertEquals(1700,k.dajUkupnuCijenuArtikala());
    }
}
