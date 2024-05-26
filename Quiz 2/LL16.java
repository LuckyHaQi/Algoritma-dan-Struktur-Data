public class LL16{
    BengkelNode16 head, tail;
    int size;
    int totalPemasukan = 0;

    boolean isEmpty(){
        return head == null;
    }

    void tambah16(pelangan16 pelanggan, Layanan16 layanan){
        BengkelNode16 newNode = new BengkelNode16(pelanggan, layanan);
        if (isEmpty()){
            head = tail = newNode;
        }else{
        tail.next = newNode;
        tail = newNode;
        totalPemasukan += layanan.harga16;
        }
        size++;
    }

    void antrian16(){
        if (isEmpty()){
            System.out.println("Antrian kosong");
        }else{
            BengkelNode16 tmp = head;
            while (tmp != null){
                System.out.println("Nama \t: " + tmp.pelanggan16.namaPelanggan16);
                System.out.println("No. HP\t: " + tmp.pelanggan16.noHP16);
                System.out.println("Layanan\t: " + tmp.layanan16.nama16);
                tmp = tmp.next;
            }
        }
    }

    void hapus16(){
        if (isEmpty()){
            System.out.println("Antrian kosong");
            return;
        }else if (head.next == null){
            head = head.next;
            size--;
            return;
        }
        BengkelNode16 current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }

    void laporanLayanan16(){
        System.out.println("Layanan yang telah digunakan:");
        BengkelNode16 temp = head;
        while (temp != null){
            System.out.println("Nama\t: " + temp.pelanggan16.namaPelanggan16 + "\nLayanan\t: " + temp.layanan16.nama16);
            temp = temp.next;
        }
        System.out.println("Total pemasukan: " + totalPemasukan);
    }
}