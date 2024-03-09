public class Ders {
    private String DersAdi;
    private int DersKodu;

    public Ders(String DersAdi, int DersKodu){
        this.DersAdi = DersAdi;
        this.DersKodu = DersKodu;
    }

    public String getDersAdi() {
        return DersAdi;
    }

    public void setDersAdi(String DersAdi) {
        this.DersAdi = DersAdi;
    }

    public int getDersKodu() {
        return DersKodu;
    }

    public void setDersKodu(int DersKodu) {
        this.DersKodu = DersKodu;
    }

}


