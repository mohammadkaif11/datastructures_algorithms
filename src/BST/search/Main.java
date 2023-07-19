package BST.search;

class  Node{
    int data;
    Node Left;
    Node Right;
    public  Node(int data){
        this.data=data;
        Left=null;
        Right=null;
    }
}

class  TreeNode{
    Node Root;

    //Search
    public Node  Search(Node root,int val){
        while (root!=null && root.data!=val){
          if(root.data>val){
              root=root.Left;
          }else{
              root=root.Right;
          }
        }
        return  root;
    }

    //Find Ceil
    public int  findCeil(Node root,int key){
        int ceil=-1;

        while (root!=null){
            if(root.data==key){
                ceil=root.data;
                return  ceil;
            }
            if(root.data<key){
                root=root.Right;
            }
            else  if(root.data>key){
                ceil=root.data;
                root=root.Left;
            }
        }
        return  ceil;
    }

    //Find Floor
    public int  findFloor(Node root,int key){
        int floor=-1;

        while (root!=null){
            if(root.data==key){
                floor=root.data;
                return  floor;
            }
            if(root.data>key){
                root=root.Left;
            }
            else {
                floor=root.data;
                root=root.Right;
            }
        }
        return  floor;
    }

    //Insert
    public  Node Insert(Node root,int data){
        if(root==null){
            Root=new Node(data);
            return Root;
        }
        Node temp=root;
        while (true){
            if(temp.data<=data){
                if(temp.Right!=null){
                    temp=temp.Right;
                }else{
                    temp.Right=new Node(data);
                    break;
                }
            }else{
                if(temp.Left!=null){
                    temp=temp.Left;
                }else{
                    temp.Left=new Node(data);
                    break;
                }
            }
        }

        return temp;
    }

    //Delete
    public  Node Delete(Node Root,int data){
        if(Root==null){
            return  null;
        }
        if(Root.data==data){
            return  HelperFunction(Root);
        }
        Node root=Root;

        while (root!=null){
            if(root.data>data){
                if(root.Left!=null && root.Left.data==data){
                    root.Left=HelperFunction(root.Left);
                    break;
                }else{
                    root=root.Left;
                }
            }else{
                if(root.Right!=null && root.Right.data==data){
                    root.Right=HelperFunction(root.Right);
                    break;
                }else{
                    root=root.Right;
                }
            }
        }

        return Root;
    }

    //Helper Function ;Delete Helper Function
    public  Node HelperFunction(Node root){
     if(root.Left==null){
         return  root.Right;
     }
     if(root.Right==null){
         return  root.Left;
     }
     Node rightChild=root.Right;
     Node LastRight=LastRight(root.Left);
     LastRight.Right=rightChild;
     return  root.Left;
    }

    //Last Right ;Delete Helper function
    public  Node LastRight(Node root){
        if(root.Right==null){
            return root;
        }
        return LastRight(root.Right);
    }

    //Check BST is valid or not
    public  boolean IsValidBst(Node root){
        return  IsValidBst(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }

    //Check BST IS VALID OR NOT
    public  boolean IsValidBst(Node root,int max,int min){
      if(root==null){
          return  true;
      }
      if(root.data>=max || root.data<= min) return  false;

      return  IsValidBst(root.Left,min,root.data) && IsValidBst(root.Right,root.data,min);
    }

     //Find LCA
    public  Node LowesetCommonAncestor(Node root,Node p,Node q){
        //root
        if(root==null){
            return  null;
        }

        //curr
        int curr=root.data;

        //check guys on right
        if(curr<p.data && curr<q.data){
           return LowesetCommonAncestor(root.Right,p,q);
        }

        ///check guys is on left
        if(curr>p.data && curr>q.data){
            return LowesetCommonAncestor(root.Left,p,q);
        }

        //intersection point
        return  root;
    }

}

public class Main {

}
