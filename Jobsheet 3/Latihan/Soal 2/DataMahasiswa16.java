public class DataMahasiswa16 {
    public String nama;
    public long nim;
    public char kelamin;
    public float ipk;
    void tampilInformasi() {
        System.out.println("\nNama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        System.out.println("Kelamin\t: " + kelamin);
        System.out.println("IPK\t: " + ipk);
    }

    public static float hitungRataRataIPK(DataMahasiswa16[] mhs) {
        float totalIPK = 0;
        for (int i = 0; i < mhs.length; i++) {
            totalIPK += mhs[i].ipk;
        }
        return totalIPK / mhs.length;
    }
    public static DataMahasiswa16 mhsIpkTertinggi(DataMahasiswa16[] mhs) {
        DataMahasiswa16 ipkTertinggi = mhs[0];
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].ipk > ipkTertinggi.ipk) {
                ipkTertinggi = mhs[i];
            }
        }
        return ipkTertinggi;
    }
}