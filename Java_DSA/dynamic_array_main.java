import java.util.ArrayList;

public class dynamic_array_main {
    public static void main(String[] args) {
        
        dynamic_array_class dynamicArray = new dynamic_array_class(5);

        // Adding elements to the dynamic array
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        //dynamicArray.delete("A");
        //dynamicArray.delete("B");
        //dynamicArray.delete("C");


        dynamicArray.insert(0, "X");
        dynamicArray.delete("A");
        System.out.println(dynamicArray.search("C"));

        // Printing the dynamic array
        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty:" + dynamicArray.isEmpty());

    }
}
