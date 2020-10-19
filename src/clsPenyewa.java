public class clsPenyewa {
    int id, noktp,noplat,lama,biaya;
    Long notlp;
    String nama;
    String alamat;
    String jenis;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoktp() {
        return noktp;
    }

    public void setNoktp(int noktp) {
        this.noktp = noktp;
    }

    public Long getNotlp() {
        return notlp;
    }

    public void setNotlp(Long notlp) {
        this.notlp = notlp;
    }

    public int getNoplat() {
        return noplat;
    }

    public void setNoplat(int noplat) {
        this.noplat = noplat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public double total_sewa()
    {
        return lama*biaya;
    }

    public double potongan_harga() {
        if (lama >= 7) {
            return 0.05 * total_sewa();
        } else if (lama >= 5) {
            return 0.03 * total_sewa();
        } else if (lama >= 3) {
            return 0.02 * total_sewa();
        } else {
            return 0;
        }
    }

    public double PPN()
    {
        return 0.02*total_sewa();
    }

    public double harus_bayar()
    {
        return total_sewa()-potongan_harga()+PPN();
    }
}
