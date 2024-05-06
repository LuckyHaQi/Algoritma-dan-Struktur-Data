public class SLLMhs {
    Mhs head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if(isEmpty()){
            System.out.println("Linked List kosong");
        } else {
            Mhs tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                System.out.print("nim: " + tmp.nim + ", nama: " + tmp.nama + " | ");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    void addFirst(int input, String nama){
        Mhs ndInput = new Mhs(input, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input, String nama){
        Mhs ndInput = new Mhs(input, nama, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input, String nama){
        Mhs ndInput = new Mhs(input, nama, null);
        Mhs temp = head;
        while(temp != null){
            if(temp.nim == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input, String nama){
        Mhs ndInput = new Mhs(input, nama, null);
        if (index < 0){
            System.out.println("Perbaiki Logikanya!" + "kalau indeksnya -1 bagaimana?");
        } else if (index == 0){
            addFirst(input, nama);
        } else {
            Mhs temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
                if (temp == null) {
                    System.out.println("Indeks melebihi batas.");
                    return;
                }
            }
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (temp.next == null) {
                tail = ndInput;
            }
        }
    }
}