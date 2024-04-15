public class Gudang16 {
    Barang16[] tumpukan;
    int size;
    int top;

    public Gudang16(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang16[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang16 barang) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = barang;
            System.out.println("Barang " + barang.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang16 ambilBarang() {
        if (!cekKosong()) {
            Barang16 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+ delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang16 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang16 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang16 cariBarang(String search) {
        if (!cekKosong()) {
            for (int i = top; i >= 0; i--) {
                Barang16 barang = tumpukan[i];
                if (barang.nama.equalsIgnoreCase(search) || String.valueOf(barang.kode).equals(search)) {
                    System.out.printf("Barang ditemukan: %s (Kode: %d, Kategori: %s)\n", barang.nama, barang.kode, barang.kategori);
                    return barang;
                }
            }
            System.out.println("Barang tidak ditemukan.");
            return null;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang16 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang16 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    
    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang");
            for (int i = top; i >= 0; i--) {
                System.out.printf("kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi16 stack = new StackKonversi16();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
