public class Penumpang {
    private Ngojek ojek;

    public Penumpang(Ngojek ojek){
        this.ojek = ojek;
    }

    void mengisiForm(){
        this.ojek.Form();
    }

    void memilih(){
        this.ojek.pilih();
    }

    void pemesanan(){
        this.ojek.pemesanan();
    }

    void pembayaran(){
        this.ojek.bayar();
    }
}
