/**
 *
 * @author FARLAN
 */
public class Node<T> {
    LinkedLists data = new LinkedLists();
    Node next;
    
    public Node(LinkedLists data, Node next){
        this.data = data;
        this.next = next;
    }
}
