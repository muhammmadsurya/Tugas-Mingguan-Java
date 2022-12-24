import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pemesanan implements Ngojek{
    private String email;
    private String namaPenumpang;
    private String noHp;
    public int uang;
    private int idTransaksi;
    public int jarak;
    protected double totalBiaya;

    @Override
    public void Form() {
        Scanner in = new Scanner(System.in);
        System.out.println("==DATA DIRI USER==");
        System.out.print("Masukan Nama Anda : ");
        namaPenumpang = in.nextLine();
        System.out.print("Masukan E-Mail anda : ");
        email = in.nextLine();
        System.out.print("Masukan Nomer Hp Anda : ");
        noHp = in.nextLine();

    }

    @Override
    public void pilih() {
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan pilih Layanan :");
        System.out.println("1. Ngojek");
        System.out.println("2. Ngofood");
        System.out.println("3. Ngosend");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                Layanan ngojek = new Ojek();
                ngojek.daftar();
                break;
            case 2:
                Layanan ngofood = new Food();
                ngofood.daftar();
                break;
            case 3:
                Layanan ngosend = new Send();
                ngosend.daftar();
                break;
        }
    }

    @Override
    public void pemesanan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan ID Transaksi : ");
        int idTransaksi = input.nextInt();
        this.idTransaksi = idTransaksi;
        System.out.print("Masukan jarak tempuh : ");
        int jarak = input.nextInt();
        this.jarak = jarak;
    }

    @Override
    public void bayar() {
        System.out.print("Total Biaya : ");
        int harga=Layanan.harga;
        System.out.println(hitungBiaya(harga,jarak));
        System.out.print("Masukan uang anda dalam rupiah : ");
        Scanner in = new Scanner(System.in);
        int uang = in.nextInt();
        System.out.println("Uang Kembali " + (uang - hitungBiaya(harga,jarak)));
    }

    public int hitungBiaya(int harga,int lama){
        totalBiaya=lama*harga;
        return (int) totalBiaya;
    }

    @Override
    public void cetak() {
        System.out.println("\n================================================================");
        System.out.println("                              NgOJEK                            ");
        System.out.println("==================================================================");
        System.out.println(" ");
        System.out.println("Id_Transaksi    : " + this.idTransaksi);
        System.out.println("Nama Driver     : " + Layanan.pengemudi);
        System.out.println("No Handphone    : " + this.noHp);
        System.out.println("------------------------------------------------------------------");
        System.out.println("LAYANAN   JENIS   HARGA     JARAK       TOTAL BIAYA ");
        System.out.println("------------------------------------------------------------------");
        System.out.println(Layanan.layanan + "\t" + Layanan.jenis + "\t" + Layanan.harga + "\t\t" + this.jarak + " Km\t\t" + this.totalBiaya);
        File file = new File("struk.txt");

        try {
            PrintWriter output = new PrintWriter(file);
            output.print("\n================================================================");
            output.print("\n                              NgOJEK                            ");
            output.print("\n==================================================================");
            output.print("\n ");
            output.print("\nId_Transaksi    : " + this.idTransaksi);
            output.print("\nNama Driver     : " + Layanan.pengemudi);
            output.print("\nNo Handphone    : " + this.noHp);
            output.print("\n------------------------------------------------------------------");
            output.print("\nLAYANAN   JENIS   HARGA     JARAK       TOTAL BIAYA ");
            output.print("\n------------------------------------------------------------------");
            output.print("\n"+ Layanan.layanan + "\t" + Layanan.jenis + "\t" + Layanan.harga + "\t\t" + this.jarak + " Km\t\t" + this.totalBiaya);
            output.close();
        } catch (FileNotFoundException var3) {
            var3.printStackTrace();
        }

    }
}
