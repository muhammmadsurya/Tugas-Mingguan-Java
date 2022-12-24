import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ngojek apk = new Pemesanan();
        Penumpang user = new Penumpang(apk);

        Scanner input = new Scanner(System.in);
        String aksi;

        while(true){
            System.out.println("\n==========================");
            System.out.println("       LAYANAN NGOJEK     ");
            System.out.println("Siap antar kamu kemana Aja ");
            System.out.println("==========================");
            System.out.println("[1] Mengisi Form ");
            System.out.println("[2] Memilih Layanan ");
            System.out.println("[3] Melakukan Pemesanan ");
            System.out.println("[4] Melakukan Pembayaran ");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                user.mengisiForm();
                input.nextLine();
            } else if (aksi.equalsIgnoreCase("2")){
                user.memilih();
                input.nextLine();
            } else if (aksi.equalsIgnoreCase("3")){
                user.pemesanan();
                input.nextLine();
            } else if (aksi.equalsIgnoreCase("4")){
                user.pembayaran();
                input.nextLine();
            } else if (aksi.equalsIgnoreCase("0")){
                System.out.println("Selamat Anda Telah menggunakan layanan Gojek");
                System.out.println("Terimakasih");
                user.cetakStruk();
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
                input.nextLine();
            }
        }
    }
}