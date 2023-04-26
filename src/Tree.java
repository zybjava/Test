public class Tree {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.add(8);
        bt.add(3);
        bt.add(3);
        bt.add(10);
        bt.add(9);
        bt.add(1);
        bt.add(5);
        bt.add(5);
        bt.print();
    }
}
class BinaryTree{
    class Node{
        private Comparable data;//声明一个节点类
        private Node left;
        private Node right;
        public void addNode(Node newNode){
            if(newNode.data.compareTo(this.data)<0){
                if(this.left==null)
                    this.left=newNode;
                else
                    this.left.addNode(newNode);
            }
            if(newNode.data.compareTo(this.data)>=0){
                if(this.right==null){
                    this.right=newNode;
                }else{
                    this.right.addNode(newNode);
                }
            }
        }
        public void printNode(){
            if(this.left!=null){
                this.left.printNode();
            }
            System.out.print(this.data+"\t");
            if(this.right!=null){
                this.right.printNode();
            }
        }
    }
    private Node root;
    public void add(Comparable data){
        Node newNode=new Node();
        newNode.data=data;
        if(root==null){
            root=newNode;
        }else{
            root.addNode(newNode);
        }
    }
    public void print() {
        this.root.printNode();
    }
}