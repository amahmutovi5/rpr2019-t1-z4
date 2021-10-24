package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket s= new Supermarket();
        Artikl a= new Artikl("a",200,"3325");

        Artikl b= new Artikl("b",2000,"swwrf");
        s.dodajArtikl(a);
        s.dodajArtikl(b);
        assertEquals(2000,s.getArtikli()[1].getCijena());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s= new Supermarket();
        Artikl a= new Artikl("a",200,"3325");
        Artikl b= new Artikl("b",2000,"swwrf");
        s.dodajArtikl(a);
        s.dodajArtikl(b);

        assertEquals("swwrf", s.izbaciArtiklSaKodom("swwrf").getKod());
    }

    @Test
    void getArtikli() {
        Supermarket s= new Supermarket();
        Artikl a= new Artikl("a",200,"3325");
        Artikl b= new Artikl("b",2000,"swwrf");
        s.dodajArtikl(a);
        s.dodajArtikl(b);
        assertEquals(2000,s.getArtikli()[1].getCijena());
    }
}

