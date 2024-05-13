public class NodeFilm {
    int kode;
    String judul;
    double rating;
    NodeFilm prev, next;

    NodeFilm(int kode, String judul, double rating) {
        this.kode = kode;
        this.judul = judul;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}