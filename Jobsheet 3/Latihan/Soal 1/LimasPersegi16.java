public class LimasPersegi16{

    double sisiAlas;
    double tinggiLimas;
    double luasPermukaan;
    double volume;
    double luasAlas;

    public LimasPersegi16(double sisiAlas, double tinggiLimas) {
        this.sisiAlas = sisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungLuasPermukaan() {
        luasAlas = sisiAlas * sisiAlas;
        double luasSisiTegak = (sisiAlas * tinggiLimas) / 2;
        luasPermukaan = luasAlas + 4 * luasSisiTegak;
        return luasPermukaan;
    }
    public double hitungVolume() {
        return (1.0 / 3) * luasAlas * tinggiLimas;
    }
}