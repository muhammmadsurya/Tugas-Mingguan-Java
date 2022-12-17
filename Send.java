import java.util.Scanner;

public class Send extends Layanan{
    protected int harga;
    public String pengemudi;
    public String jenis;
    @Override
    void daftar() {
        System.out.println("=======================");
        System.out.println("Daftar Barang");
        System.out.println("=======================");
        System.out.println("[1] Barang < 1Kg");
        System.out.println("[2] Barang 1Kg");
        System.out.println("[3] Barang 2Kg");
        System.out.println("[4] Barang 3Kg");
        System.out.println("[5] Barang > 5Kg");
        pilihLayanan();
    }

    @Override
    void pilihLayanan() {
        System.out.println("Pilih keinginan anda ");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        switch (pilih){
            case 1 :
                System.out.println("Barang yang akan Anda kirimkan Kurang 1Kg");
                System.out.print("Pengumudi : Asep");
                jenis = "Barang < 1Kg";
                Layanan.harga = 8000;
                break;
            case 2 :
                System.out.println("Barang yang akan Anda kirimkan 1Kg");
                System.out.print("Pengumudi : Budi");
                jenis = "Barang 1kg";
                Layanan.harga = 10000;
                break;
            case 3 :
                System.out.println("Barang yang akan Anda kirimkan 2kg");
                System.out.print("Pengemudi : Tono");
                jenis = "Barang 2kg";
                Layanan.harga = 15000;
                break;
            case 4 :
                System.out.println("Barang yang akan Anda kirimkan 3kg");
                System.out.print("Pengemudi : Joko");
                jenis = "Barang 3kg";
                Layanan.harga = 20000;
                break;
            case 5 :
                System.out.println("Barang yang akan Anda kirimkan > 3");
                System.out.print("Pengemudi : Hisbullah");
                jenis = "Barang > 3kg";
                Layanan.harga = 30000;
                break;
        }
    }
}
