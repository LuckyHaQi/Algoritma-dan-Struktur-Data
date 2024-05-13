public class Film{
    NodeFilm head, tail;

    Film(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    void add(int kode, String judul, double rating, int index){
        if(index < 0){
            System.out.println("Index tidak valid");
            return;
        }
        if(index == 0){
            addFirst(kode, judul, rating);
        } else{
            NodeFilm newNode = new NodeFilm(kode, judul, rating);
            NodeFilm current = head;
            int i = 0;
            while(current != null && i < index - 1){
                current = current.next;
                i++;
            }
            if(current == null){
                System.out.println("Index melebihi jumlah node");
                return;
            }
            newNode.next = current.next;
            newNode.prev = current;
            if(current.next != null){
                current.next.prev = newNode;
            } else{
                tail = newNode;
            }
            current.next = newNode;
        }
    }

    void addFirst(int kode, String judul, double rating){
        NodeFilm newNode = new NodeFilm(kode, judul, rating);
        if(head == null){
            head = tail = newNode;
        } else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(int kode, String judul, double rating){
        NodeFilm newNode = new NodeFilm(kode, judul, rating);
        if(head == null){
            head = tail = newNode;
        } else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void remove(int index){
        if(head == null || index < 0){
            System.out.println("Index tidak valid");
            return;
        }
        if(index == 0){
            removeFirst();
            return;
        }
        NodeFilm current = head;
        int i = 0;
        while(current != null && i < index){
            current = current.next;
            i++;
        }
        if(current == null){
            System.out.println("Index melebihi jumlah node");
            return;
        }
        if(current == tail){
            removeLast();
        } else{
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    void removeFirst(){
        if(head == null){
            System.out.println("List kosong");
            return;
        }
        if(head == tail){
            head = tail = null;
        } else{
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast(){
        if(head == null){
            System.out.println("List kosong");
            return;
        }
        if(head == tail){
            head = tail = null;
        } else{
            tail = tail.prev;
            tail.next = null;
        }
    }

    void print(){
        if(head == null){
            System.out.println("List kosong");
            return;
        }
        System.out.println("-===================================-");
        System.out.println("        DATA FILM LAYAR LEBAR        ");
        System.out.println("-===================================-");
        NodeFilm current = head;
        while(current != null){
            System.out.println("ID Film\t\t: " + current.kode);
            System.out.println("Judul Film\t: " + current.judul);
            System.out.println("Rating Film\t: " + current.rating);
            System.out.println("-------------------------------------");
            current = current.next;
        }
    }

    void findId(int kode){
        NodeFilm current = head;
        int index = 0;
        while(current != null){
            if(current.kode == kode){
                System.out.println("Data kode " + kode + " ditemukan pada node ke-" + (index + 1));
                System.out.println("ID Film\t\t: " + current.kode);
                System.out.println("Judul Film\t: " + current.judul);
                System.out.println("Rating Film\t: " + current.rating);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Data kode " + kode + " tidak ditemukan");
    }

    void Descending(){
        if(isEmpty()){
            System.out.println("Data film kosong.");
            return;
        }
        NodeFilm current = head;
        NodeFilm index = null;
        while(current != null){
            index = current.next;
            while(index != null){
                if(current.rating < index.rating){
                    swapData(current, index);
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    void swapData(NodeFilm node1, NodeFilm node2){
        int tempId = node1.kode;
        String tempjudul = node1.judul;
        double tempRating = node1.rating;
        node1.kode = node2.kode;
        node1.judul = node2.judul;
        node1.rating = node2.rating;
        node2.kode = tempId;
        node2.judul = tempjudul;
        node2.rating = tempRating;
    }
}
