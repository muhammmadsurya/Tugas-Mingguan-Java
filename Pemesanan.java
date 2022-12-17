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
//            case 1:
//                Kendaraan mobil = new Mobil();
//                mobil.daftar();
//                break;
//            case 2:
//                Kendaraan motor = new Motor();
//                motor.daftar();
//                break;
//        }
    }
    }

    @Override
    public void pemesanan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan ID Transaksi : ");
        int idTransaksi = input.nextInt();
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
}
