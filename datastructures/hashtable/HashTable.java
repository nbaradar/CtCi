package datastructures.hashtable;

import java.util.ArrayList;
public class HashTable {
    //array of linked lists
    //hash function

    //to insert a key
    //1. compute the hashcode
    //2. map the hashcode to an index in the array (ex. hash(key)%array_length)
    //3. At this index store the key and value. Linkedlist is used to avoid collision

    ArrayList<HashLinkedList> array = new ArrayList<HashLinkedList>();



    public int hash(String value){
        return 0;
    }
    
    public static void main(String args[]){
        HashLinkedList testList = new HashLinkedList();

        testList.append(new String("test"));
        testList.append(new String("test2"));
        testList.append(new String("test3"));

        testList.prepend(new String("prepend"));

        System.out.println(testList.toString());
    }
}
