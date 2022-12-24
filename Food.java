import java.util.Scanner;

public class Food extends Layanan{
    protected int harga;
    public String pengemudi;
    public String jenis;
    @Override
    void daftar() {
        System.out.println("=======================");
        System.out.println("Daftar Toko");
        System.out.println("=======================");
        System.out.println("[1] Makanan Berat");
        System.out.println("[2] Makanan Ringan");
        System.out.println("[3] Makanan Cepat Saji");
        System.out.println("[4] Minuman");
        pilihLayanan();
    }

    @Override
    void pilihLayanan() {
        Layanan.layanan="Ngofood";
        System.out.println("Pilih Yang Mana Anda Suka ");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        switch (pilih){
            case 1 :
                System.out.println("Anda memilih Makanan Berat");
                System.out.print("Pengumudi : Asep");
                Layanan.pengemudi = "Asep";
                Layanan.jenis = "Nasi cumi sambal bawang rica-rica";
                Layanan.harga = 17000;
                break;
            case 2 :
                System.out.println("Anda memilih Makanan Ringan");
                System.out.print("Pengumudi : Budi");
                Layanan.pengemudi = "Rudi";
                Layanan.jenis = "Cimol dan Kentang";
                Layanan.harga = 10000;
                break;
            case 3 :
                System.out.println("Anda memilih Makanan Cepat Saji");
                System.out.print("Pengemudi : Tono");
                Layanan.pengemudi = "Tono";
                Layanan.jenis = "Burger Bangor";
                Layanan.harga = 45000;
                break;
            case 4 :
                System.out.println("Anda memilih Minuman");
                System.out.print("Pengemudi : Joko");
                Layanan.pengemudi = "Joko";
                Layanan.jenis = "Susu Sarjana";
                Layanan.harga = 10000;
                break;
        }
    }
}
