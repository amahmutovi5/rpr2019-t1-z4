
    package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

    class ArtiklTest {

        @org.junit.jupiter.api.Test
        void getKod() {
            Artikl a=new Artikl("AA",1000,"k");
            assertEquals("k",a.getKod());
        }

        @org.junit.jupiter.api.Test
        void getNaziv() {
            Artikl a=new Artikl("AA",1000,"k");
            assertEquals("AA",a.getNaziv());
        }

        @org.junit.jupiter.api.Test
        void getCijena() {
            Artikl a=new Artikl("AA",1000,"k");
            assertEquals(1000,a.getCijena());
        }
    }

