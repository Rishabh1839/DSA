import java.util.LinkedList;
    // LinkedList = stores in 2 parts (data + address)
    // Nodes are in non consecutive memory locations Elements are linked using pointers
public class linkedlist {
    public static void main(String[] args){

        LinkedList<String> linkedList = new LinkedList<String>();

            linkedList.offer("A");
            linkedList.offer("B");
            linkedList.offer("C");
            linkedList.offer("D");
            linkedList.offer("F");
    
            linkedList.add(4, "E");
            linkedList.remove("Z");
    
            System.out.println(linkedList.peekFirst());
            System.out.println(linkedList.peekLast());
            linkedList.addFirst("0");
            linkedList.addLast("0");
    
            System.out.println(linkedList);
        }
    }
