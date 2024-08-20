import pack.inheritance.ornek1.Futbol;
import pack.inheritance.ornek1.ToplaOynananSporDallari;
import pack.inheritance.ornek2.Aydinlatma;
import pack.inheritance.ornek2.RenkliLamba;
import pack.inheritance.ornek3.Kopek;
import pack.inheritance.ornek4.Cilek;
import pack.inheritance.ornek4.Elma;
import pack.inheritance.ornek4.Mandalina;
import pack.inheritance.ornek4.Meyve;

public class Main {
    public static void main(String[] args) {
        //ORNEK1
        ToplaOynananSporDallari toplaOynananSporDallari = new ToplaOynananSporDallari();
        toplaOynananSporDallari.topaVur();

        Futbol futbol = new Futbol();
        futbol.topaVur();
        futbol.sutCek();


        //ORNEK2
        Aydinlatma aydinlatma = new Aydinlatma();
        aydinlatma.sistemUrunSayisi = 10;
        aydinlatma.garantiSuresi = 2;
        aydinlatma.sistemiAc();
        aydinlatma.isiklariAc();
        aydinlatma.isiklariKapat();
        aydinlatma.sistemiKapat();
        System.out.println("Aydınlatma urun sayisi: " + aydinlatma.sistemUrunSayisi);
        System.out.println("Aydinlatma garanti suresi: " + aydinlatma.garantiSuresi);

        RenkliLamba renkliLamba = new RenkliLamba();
        renkliLamba.garantiSuresi = 1;
        renkliLamba.sistemUrunSayisi = 5;
        renkliLamba.sistemiAc();
        renkliLamba.isiklariAc();
        renkliLamba.renkDegistir();
        renkliLamba.isiklariKapat();
        renkliLamba.sistemiKapat();
        System.out.println("Renkli lamba urun sayisi: " + renkliLamba.sistemUrunSayisi);
        System.out.println("Renkli lamba garanti suresi: " + renkliLamba.garantiSuresi);


        //ORNEK3
        Kopek kopek = new Kopek();
        System.out.println(kopek instanceof Kopek);


        //ORNEK4
        Meyve cilek = new Cilek();
        Meyve meyve = new Meyve();

        meyveIslemiYap(cilek);
        meyveIslemiYap(meyve);
    }


    //ORNEK4
    public static void meyveIslemiYap(Meyve meyve) {
        if (meyve instanceof Cilek) {
            ((Cilek) meyve).tatTestiYap();
        } else if (meyve instanceof Elma) {
            ((Elma) meyve).meyveSoy();
        } else if (meyve instanceof Mandalina) {
            ((Mandalina) meyve).meyveSuyuYap();
        } else {
            meyve.meyveYe();
        }
    }
}

    /*  //Polımorphızm ORNEK1
        DemirFirmasiCalisanlari demirFirmasiCalisanlari = new DemirFirmasiCalisanlari();
        demirFirmasiCalisanlari.calisanSayisiniYazdir(800);
        demirFirmasiCalisanlari.firmaAdi = "Demir Firmasi";
        System.out.println(demirFirmasiCalisanlari.firmaAdi + " maas: " + demirFirmasiCalisanlari.maasiYaz(1400));
        System.out.println("Prim miktari: " + demirFirmasiCalisanlari.primGetir(300));

        Calisanlar demirFirmasiCalisanlari2 = new DemirFirmasiCalisanlari();
        demirFirmasiCalisanlari2.calisanSayisiniYazdir(1000);
        demirFirmasiCalisanlari2.firmaAdi = "Demir Firmasi";
        System.out.println(demirFirmasiCalisanlari2.firmaAdi + " maas: " + demirFirmasiCalisanlari2.maasiYaz(1200));

    */
