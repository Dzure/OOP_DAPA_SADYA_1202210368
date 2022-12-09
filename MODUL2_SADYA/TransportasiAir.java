package MODUL2_SADYA;

public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    TransportasiAir(int jumlahKursi,int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
    public void informasi(){
        System.out.printf("Transportasi Air dengan jenis yang tidak diketahui dengan kursi"+jumlahKursi+"ditetapkan dengan biaya sebesar Rp. "+biaya);
    }
    public void berlayar(){
        System.out.printf("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
    }
    public void berlabuh(){
        System.out.printf("Transportasi Air dengan jenis tidak diketahui berlabuh di pantai");
    }
}
