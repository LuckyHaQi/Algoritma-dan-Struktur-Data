package Tugas;

public class Nilai {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilai;

    public Nilai(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    public String getNim() {
        return mahasiswa.getNim();
    }

    public String getNama() {
        return mahasiswa.getNama();
    }

    public String getMataKuliah() {
        return mataKuliah.getMataKul();
    }

    public String getSks() {
        return mataKuliah.getSks();
    }

    public double getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-10s %-10s %-2s %-4.2f", getNim(), getNama(), getMataKuliah(), getSks(), getNilai());
    }
}