package DoublyLinkedlist;

import java.awt.*;

class  Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data=data;
        prev=null;
        next=null;
    }

}

public class DoublyLinkedlist {
    Node head;

    //Swap DoublyLinkedlist
    public  void Swap(DoublyLinkedlist dd,int x,int y)
    {
        Node headref=dd.head;
        Node curr=head;
        Node node1=null;
        Node node2=null;
        while (curr!=null){
            if(curr.data==x){
                node1=curr;
            }
            if(curr.data==y){
                node2=curr;
            }
            curr=curr.next;
        }


        if(node1!=null && node2!=null)
        {
            //swaping the head;
            if(node1==headref){
                dd.head=node2;
            } else if (node2==headref) {
                dd.head=node1;
            }

            //Change the next pointer of both
            Node temp=node1.next;
            node1.next=node2.next;
            node2.next=temp;

            if(node1.next!=null){
                node1.next.prev=node1;
            }
            if(node2.next!=null){
                node2.next.prev=node2;
            }

            temp=node1.prev;
            node1.prev=node2.prev;
            node2.prev=temp;

            if(node1.prev!=null){
                node1.prev.next=node1;
            }
            if(node2.prev!=null){
                node2.prev.next=node2;
            }
        }
    }

    //swap the two nodes;
    public void Rotate(DoublyLinkedlist dd,int k)
    {
        //temp also store lastlinkedlist
        Node temp=dd.head;
        Node LastNode=null;
        if(temp==null){
            return;
        }

        int size=0;

        while(temp!=null){
            LastNode=temp;
            temp=temp.next;
            size++;
        }

        if(size==k){
            return;
        }

        Node curr=dd.head;

//        int count=k-1;

         // no of list have two swap for also if k==1;
         int count=size-k;

        while (curr!=null && count>0)
        {
            curr=curr.next;
            count--;
        }

        //Swaping done
        curr.prev.next=null;
        LastNode.next=dd.head;
        dd.head=curr;

        System.out.println(curr.data);
        System.out.println(LastNode.data);

    }


    //Remove Duplicate form sorted linkedlist(
    public void RemoveDup(DoublyLinkedlist dd){
        Node head=dd.head;
        Node temp=dd.head;
        if(head==null){
            return ;
        }
        Node curr=head.next;

        if(curr==null){
            return;
        }

        if(curr.next==null){
            if(temp.data==curr.data){
                temp.next=null;
                return;
            }
        }

        while (curr!=null){
            if(temp.data==curr.data){
                curr=curr.next;
            }else{
                if(temp.next!=null){
                    temp.next=curr;
                }
                if(curr.prev!=null){
                    curr.prev=temp;
                }
                temp=curr;
                curr=curr.next;
            }
        }
        if(curr==null){
            temp.next=null;
        }

    }

    public void  insertAtLast(int data){
        if(head==null){
            Node newNode=new Node(data);
            head=newNode;
            newNode.prev=null;
            return;
        }

        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(data);
        temp.next=newNode;
        newNode.prev=temp;
    }
    public  void Display(Node head){
        if(head==null){
            System.out.println("Linkedlist is empty");
        }
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public  static  void  main(String arg[]){
        DoublyLinkedlist dd=new DoublyLinkedlist();
        dd.insertAtLast(1);
        dd.insertAtLast(2);
        dd.insertAtLast(3);
        dd.insertAtLast(4);
        dd.insertAtLast(5);
        dd.insertAtLast(6);
        dd.insertAtLast(7);
        dd.Rotate(dd,4);
        dd.Display(dd.head);
    }
}
