import java.util.Scanner;

public class Ojek extends Layanan{
    protected int harga;
    protected String pengemudi;
    protected String jenis;

    @Override
    void daftar() {
        System.out.println("=======================");
        System.out.println("Daftar Kendaraan");
        System.out.println("=======================");
        System.out.println("[1] Motor");
        System.out.println("[2] Mobil Kapasitas 4");
        System.out.println("[3] Mobil Kapasitas 6");
        pilihLayanan();
    }

    @Override
    void pilihLayanan() {
        Layanan.layanan="Ngojek";
        System.out.println("Pilih Kendaraan");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        switch (pilih){
            case 1 :
                System.out.println("Anda memilih dengan Motor");
                System.out.print("Pengumudi : Asep");
                Layanan.pengemudi = "Asep";
                Layanan.jenis = "Motor";
                Layanan.harga = 8000;
                break;
            case 2 :
                System.out.println("Anda memilih dengan Mobil Kapasitas 4");
                System.out.print("Pengumudi : Budi");
                Layanan.pengemudi = "Budi";
                Layanan.jenis = "Motor";
                Layanan.harga = 12000;
                break;
            case 3 :
                System.out.println("Anda memilih dengan Mobil Kapasitas 3");
                System.out.print("Pengemudi : Tono");
                Layanan.pengemudi = "Tono";
                Layanan.jenis = "Mobil";
                Layanan.harga = 16000;

        }
    }
}
