public class Vaksin {
    NodeVaksin head, tail;
    int size;

    public Vaksin(){
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void tambah(int data, String nama){
        NodeVaksin newNode = new NodeVaksin(nama, data);
        if (tail == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;    
    }
    public void hapus(){
        if (head == null){
            System.out.println("Antrian kosong, tidak ada data untuk dihapus.");
            return;
        }
        System.out.println("+---------------------------+");
        System.out.println(head.nama + " telah selesai divaksinasi.");
        System.out.println("+---------------------------+");
        System.out.println();
        head = head.next;
        if (head == null){
            tail = null;
        }else{
            head.prev = null;
        }
        size--;
    }
    public void tampildaftar(){
        if (head == null || tail == null){
            System.out.println("Antrian kosong");
            return;
        }
        NodeVaksin current = head;
        System.out.println("| Nomor\t| Nama\t|");
        while (current != null){
            System.out.println("| " + current.data + "\t|" + " " + current.nama + "\t|");
            current = current.next;
        }
        System.out.println("Sisa antrian: " + size);
    }
    public int getSize(){
        return size;
        }
}
