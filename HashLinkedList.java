public class HashLinkedList{
    HashNode head;
    
    public void append(Object value){
        if (head == null){
            head = new HashNode(value);
        } else{
            HashNode current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = new HashNode(value);
        }
       
    }

    public void prepend(Object value){
        HashNode newNode = new HashNode(value);
        newNode.next = head;
        head = newNode;        
    }

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

class HashNode{
    HashNode next;
    Object value;

    public HashNode(Object value){
        this.value = value;
    }

 
}

