public class DataBarang {
    // Kelas Barang untuk menyimpan data barang
    public static class Barang {
        private String kodeBarang;
        private String namaBarang;
        private double hargaBarang;

        public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
            this.kodeBarang = kodeBarang;
            this.namaBarang = namaBarang;
            this.hargaBarang = hargaBarang;
        }

        public String getKodeBarang() {
            return kodeBarang;
        }

        public String getNamaBarang() {
            return namaBarang;
        }

        public double getHargaBarang() {
            return hargaBarang;
        }
    }

    // Array dari Barang objects
    private Barang[] dataBarang = {
        new Barang("B001", "Pensil 2B", 1500),
        new Barang("B002", "Pensil 4B", 2000),
        new Barang("B003", "Pensil mekanik", 4000),
        new Barang("B004", "Penghapus", 1000),
        new Barang("B005", "Penghapus Silinder", 2500),
        new Barang("B006", "Spidol permanen", 5000),
        new Barang("B007", "Spidol whiteboard", 7000),
        new Barang("B008", "Pulpen tinta hitam", 3000),
        new Barang("B009", "Pulpen tinta biru", 3000),
        new Barang("B010", "Pulpen gel", 5000),
        new Barang("B011", "Rautan", 1500),
        new Barang("B012", "Penggaris plastik 30cm", 2000),
        new Barang("B013", "Penggaris logam 30cm", 5000),
        new Barang("B014", "Buku catatan kecil", 2000),
        new Barang("B015", "Buku tulis 50 halaman", 4000),
        new Barang("B016", "Buku tulis 100 halaman", 6000),
        new Barang("B017", "Buku gambar", 8000),
        new Barang("B018", "Buku agenda", 15000),
        new Barang("B019", "Klip kertas", 1000),
        new Barang("B020", "Klip jumbo", 2000),
        new Barang("B021", "Staples kecil", 4000),
        new Barang("B022", "Staples besar", 8000),
        new Barang("B023", "Mesin stapler mini", 12000),
        new Barang("B024", "Mesin stapler besar", 25000),
        new Barang("B025", "Lem cair", 4000),
        new Barang("B026", "Lem stik", 3000),
        new Barang("B027", "Kertas HVS A4 70g", 6000),
        new Barang("B028", "Kertas HVS A4 80g", 8000),
        new Barang("B029", "Kertas Foto A4", 15000),
        new Barang("B030", "Kertas Fax", 5000),
        new Barang("B031", "Kertas Label A4", 12000),
        new Barang("B032", "Folders plastik", 3000),
        new Barang("B033", "Map pahlawan", 4000),
        new Barang("B034", "Map kertas", 2500),
        new Barang("B035", "Papan tulis kecil", 20000),
        new Barang("B036", "Papan tulis besar", 40000),
        new Barang("B037", "Papan whiteboard", 60000),
        new Barang("B038", "Deterjen papan tulis", 2000),
        new Barang("B039", "Kertas origami", 5000),
        new Barang("B040", "Binder clip", 1500),
        new Barang("B041", "Kertas Carbon", 4000),
        new Barang("B042", "Kertas Kalkir", 6000),
        new Barang("B043", "Komputer meja", 3000000),
        new Barang("B044", "Komputer laptop", 8000000),
        new Barang("B045", "Mouse kabel", 50000),
        new Barang("B046", "Mouse wireless", 120000),
        new Barang("B047", "Keyboard", 100000),
        new Barang("B048", "Pen drive 8GB", 80000),
        new Barang("B049", "Pen drive 16GB", 120000),
        new Barang("B050", "Pen drive 32GB", 200000),
        new Barang("B051", "Flashcard", 10000),
        new Barang("B052", "CD kosong", 2000),
        new Barang("B053", "DVD kosong", 3000),
        new Barang("B054", "Lakban bening", 5000),
        new Barang("B055", "Lakban coklat", 4000),
        new Barang("B056", "Isolasi listrik", 3000),
        new Barang("B057", "Gunting kecil", 6000),
        new Barang("B058", "Gunting besar", 12000),
        new Barang("B059", "Cutter", 7000),
        new Barang("B060", "Cutter pisau", 8000),
        new Barang("B061", "Sticky note", 5000),
        new Barang("B062", "Sticky note besar", 7000),
        new Barang("B063", "Kertas stiker A4", 15000),
        new Barang("B064", "Buku nota", 10000),
        new Barang("B065", "Buku kas", 15000),
        new Barang("B066", "Buku rekening", 20000),
        new Barang("B067", "Tinta printer", 50000),
        new Barang("B068", "Cartridge printer", 150000),
        new Barang("B069", "Tinta spidol", 5000),
        new Barang("B070", "Spidol neon", 7000),
        new Barang("B071", "Tinta printer laser", 180000),
        new Barang("B072", "Tinta printer inkjet", 120000),
        new Barang("B073", "Kertas printer A4", 4000),
        new Barang("B074", "Kertas printer F4", 5000),
        new Barang("B075", "Paper clip", 1000),
        new Barang("B076", "Label printer", 25000),
        new Barang("B077", "Pensil warna", 8000),
        new Barang("B078", "Crayon", 5000),
        new Barang("B079", "Spidol warna", 6000),
        new Barang("B080", "Kertas karton", 10000),
        new Barang("B081", "Kertas kado", 5000),
        new Barang("B082", "Pita kado", 3000),
        new Barang("B083", "Engraver pen", 15000),
        new Barang("B084", "Stempel", 25000),
        new Barang("B085", "Stempel tinta", 10000),
        new Barang("B086", "Kapur tulis", 3000),
        new Barang("B087", "Kapur kayu", 2500),
        new Barang("B088", "Stempel batik", 40000),
        new Barang("B089", "Obeng kecil", 10000),
        new Barang("B090", "Obeng besar", 15000),
        new Barang("B091", "Botol tinta", 3000),
        new Barang("B092", "Kertas blok note", 5000),
        new Barang("B093", "Flipchart", 15000),
        new Barang("B094", "Dadu angka", 2000),
        new Barang("B095", "Perpustakaan", 40000),
        new Barang("B096", "Flash drive", 60000),
        new Barang("B097", "Spidol warna neon", 8000),
        new Barang("B098", "Roll kertas HVS", 20000),
        new Barang("B099", "Mesin hitung", 35000),
        new Barang("B100", "Kalkulator", 25000)
    };

    // Getter untuk mendapatkan array barang
    public Barang[] getDataBarang() {
        return dataBarang;
    }
}
