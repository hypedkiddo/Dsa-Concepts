public class Traversals {
    //static means does not depend on Object
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
          this.data=data;
          this.left=null;
          this.right=null;
        }
    }

    //Constructing tree from Preoder traveral
   static class Binarytree{
        static int idx=-1;
         public static Node buildTree(int nodes[]){
             idx++;
             if(nodes[idx]==-1){
                return null;
             }
             Node newnode=new Node(nodes[idx]);
             newnode.left=buildTree(nodes);
             newnode.right=buildTree(nodes);
             return newnode;
         }
         //Preorder traversal of tree
         public static  void  Preorder(Node root){
             if(root==null){
                 return ;
             }
             System.out.print( root.data + " ");
             Preorder(root.left);
             Preorder(root.right);
         }

         //Postorder traversal of tree
        public static void Postorder(Node root){
             if(root==null){
                 return ;
             }
             Postorder(root.left);
             Postorder(root.right);
            System.out.print(root.data+" ");
        }
        //Inorder Traversal
        public static void Inorder(Node root){
            if(root==null){
                return ;
            }
            Postorder(root.left);
            System.out.print(root.data+" ");
            Postorder(root.right);
        }
        //Count number of nodes in a tree
        public static int Count(Node root){
             if(root==null){
                 return 0;
             }
            int res1=Count(root.left);
             int res2=Count(root.right);
             return res1+res2+1;
        }
        //Sum of nodes in a tree
        public static int sum(Node root){
            if(root==null){
                return 0;
            }
            int res1=sum(root.left);
            int res2=sum(root.right);
            return res1+res2+root.data;
        }

        //Calculate Height of a Binary tree
        public static int height(Node root){
           if(root==null){
               return 0;
           }
           int leftHeight=height(root.left);
            int RightHeight=height(root.right);
            return leftHeight+RightHeight+1;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         Binarytree tree=new Binarytree();
          Node root=Binarytree.buildTree(nodes);
//        Binarytree.Postorder(root);
//        Binarytree.Inorder(root);
        System.out.println(Binarytree.sum(root));


    }
}
