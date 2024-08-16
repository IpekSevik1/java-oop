import pack.inheritance.ornek1.Futbol;
import pack.inheritance.ornek2.Aydinlatma;
import pack.inheritance.ornek2.RenkliLamba;
import pack.inheritance.ornek3.Calisanlar;
import pack.inheritance.ornek3.DemirFirmasiCalisanlari;
import pack.inheritance.ornek4.Animal;
import pack.inheritance.ornek4.Dog;
import pack.inheritance.ornek5.Cilek;
import pack.inheritance.ornek5.Elma;
import pack.inheritance.ornek5.Mandalina;
import pack.inheritance.ornek5.Meyve;

public class Main {
    public static void main(String[] args) {
        //ORNEK1
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
        DemirFirmasiCalisanlari demirFirmasiCalisanlari = new DemirFirmasiCalisanlari();
        demirFirmasiCalisanlari.calisanSayisi(800);
        demirFirmasiCalisanlari.firmaAdi = "Demir Firmasi";
        System.out.println(demirFirmasiCalisanlari.firmaAdi + " maas: " + demirFirmasiCalisanlari.maasiYaz(1400));
        System.out.println("Prim miktari: " + demirFirmasiCalisanlari.primGetir(300));

        Calisanlar demirFirmasiCalisanlari2 = new DemirFirmasiCalisanlari();
        demirFirmasiCalisanlari2.calisanSayisi(1000);
        demirFirmasiCalisanlari2.firmaAdi = "Demir Firmasi";
        System.out.println(demirFirmasiCalisanlari2.firmaAdi + " maas: " + demirFirmasiCalisanlari2.maasiYaz(1200));

        //ORNEK4
        Dog dog = new Dog();
        System.out.println(dog instanceof Animal);

        //ORNEK5
        Meyve meyve1 = new Elma();
        Meyve meyve2 = new Cilek();
        Meyve meyve3 = new Mandalina();
        Meyve meyve4 = new Meyve();

        meyveIslemiYap(meyve1);
        meyveIslemiYap(meyve2);
        meyveIslemiYap(meyve3);
        meyveIslemiYap(meyve4);
    }

    //ORNEK5
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