import java.util.LinkedList;
// LinkedList = stores in 2 parts (data + address)
// Nodes are in non consecutive memory locations Elements are linked using pointers
//                     Singly Linked List
//        Node                Node                 Node
//     (data|address) ->  (data|address)  ->   (data|address)

//                           Doubly Linked List
//           Node                    Node                    Node
//  (address|data|address) <-> (address|data|address) <-> (address|data|address)



public class linked_list {
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
