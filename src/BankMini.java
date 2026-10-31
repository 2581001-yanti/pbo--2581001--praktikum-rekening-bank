import java.util.Scanner;

public class BankMini {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Inisialisasi objek rekening dengan data awal (001, Ani, 100000)
        Rekening rek = new Rekening("001", "Ani", 100000);

        System.out.println("============ BANK MINI ============");
        System.out.println("Rekening 001 a.n. Ani");

        boolean jalan = true;

        // Loop menu utama
        while (jalan) {
            System.out.print("Menu (1 setor, 2 tarik, 3 info, 0 keluar): ");
            int menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Jumlah: ");
                    int nominalSetor = in.nextInt();
                    if (rek.setor(nominalSetor)) {
                        System.out.println("Berhasil");
                    } else {
                        System.out.println("Ditolak");
                    }
                    break;

                case 2:
                    System.out.print("Jumlah: ");
                    int nominalTarik = in.nextInt();
                    if (rek.tarik(nominalTarik)) {
                        System.out.println("Berhasil");
                    } else {
                        System.out.println("Ditolak");
                    }
                    break;

                case 3:
                    rek.cetakInfo();
                    break;

                case 0:
                    jalan = false;
                    break;

                default:
                    System.out.println("Menu tidak dikenal");
                    break;
            }
        }

        // Cetak saldo akhir setelah keluar dari menu
        System.out.println("=========== SALDO AKHIR ===========");
        rek.cetakInfo();

        // Pengujian akses field private secara langsung (Sesuai instruksi soal nomor 7)
        // rek.saldo = 1000000;
        // Output Error: saldo has private access in Rekening

        in.close();
    }
}