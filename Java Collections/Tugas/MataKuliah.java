package Tugas;

class MataKuliah {
    String kode;
    String matkul;
    String sks;

    public MataKuliah(String kode, String matkul, String sks) {
        this.kode = kode;
        this.matkul = matkul;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getMataKul() {
        return matkul;
    }

    public String getSks() {
        return sks;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-40s %-2s", kode, matkul, sks);
    }
}