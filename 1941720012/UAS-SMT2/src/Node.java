/**
 *
 * @author FARLAN
 */
public class Node {
    Node prev;
    CD_Farlan data = new CD_Farlan();
    Node next;

    public Node(Node prev, CD_Farlan data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    
    
}
