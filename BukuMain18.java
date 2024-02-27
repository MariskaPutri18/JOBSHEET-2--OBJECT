public class BukuMain18 {
    public static void main(String[] args) {
        Buku bk1 = new Buku();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
       
        double totalHarga = bk1.hitungHargaTotal(5);
        System.out.println("Harga Total: Rp " + totalHarga);
        double diskon = bk1.hitungDiskon((int) totalHarga, bk1.harga);
        System.out.println("Diskon Buku : Rp " + diskon);
        double hargabayar = bk1.hitungHargaBayar((int) totalHarga, (int) diskon);
        System.out.println("Total harga bayar : Rp " + hargabayar);
       
        Buku bk2 = new Buku ("Self Reward", "Maheera ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        double totalHarga1 = bk2.hitungHargaTotal(11);
        System.out.println("Harga Total: Rp " + totalHarga1);
        double diskon1 = bk2.hitungDiskon((int) totalHarga1, bk2.harga);
        System.out.println("Diskon Buku : Rp " + diskon1);
        double hargabayar1= bk2.hitungHargaBayar((int) totalHarga1, (int) diskon1);
        System.out.println("Total harga bayar : Rp " + hargabayar1);
       
        Buku bukuMahasiswa = new Buku("Laut Berceria", "Laila S.Chudori", 379, 5, 89000);
        bukuMahasiswa.terjual(2);
        bukuMahasiswa.tampilInformasi();
        double totalHarga2 = bukuMahasiswa.hitungHargaTotal(2);
        System.out.println("Harga Total: Rp " + totalHarga2);
        double diskon2 = bukuMahasiswa.hitungDiskon((int) totalHarga2, bukuMahasiswa.harga);
        System.out.println("Diskon Buku : Rp " + diskon2);
        double hargabayar2 = bukuMahasiswa.hitungHargaBayar((int) totalHarga2, (int) diskon2);
        System.out.println("Total harga bayar : Rp " + hargabayar2);
       
      }      
}

class Buku {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        stok -= jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jml) {
        int hargaTotal = jml * harga;
        return hargaTotal;
    }

    int hitungDiskon(int hargaTotal, int harga){
        int diskon = 0;
        if (hargaTotal >150000) {
            diskon = (int) (harga * 0.12);  
        }else if (hargaTotal > 75000 && hargaTotal < 150000  ){
            diskon = (int) (harga * 0.15);
        }
        return diskon;
    }

    int hitungHargaBayar(int hargaTotal, int diskon){
        int hargabayar= hargaTotal- diskon;
        return hargabayar;

    }
    public Buku(){

    }
    public Buku(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
  }  