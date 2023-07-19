
package Linkedlist;

import java.util.HashMap;

class Node {
    int data;
    Node next, arb;

    Node(int d)
    {
        data = d;
        next = arb = null;

    }
}
class Clone {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
        Node curr=head;
        Node temp;

        //adding node in between
        while(curr!=null)
        {
            temp=curr.next;
            Node nn=new Node(curr.data);
            curr.next=nn;
            nn.next=temp;
            curr=temp;
        }
        curr=head;

        //pointing random pointer
        while(curr!=null){
            if(curr.arb!=null){
                curr.next.arb=curr.arb.next;
            }else{
                curr.next.arb=curr.arb;
            }
            curr=curr.next.next;
        }

        Node original=head;
        Node copy=head.next;

        temp=copy;

        //breaking the leaking
        while(original!=null && copy!=null){
            original.next=original.next.next;

            //for last Node
            if(copy.next!=null){
                copy.next=copy.next.next;
            }else{
                copy.next=copy.next;
            }
            copy=copy.next;
            original=original.next;
        }

        return temp;
    }

    //Burte force storing the value in map <current,currentNew>
    Node  CopyListBruteForce(Node head){
        HashMap<Node,Node> hm=new HashMap<>();
        Node temp=head;
        while (temp!=null){
            Node newnode=new Node(temp.data);
            hm.put(temp,newnode);
            temp=temp.next;
        }
        Node t=head;

        while (t!=null){
            Node node=hm.get(t);
            node.next=t.next!=null?hm.get(t.next):null;
            node.arb=t.arb!=null?hm.get(t.arb):null;
            t=t.next;
        }

        return hm.get(head);
    }



    public static void main(String[] args) {

    }
}