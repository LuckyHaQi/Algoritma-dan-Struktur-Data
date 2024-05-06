class Queue {
    QueueNode front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(Mhs data) {
        QueueNode newNode = new QueueNode(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public Mhs dequeue() {
        if (front == null)
            return null;

        QueueNode temp = front;
        front = front.next;

        if (front == null)
            rear = null;

        return temp.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void print() {
        QueueNode tmp = front;
        while (tmp != null) {
            System.out.print("nim: " + tmp.data.nim + ", nama: " + tmp.data.nama + " | ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}