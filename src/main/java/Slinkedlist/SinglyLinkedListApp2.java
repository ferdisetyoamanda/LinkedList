// Contoh Modul
package Slinkedlist;
public class SinglyLinkedListApp2 {
    public static void main(String[] ar)
    {
        SinglyLinkedList lk = new SinglyLinkedList();
        lk.insertAwal(10);
        lk.display();
        lk.insertAwal(20);
        lk.display();
        lk.insertAkhir(30);
        lk.display();
        lk.insertAwal(40);
        lk.display();
        lk.insertAtPos(50, 2);
        lk.display();
        lk.insertAkhir(60);
        lk.display();
        lk.deleteAtPos(2);
        lk.display();
    
    }
    
}
