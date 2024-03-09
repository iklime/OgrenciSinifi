
public class Main {
    public static void main(String[] args) {

        System.out.println(ogrenci.getCount());

        ogrenci ogr1 = new ogrenci();
        ogrenci ogr2 = new ogrenci("Gökhan","Bilgisayar Mühendisliği");
        ogrenci ogr3 = new ogrenci("Ayse","Makine Mühendisliği");
        ogrenci ogr4 = new ogrenci("Elif","2020",1.98,"Elektrik-Elektronik Mühendisliği",104);


        System.out.println("Öğrenci Bilgileri");
        System.out.println("ogr1 " + ogr1.getAd() + " " + ogr1.getBolum() + " "
                + ogr1.ogrenciNoOlustur() + " " + ogr1.getGano() );
        System.out.println("ogr2 " + ogr2.getAd() + " " + ogr2.getBolum() + " "
                + ogr2.ogrenciNoOlustur() + " " + ogr2.getGano() );
        System.out.println("ogr3 " + ogr3.getAd() + " " + ogr3.getBolum() + " "
                + ogr3.ogrenciNoOlustur() + " " + ogr3.getGano() );
        System.out.println("ogr4 " + ogr4.getAd() + " " + ogr4.getBolum() + " "
                + ogr4.ogrenciNoOlustur() + " " + ogr4.getGano() );



        Ders ders1 = new Ders("Matematik", 101);
        Ders ders2 = new Ders("Fizik", 102);
        Ders ders3 = new Ders("Kimya", 103);
        Ders [] dersler = {ders1, ders2, ders3};

        ogr2.setDers(dersler);
        System.out.println("Ogr3 harc :" + ogr2.harcHesapla(4));

        ogr4.setDers(dersler);
        System.out.println("Ogr4 harc :" + ogr4.harcHesapla(8));




    }}
