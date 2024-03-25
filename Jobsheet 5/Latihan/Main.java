public class Main {

    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Passalacqua", "Moltrasio", 30000000, (byte) 2);
        Hotel h2 = new Hotel("Rosewood", "Hong Kong", 224340000, (byte) 1);
        Hotel h3 = new Hotel("The Upper House", "Hong Kong", 100000000, (byte) 4);
        Hotel h4 = new Hotel("La Mamounia", "Marrakech", 158000000, (byte) 3);
        Hotel h5 = new Hotel("The Continental", "New York", 2, (byte) 5);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("\nData hotel sebelum sorting =");
        list.tampilAll();

        System.out.println("\nData hotel setelah sorting berdasarakan harga =");
        list.selectionSort();
        list.tampilAll();
        
        System.out.println("\nData hotel setelah sorting berdasarakan bintang =");
        list.bubbleSort();
        list.tampilAll();
    }
}