import java.util.*;

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
        //Time complexity:O(n)
        public static void Preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.value + " ");
            Preorder(root.left);
            Preorder(root.right);
        }
        //doing it iteratively
        public List<Integer> preorderIterative(Node  root) {
            List<Integer> ans=new ArrayList<>();
            if(root==null){
                return ans;
            }
            Stack<Node  > st=new Stack<Node >();
            st.push(root);
            while(!st.isEmpty()){
                root=st.pop();
                ans.add(root.value);
                if(root.right!=null){
                    st.push(root.right);
                }
                if(root.left!=null){
                    st.push(root.left);
                }
            }
            return ans;
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
        //Doing it in a iterative way
        public List<Integer> inorderTraversal(Node root) {
            List<Integer> ans = new ArrayList<>();
            //handling edge case
            if (root == null) {
                return ans;
            }
            Node node=root;
            Stack<Node> st = new Stack<Node>();
            while (true) {
                if(node!=null){
                    st.push(node);
                    node=node.left;
                }
                else{
                    if(st.isEmpty()){
                        break;
                    }
                    node=st.pop();
                    ans.add(node.value);
                    node=node.right;
                }
            }
            return ans;
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
        //Doing it the iterative Way
        public List<Integer> postorderTraversal(Node root) {
            List<Integer> ans = new ArrayList<>();
            if (root == null) {
                return ans;
            }
            Stack<Node> st1 = new Stack<Node>();
            Node node = root;
            st1.push(root);
            while (!st1.isEmpty()) {
                node=st1.pop();
                if(node.left!=null){
                    st1.push(node.left);
                }
                if(node.right!=null){
                    st1.push(node.right);
                }
                ans.add(node.value);
            }
            Collections.reverse(ans);
            return ans;
        }
        //Level order Traversal O(n)
        public static void level(Node root){
            if(root==null){
              return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node node=q.remove();
                if(node==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.println(node.value + " ");
                    if(node.left!=null){
                        q.add(node.left);
                    }
                    if(node.right!=null){
                        q.add(node.right);
                    }
                }

            }

        }
        //Calculating Height of a Binary Tree
        //O(n)
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);

            return (Math.max(lh,rh)+1);

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
