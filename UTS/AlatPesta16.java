class AlatPesta16 {
    String namaAlat16;
    String jenisAlat16;
    int hargaSewa16;
    
    public AlatPesta16(String jenisAlat16, String namaAlat16, int hargaSewa16){
        this.namaAlat16 = namaAlat16;
        this.jenisAlat16 = jenisAlat16;
        this.hargaSewa16 = hargaSewa16;
    }

    public void DataAlat16() {
        System.out.println("Jenis Alat Pesta : " + jenisAlat16);
        System.out.println("Nama Alat Pesta\t : " + namaAlat16);
        System.out.println("Harga Penyewaan\t : " + hargaSewa16);
        System.out.println("");
    }
}