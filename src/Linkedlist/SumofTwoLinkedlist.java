package Linkedlist;

public class SumofTwoLinkedlist {

    public  static Node Sum(Node head1,Node head2)
    {
        Node result=null;
        Node resultHead=null;
        int carry=0;

        while (head1!=null && head2!=null){
            int data=head1.data+ head2.data+carry;
            if(data>=10){
                carry=data/10;
                data=data%10;
                if(result==null){
                    result=new Node(data);
                    resultHead=result;
                    result.next=null;
                }else{
                    result.next=new Node(data);
                    result.next.next=null;
                    result=result.next;
                }
            }else{
                carry=0;
                if(result==null){
                    result=new Node(data);
                    resultHead=result;
                    result.next=null;
                }else{
                    result.next=new Node(data);
                    result.next.next=null;
                    result=result.next;
                }
            }
        }

        while (head1!=null){
            int data=head1.data+carry;
            if(data>=10){
                carry=data/10;
                data=data%10;
                if(result==null){
                    result=new Node(data);
                    resultHead=result;
                    result.next=null;
                }else{
                    result.next=new Node(data);
                    result.next.next=null;
                    result=result.next;
                }
            }else{
                carry=0;
                if(result==null){
                    result=new Node(data);
                    resultHead=result;
                    result.next=null;
                }else{
                    result.next=new Node(data);
                    result.next.next=null;
                    result=result.next;
                }
            }
        }

        while (head2!=null){
            int data=head2.data+carry;
            if(data>=10){
                carry=data/10;
                data=data%10;
                if(result==null){
                    result=new Node(data);
                    resultHead=result;
                    result.next=null;
                }else{
                    result.next=new Node(data);
                    result.next.next=null;
                    result=result.next;
                }
            }else{
                carry=0;
                if(result==null){
                    result=new Node(data);
                    resultHead=result;
                    result.next=null;
                }else{
                    result.next=new Node(data);
                    result.next.next=null;
                    result=result.next;
                }
            }
        }

        if(carry!=0){
            result.next=new Node(carry);
            result.next.next=null;
        }

        return  resultHead;
    }

    public static void main(String[] args) {


    }
}
