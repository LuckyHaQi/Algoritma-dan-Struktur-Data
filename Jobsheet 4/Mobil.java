public class Mobil {

    String tipe;
    String merk;
    int tahun;
    int topAccel;
    int topPower;

    public Mobil(String merk, String tipe, int tahun, int topAccel, int topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAccel = topAccel;
        this.topPower = topPower;
    }

    static double maksAccel(Mobil[] data, int rendah, int tinggi) {
        if (rendah == tinggi) {
            return data[rendah].topAccel;
        } else {
            int mid = (rendah + tinggi) / 2;
            double maksLeft = maksAccel(data, rendah, mid);
            double maksRight = maksAccel(data, mid + 1, tinggi);
            return Math.max(maksLeft, maksRight);
        }
    }

     static double cariAkselerasiMin(Mobil[] data, int rendah, int tinggi) {
        if (rendah == tinggi) {
            return data[rendah].topAccel;
        } else {
            int mid = (rendah + tinggi) / 2;
            double leftMin = cariAkselerasiMin(data, rendah, mid);
            double rightMin = cariAkselerasiMin(data, mid + 1, tinggi);
            return Math.min(leftMin, rightMin);
        }
    }

     static double hitungRataRataTopPower(Mobil[] data) {
        double totalPower = 0;
        for (Mobil mobil : data) {
            totalPower += mobil.topPower;
        }
        return totalPower / data.length;
    }
}