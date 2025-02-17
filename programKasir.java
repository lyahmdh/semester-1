import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class programKasir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataBarang dataBarang = new DataBarang();
        DataUser dataUser = new DataUser();

        String currentUser = "";

        // Login
        boolean loginSukses = false;
        while (!loginSukses) {
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Sandi: ");
            String sandi = scanner.nextLine();

            if (dataUser.validasiUser(username, sandi)) {
                loginSukses = true;
                currentUser = username;
                System.out.println("Login berhasil!\n");
            } else {
                System.out.println("Username dan Sandi tidak sesuai.\n");
            }
        }

        // Input barang
        boolean lanjutInput = true;
        float totalHarga = 0;
        Map<String, Integer> jumlahBarang = new HashMap<>();
        DataBarang.Barang[] barangList = dataBarang.getDataBarang();

        while (lanjutInput) {
            System.out.print("Masukkan kode barang: ");
            String kodeInput = scanner.nextLine();
            boolean barangDitemukan = false;

            for (DataBarang.Barang barang : barangList) {
                if (barang.getKodeBarang().equalsIgnoreCase(kodeInput)) {
                    barangDitemukan = true;
                    System.out.print("Masukkan jumlah barang: ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer

                    jumlahBarang.put(barang.getKodeBarang(), jumlahBarang.getOrDefault(barang.getKodeBarang(), 0) + jumlah);
                    totalHarga += barang.getHargaBarang() * jumlah;
                    System.out.println("Barang ditambahkan: " + barang.getNamaBarang() + " - Rp" + barang.getHargaBarang() 
                                        + " x " + jumlah);
                    break;
                }
            }

            if (!barangDitemukan) {
                System.out.println("Kode barang tidak ditemukan.\n");
            }

            System.out.print("Apakah ingin menambah barang lagi? (y/n): ");
            String jawaban = scanner.nextLine();
            System.out.println();
            if (jawaban.equalsIgnoreCase("n")) {
                lanjutInput = false;
            }
        }

        // Proses perhitungan
        System.out.printf("%-20s Rp%.0f\n", "Total Sebelum Diskon", totalHarga);

        // Cek membership
        System.out.print("Apakah pembeli memiliki member? (y/n): ");
        String member = scanner.nextLine();
        double diskon = 0;

        if (member.equalsIgnoreCase("y")) {
            diskon = totalHarga * 0.02;
        }

        double totalSetelahDiskon = totalHarga - diskon;

        // Tanggal dan waktu
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String waktuStruk = now.format(formatter);

        // Cetak struk
        System.out.println("\n========================================================");
        System.out.println("                     TOKO MAJU JAYA                       ");
        System.out.println("========================================================");
        System.out.printf("Kasir: %s\n", currentUser);
        System.out.printf("Tanggal: %s\n", waktuStruk);
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-23s %-5s %-10s %-15s\n", "Nama Barang", "Qty", "Harga", "Subtotal");
        System.out.println("--------------------------------------------------------");

        for (Map.Entry<String, Integer> entry : jumlahBarang.entrySet()) {
            String kode = entry.getKey();
            int qty = entry.getValue();
            DataBarang.Barang barang = null;

            // Mencari barang berdasarkan kode
            for (DataBarang.Barang b : barangList) {
                if (b.getKodeBarang().equals(kode)) {
                    barang = b;
                    break;
                }
            }

            if (barang != null) {
                double subtotal = barang.getHargaBarang() * qty;
                System.out.printf("%-23s %-5d Rp%-8.0f Rp%-15.0f\n", barang.getNamaBarang(), 
                                   qty, barang.getHargaBarang(), subtotal);
            }
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("%-40s Rp%-10.0f\n", "Total Sebelum Diskon", totalHarga);
        System.out.printf("%-40s Rp%-10.0f\n", "Diskon", diskon);
        System.out.printf("%-40s Rp%-10.0f\n", "Total Setelah Diskon", totalSetelahDiskon);
        System.out.println("========================================================");
        System.out.println("             TERIMA KASIH TELAH BERBELANJA              ");
        System.out.println("========================================================");

        scanner.close();
    }
}