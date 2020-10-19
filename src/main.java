import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        clsPenyewa siPenyewa = new clsPenyewa();
        String back;
        do
        {
            System.out.println();
            System.out.print("masukan Id Penyewa : ");
            siPenyewa.id = input.nextInt();

            System.out.print("masukan Nama Anda : ");
            siPenyewa.nama = input.next();

            System.out.print("masukan  Alamat : ");
            siPenyewa.alamat = input.next();

            System.out.print("masukan Nomor KTP : ");
            siPenyewa.noktp = input.nextInt();

            System.out.print("masukan Nomor Telepon : ");
            siPenyewa.notlp = input.nextLong();

            System.out.print("masukan Jenis Kendaraan : ");
            siPenyewa.jenis = input.next();

            System.out.print("masukan Nomor Plat : ");
            siPenyewa.noplat = input.nextInt();

            System.out.print("masukan Lama Sewa : ");
            siPenyewa.lama = input.nextInt();

            System.out.print("Input Biaya Sewa : ");
            siPenyewa.biaya = input.nextInt();
            System.out.println("______________________________________");
            System.out.println("Total Sewa : " + siPenyewa.total_sewa());
            System.out.println("Potongan Harga : " + siPenyewa.potongan_harga());
            System.out.println("PPN : " + siPenyewa.PPN());
            System.out.println("Harus Bayar : " + siPenyewa.harus_bayar());

            System.out.print("Input kembali(Y/T):");
            back = input.next();
        }while("Y".equals(back));
    }
}

