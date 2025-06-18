public class Traversals {
    static class Node{
        int value;
        Node left;
        Node right;
        //Constructor class
        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        //Doing Preorder Traversal
        public static void Preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.value + " ");
            Preorder(root.left);
            Preorder(root.right);
        }
        //Doing Inorder Traversals
        public static void Inorder(Node root){
            if(root == null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.value + " ");
            Inorder(root.right);
        }
        //PostOrder
        public static void PostOrder(Node root){
            if(root == null){
                return;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.value + " ");
        }
    }


    public static void main(String[] args) {

        int nodes[]={1,2,4,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root =tree.buildTree(nodes);
        tree.Preorder(root);
//        System.out.println(root.value);
    }
}
