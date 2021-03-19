public class leftistHeap<E extends Comparable<E>> {
    Node root;
    leftistHeap(){}
    public void Merge(E element){
        Node node = new Node(element);
        root = Merge(node, root);
    }
    public Node Merge(Node node, Node root){
        if (root == null){return node;}
        if (node.element.compareTo(root.element) < 0){
            node.right = root;
            return node;
            //return check(node);
        }
        root.right = Merge(node, root.right);
        return node;
        //return check(node);
    }

    public Node check(Node node){
        if(node.right != null && checkNPL(node.right)){
            node.right.npl = findNPL(node.right);
        }
        if(node.left != null && checkNPL(node.left)){
            node.left.npl = findNPL(node.left);
        }
       if(node.right.npl > node.left.npl){
           Node left = node.left;
           node.left = node.right;
           node.right = left;
       }
       return node;
    }

    public boolean checkNPL(Node node){
        return node.npl == -1;
    }

    public int findNPL(Node node){
        if(node == null){return -1;}
        if(node.left == null || node.right == null){
            return 0;
        } else if(node.right.npl != -1 && node.left.npl != -1){
            return min(node.right.npl, node.left.npl);
        }
        int max1 = 1 + findNPL(node.left);
        int max2 = 1 + findNPL(node.right);
        return min(max1, max2);
    }

    public int min(int max1, int max2){
        return Math.min(max1, max2);
    }

    public void printLeftistHeap(){
        printLeftistHeap(root, " ");
    }
    public void printLeftistHeap(Node node, String indentation){
        if(node == null) return;
        printLeftistHeap(node.left, indentation + " ");
        System.out.println(indentation + node.element + " npl(" + node.npl + ")");
        printLeftistHeap(node.right, indentation + " ");
    }


    class Node {
        E element;
        Node right;
        Node left;
        int npl = -1;
        Node(E element){
            this.element = element;
        }
        Node (E element, Node r, Node l){
            right = r;
            left = l;
        }
    }
}
