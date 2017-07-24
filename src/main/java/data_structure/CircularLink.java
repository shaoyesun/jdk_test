package data_structure;

/**
 * 判断链表是否为循环链表
 */
public class CircularLink {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(6);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(10);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n1;
        System.out.println(hasLoop(n1));
    }

    //判断是否为循环呢链表
    public static boolean hasLoop(Node head){
        Node p1 = head;    //定义一个引用指向头结点
        Node p2 = head.next;    //定义另一个引用指向头结点的下一个结点

        if(p1 == p2) return true;

        while (p2.next != null) {
            p2 = p2.next;
            if(p1 == p2) return true;
        }
        return false;
    }
}
