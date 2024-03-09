
public class ogrenci {
    private String ad;
    private String girisYili;
    private String ogrNo;
    private double gano;
    private String bolum;
    private int bolumKodu;
    private static int count;

    private Ders dersler[];

    public ogrenci(String ad, String girisYili, double gano, String bolum, int bolumKodu) {
        if(gano<0 || gano>4)
            throw new IllegalArgumentException("Gano 0 ile 4 arasında olmalıdır.");

        this.ad = ad;
        this.girisYili = girisYili;
        this.gano = gano;
        this.bolum = bolum;
        this.bolumKodu = bolumKodu;
    }

    public ogrenci(){
        this(null,"1973",0,null,104);
    }

    public ogrenci(String ad, String bolum){
        this(ad,"1985",0,bolum,104);
    }

    public ogrenci(ogrenci ogrenci){
        this(ogrenci.ad,ogrenci.girisYili,ogrenci.gano,ogrenci.bolum,ogrenci.bolumKodu);
    }

    public String ogrenciNoOlustur(){
        count=1;

        if(count<10)
            return (girisYili + bolumKodu + "00" + count);
        else if(count<100)
            return (girisYili + bolumKodu + "0" + count);
        else
            return (girisYili + bolumKodu + count);
    }




    public double harcHesapla( int uzatmaYili){
        return  uzatmaYili * 120;
    }



    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(String girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public static int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Ders[] getdersler() {
        return dersler;
    }

    public void setDers(Ders[] dersler) {
        this.dersler = dersler;
    }
}

