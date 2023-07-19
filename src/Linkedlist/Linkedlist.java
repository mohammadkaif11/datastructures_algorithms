package Linkedlist;
class Linkedlist{
 Node head;
 static class Node{
  int data;
  Node next;
  Node(int data){
   this.data=data;
   next=null;
  }
 }

 //Detect a loop
 int  FindLoop(Node head){
  Node slow=head;
  Node fast=head;
  while (slow!=null && fast!=null && fast.next!=null)
  {
   if(slow==fast){
    return  1;
   }
   slow=slow.next;
   fast=fast.next;
  }
  return  0;
 }

 //Move evenvalue to right and odd value to left
 Node divide(int N, Node head){

  Node temphead=head;
  Node nn=null;
  Node headnn=null;

  //for even
  while(head!=null){
   if(head.data%2==0){
    if(headnn==null && nn==null){
     headnn=new Node(head.data);
     nn=headnn;
    }else{
     Node newNode =new Node(head.data);
     nn.next=newNode;
     nn=newNode;
    }
   }
   head=head.next;
  }

  head=temphead;
  //for odd
  while(head!=null){

   if(head.data%2!=0){
    if(headnn==null && nn==null){
     headnn=new Node(head.data);
     nn=headnn;
    }else{
     Node newNode =new Node(head.data);
     nn.next=newNode;
     nn=newNode;
    }
   }

   head=head.next;
  }

  nn.next=null;
  return headnn;
 }

 //reverse linkedlist
 public  void  ReverseLinkedlist(Node head){
  Node dummyNode=null;
   while (head!=null){
   Node next=head.next;
   head.next=dummyNode;
   dummyNode=head;
   head=next;
  }
 }

 //copy linkedlist
 public Node CopyLinkedlist(Node head){
  if(head==null){
   return head;
  }
  Node curr=head;
  Node copy=new Node(head.data);

  Node Headcopy=copy;
  curr=curr.next;
  while (curr!=null){
   Node nn=new Node(curr.data);
   copy.next=nn;
   copy=nn;
   curr=curr.next;
  }
  copy.next=null;
  return Headcopy;
 }

 //movLH
 public  void MoveLH(Linkedlist ll){
  Node head=ll.head;
  if(head==null){
   return;
  }

  Node headref=head;
  Node prev=head;
  Node curr=head;

  while (headref.next!=null){
   if(headref.next.data<curr.data){
    prev=headref;
    curr=headref.next;
   }
   headref=headref.next;
  }

  if(prev!=curr){
   prev.next=curr.next;
   curr.next=head;
   ll.head=curr;
  }

  headref=ll.head;
  prev=ll.head;
  curr=ll.head;

  while (headref.next!=null){
   if(headref.next.data>curr.data){
    prev=headref;
    curr=headref.next;
   }
   headref=headref.next;
  }


  if(prev!=curr && prev!=headref && curr!=headref ){
   prev.next=curr.next;
   headref.next=curr;
   curr.next=null;
  }

 }
 //printlist
 public void printlist(){
  Node n=head;
  while(n!=null){
   System.out.println(n.data);
   n=n.next;
  }
 }

 //addfornt
 public void addfornt(int data){
  Node nn=new Node(data);
  Node temp=head;
  nn.next=temp;
  head=nn;
 }

 //addAfter
 public void addAfter(Node prev,int data){
  Node nn=new Node(data);
  if(prev==null){
   System.out.println("prev Node cannot be null");
   return;
  }
  nn.next=prev.next;
  prev.next=nn;
 }

 //addLast
 public void addLast(int data){
  Node nn=new Node(data);
  if(head==null){
   head=nn;
   return;
  }
  nn.next=null;
  Node temp=head;
  while(temp.next!=null){
   temp=temp.next;
  }
  temp.next=nn;
  return;


 }

 //deletenode by value
 public void deletenode(int value){
  Node temp=head,prev=null;
  if(temp==null){
   return;
  }
  if(temp!=null && temp.data==value){
   head=temp.next;
  }
  while(temp!=null && temp.data!=value){
   prev=temp;
   temp=temp.next;
  }
  prev.next=temp.next;
 }


 //delete By postion
 public void deletenodep(int pos){
  Node temp=head;
  if(temp==null){
   return;
  }
  if(pos==0){
   head=temp.next;
   return;
  }
  for(int i=0;temp!=null&& i<pos-1;i++){
   temp=temp.next;
  }
  if(temp==null || temp.next.next==null)return;
  temp.next=temp.next.next;
 }

 //searching in linkedlist
 public boolean search(int value){
  if(head==null){
   System.out.println("Linked list is null");
   return false;
  }
  if(head.data==value){
   return true;

  }

  Node temp=head;
  while(temp!=null){
   if(temp.data==value){
    return true;
   }
  }
  return false;
 }

 // count number of element in linkedlist
 public void size(){
  int count=0;
  Node temp=head;
  while (temp!=null) {
   count++;
   temp=temp.next;
  }
  System.out.println("size of linkedlist is "+count);
 }


 public void findNthNodeFromLast(Node head,int n){
  // find length(linkedlist)-n +1 -- want size of ll;
  Node first=head;
  Node second=head;
  while (n!=0 && first!=null){
   first=first.next;
   n--;
  }

  while (first!=null && second!=null){
   first=first.next;
   second=second.next;
  }

  System.out.println("last Node "+ second.data);
 }

 public static void main(String[] args) {
  Linkedlist ll=new Linkedlist();

  ll.addLast(1);
  ll.addLast(2);
  ll.addLast(3);
  ll.findNthNodeFromLast(ll.head,2);
  ll.printlist();
  ll.size();
  ll.ReverseLinkedlist(ll.head);
  ll.printlist();
  ll.size();

 }
}