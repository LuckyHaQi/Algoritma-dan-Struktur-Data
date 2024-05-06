public class SLLMhsMain{
    public static void main(String[] args){
        SLLMhs singLL = new SLLMhs();
        singLL.print();
        singLL.addFirst(111, "anton");
        singLL.print();
        singLL.insertAfter(111 , 113, "Yusuf");
        singLL.print();
        singLL.addLast(114, "Doni");
        singLL.print();
        singLL.insertAt(1, 112, "prita");
        singLL.print();
        singLL.addLast(115, "Sari");
        singLL.print();
    }
}