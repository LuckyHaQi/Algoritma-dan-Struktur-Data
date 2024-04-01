class PencarianBuku16 {
    Buku16 listBk[] = new Buku16[5];
    int idx;

    void tambah(Buku16 m){
        if (idx < listBk.length){
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for (Buku16 m : listBk){
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(String cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++){
            if (listBk[j].kodeBuku.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(String cari, int pos){
        if (pos!= -1 && pos < listBk.length){
            System.out.println("Data: " + cari + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + cari + " tidak ditemukan");
        }
    }

    public void tampilData(String cari, int pos){
        if (pos!= -1) {
            System.out.println("Kode Buku\t : " + cari);
            System.out.println("Judul\t\t : "+ listBk[pos].judulBuku) ;
            System.out.println("Tahun Terbit\t : "+ listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : "+ listBk [pos].pengarang) ;
            System.out.println("Stock\t\t : "+ listBk[pos].stock);
        } else {
            System.out.println("Data " + cari + " tidak ditemukan");
        }
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int compareResult = cari.compareTo(listBk[mid].kodeBuku);
            if (compareResult == 0) {
                return mid;
            } else if (compareResult < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    void sorting() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j + 1].judulBuku) > 0) {
                    Buku16 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }    
}