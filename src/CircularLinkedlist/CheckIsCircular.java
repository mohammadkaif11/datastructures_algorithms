package CircularLinkedlist;

  class  Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }

}


public class CheckIsCircular {
      Node head;

    //if given list is circular then hundread present slow and fast pointer are meet head only.

    public static boolean IsCircular(Node head){
        Node slow=head;
        Node fast=head;

        //its working for finding lop not check list is circular because In circular last node pointer point to head;
        while (fast!=null && slow!=null){
            if(fast==slow){
                return  true;
            }
            fast=fast.next.next;
            slow=slow.next;
        }

        while (fast!=null && slow!=null){
            if(fast==slow && fast==head && slow==head){
                return  true;
            }
            fast=fast.next.next;
            slow=slow.next;
        }


     return  false;
    }

    public static int FindStarting(Node head){
        Node slow=head;
        Node fast=head;
        Node temp=null;

        //its working for finding lop not check list is circular because In circular last node pointer point to head;
        while (fast!=null && slow!=null){
            if(fast==slow){
                break;
            }
            fast=fast.next.next;
            slow=slow.next;
        }

        fast=head;
        int count=0;
        while (fast!=null && slow!=null){
            if(fast==slow){
                return  count;
            }
            fast=fast.next;
            slow=slow.next;
            count++;
        }


        return count;
    }


    public static void main(String[] args) {

    }
}
