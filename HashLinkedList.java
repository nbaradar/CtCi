/**
 * This is an implementation of a LinkedList. It will be used to create a HashTable (Array of linked lists)
 * 
 * @author Nader
 */

public class HashLinkedList{
    HashNode head;
    
    /**
     * Add a node to the end of the linked list by setting head.next. If not already at the end of the list, traverse
     * to the end, then set head.next
     * @param value The value you want to store in the next node of the linked list
     */
    public void append(Object value){
        //If you are already at the end, just set the value and skip the looping. Goes from O(n) to O(1)
        if (head == null){
            head = new HashNode(value);
        } else{
            HashNode current = head;
            //Traverse to the end of the linked list
            while (current.next != null){
                current = current.next;
            }
            //then set the head
            current.next = new HashNode(value);
        }
       
    }

    /**
     * Add a node to the beginning of the linked list. This is always O(1). You do this by creating a new node, 
     * setting its next reference to the current head, then setting the current head refrence to the new node. 
     * @param value The value you want to store in the first node of the linked list.
     */
    public void prepend(Object value){
        //1. create a new node
        HashNode newNode = new HashNode(value);
        //2. set the reference of the new nodes "next" node to the current head node
        newNode.next = head;
        //3. set the reference of the current head node to the new node.
        head = newNode;        
    }

    /**
     * Search through the linked list to remove the supplied value. This is done by "breaking" the incoming
     * link of the node you want to delete by settting the preceding nodes "next" value to the node AFTER the deleted node.
     * @param value The value you want to delete from the linked list.
     */
    public void deleteWithValue(Object value){
        if(head == null) return;

        if(head.value == value){
            head = head.next;
        }

        HashNode current = head;

        while(current.next != null){
            if (current.next.value == value){
                current.next = current.next.next;
            } else{
                current = current.next;
            }
        }
    }
}

/**
 * A simple node object. It contains a reference to its next node, and a value to store
 */
class HashNode{
    HashNode next;
    Object value;

    public HashNode(Object value){
        this.value = value;
    }

 
}

