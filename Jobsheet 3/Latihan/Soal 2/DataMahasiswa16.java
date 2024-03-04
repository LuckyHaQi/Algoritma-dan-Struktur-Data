public class DataMahasiswa16 {
    public String nama;
    public int nim;
    public char kelamin;
    public float ipk;
    void tampilInformasi() {
        System.out.println("\nNama\t\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Kelamin\t\t: " + kelamin);
        System.out.println("IPK\t\t: " + ipk);
    }
    public static float hitungRerata(DataMahasiswa16[] mhs) {
        float totalIpk = 0;
        for (int i = 0; i < mhs.length; i++) {
            totalIpk += mhs[i].ipk;
        }
        return totalIpk / mhs.length;
    }
}