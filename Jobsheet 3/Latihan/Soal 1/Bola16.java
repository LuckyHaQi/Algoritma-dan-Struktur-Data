public class Bola16{
    double jariJari;
    double luasPermukaan;
    double volume;

    public Bola16(double r) {
        jariJari = r;
    }

    public double hitungLuasPermukaanBola() {
        return 4 * Math.PI * jariJari * jariJari;
    }
    public double hitungVolumeBola() {
        return (4.0 / 3) * Math.PI * jariJari * jariJari * jariJari;
    }
}