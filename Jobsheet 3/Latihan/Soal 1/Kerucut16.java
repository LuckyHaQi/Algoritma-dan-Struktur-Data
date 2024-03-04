public class Kerucut16{
    double jariJari;
    double sisiMiring;
    double luasPermukaan;
    double volume;

    public Kerucut16(double r, double sm) {
        jariJari = r;
        sisiMiring = sm;
    }
    public double hitungLuasPermukaanKerucut() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }
    public double hitungVolumeKerucut() {
        return (1.0 / 3) * Math.PI * jariJari * jariJari * sisiMiring;
    }
}