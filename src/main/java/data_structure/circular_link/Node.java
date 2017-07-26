package data_structure.circular_link;

/**
 * Created by Administrator on 2017/7/24.
 */
public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
