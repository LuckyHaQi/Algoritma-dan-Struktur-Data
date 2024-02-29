package ArraySegitiga;
public class ArraySegitiga{
    public static void main(String[] args) {
        Segitiga16[] sgArray = new Segitiga16[4];
        
        sgArray[0] = new Segitiga16(10, 4);
        sgArray[1] = new Segitiga16(20, 10);
        sgArray[2] = new Segitiga16(15, 6);
        sgArray[3] = new Segitiga16(25, 10);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Luas Segitiga ke-" + (i + 1) + ": " + sgArray[i].hitungLuas());
            System.out.println("Keliling Segitiga ke-" + (i + 1) + ": " + sgArray[i].hitungKeliling());
        }
    }
}