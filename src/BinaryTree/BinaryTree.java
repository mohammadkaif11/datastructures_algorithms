package BinaryTree;

import java.util.*;

class  Node{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = null;
        right = null;
    }
}

class Pair{
    Node node;
    int number;

     Pair(Node node,int number){
         this.node=node;
         this.number=number;
     }

}


public class BinaryTree {
    Node root;

    // Left | Right | Root
    void  postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);

    }

    // Root | Left | Right
    void  preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    // Itrative
    void  preOrderItrative(Node root){
        if(root==null){
            return;
        }
        Stack<Node> st=new Stack<>();
        st.push(root);
        while (!st.empty()){
            Node node=st.pop();
            System.out.println("Node "+node);
            // Node Right first because left node print first
            if(node.right!=null) st.push(node.right);
            if(node.left!=null)  st.push(node.left);

        }
    }


    //  Left | Root | Right
    void  inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }


    // Itrative- Inorder
    void  inOrderItrative(Node root){
        if(root==null){
            return;
        }

        Node curr=root;
        Stack<Node> st=new Stack<>();
        while (true){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                curr=st.pop();
                curr=curr.right;
            }

        }
    }

    // Level Order
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(root==null){
            return  res;
        }
        Queue<Node> qu=new LinkedList<Node>();
        qu.add(root);

//              1     level-1 size of queue-1 qu[1]
//             /  \   level-2 size of queue-2 qu[2,3]
//            2    3  level-3 size of queue-4 qu[4,5,6,7]
//           /\   / \
//          4  5  6  7


        while (!qu.isEmpty()){

            int size= qu.size();
            List<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                Node cur=qu.peek();
                if(cur.left!=null)  qu.offer(cur.left);
                if(cur.right!=null)  qu.offer(cur.right);
                list.add(cur.data);
                qu.remove();
            }

         res.add(list);
        }

     return  res;


    }


    public void PrePostInOrder(Node root,int n)
    {
        ArrayList<Integer> pre=new ArrayList<>();
        ArrayList<Integer> post=new ArrayList<>();
        ArrayList<Integer> in=new ArrayList<>();
        Stack<Pair> stack=new Stack<Pair>();
        if(root==null) return;

        stack.push(new Pair(root,1));

        while (!stack.isEmpty()){
            Pair it=stack.pop();

            if(it.number==1){
                pre.add(it.node.data);
                stack.push(new Pair(it.node,it.number+1));
                if(it.node.left!=null) stack.push(new Pair(it.node.left,1));
            }else if(it.number==2){
                in.add(it.node.data);
                stack.push(new Pair(it.node,it.number+1));
                if(it.node.right!=null) stack.push(new Pair(it.node.right,1));
            }else{
                post.add(it.node.data);
            }

        }



    }






    public static void main(String[] args) {
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
    }
}
