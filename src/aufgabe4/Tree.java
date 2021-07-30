/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe4;


public class Tree {

    private Node root;

    public void add(int number, String text) {
        Node insertableNode = new Node(number, text);
        if (root == null) {
            root = insertableNode;
        } else {
            if (!checkNumber(number)) {
                if (root.getLeft() != null) {
                    add(insertableNode, root.getLeft());
                } else {
                    root.setLeft(insertableNode);
                }
            } else {
                if (root.getRight() != null) {
                    add(insertableNode, root.getRight());
                } else {
                    root.setRight(insertableNode);
                }
            }
        }
    }

    static boolean checkNumber(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void add(Node insertableNode, Node currentNode) {
        if (insertableNode.getNumber() <= currentNode.getNumber()) {
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(insertableNode);
            } else {
                add(insertableNode, currentNode.getLeft());
            }
        } else if (insertableNode.getNumber() > currentNode.getNumber()) {
            if (currentNode.getRight() == null) {
                currentNode.setRight(insertableNode);
            } else {
                add(insertableNode, currentNode.getRight());
            }
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(7, "Tomate");
        tree.add(8, "Karotte");
        tree.add(4, "Zwiebel");
        tree.add(3, "Olive");
        tree.add(15, "Lauch");
        tree.add(11, "Gurke");
        tree.sumNodeWithNumber(new Node(8, "Karotte"), tree.root);
        tree.sumNodeWithNumber(new Node(3, "Olive"), tree.root);

        System.out.println("The total number of nodes in tree: "+size(tree.root)); // a
        
        /** b
         * the method add(number, text) is making use of checkNumber method to see if new node needs to be place at right or left side of the tree.
         * then for adding at right side, it just passes the node and right node of root to get it placed in right side of tree using add(Node,Node) method,
         * however if right node is null
         * it just makes the new node the right node of tree
         * * then for adding at left side, it just passes the node and left node of root to get it placed in left side of tree using add(Node,Node) method,
         *  however if left node is null, it just makes the new node the left node of tree
         * where as in add(Node, Node) method it's using the number value of new node to figure it out the it's position in sorted tree.
         * 
         */
        
        
        /**c
         * When node with same number is existed, it just replaces the previous node version from the tree
         */
        
        
    }

    // Aufgabenteil d)
    public void sumNodeWithNumber(Node numberNode, Node current) {
        
        if(current == null){
            
            return ;
        }
        
        else if(numberNode.getNumber() == current.getNumber() && current.getLoad().equals(numberNode.getLoad())){
            
            if(numberNode.getLeft()==null && numberNode.getRight()==null){
                System.out.println("The node has no children.");
            }
            else if(numberNode.getLeft()!=null && numberNode.getRight()!=null){
                System.out.println("Number of child nodes: "+2);
                
            }
            else
                System.out.println("The node has one child");
        }
        else{
            sumNodeWithNumber(numberNode,current.getLeft());
            sumNodeWithNumber(numberNode,current.getRight());

        }
        
    }

    public static int size(Node n ) {
        if(n==null)
            return 1;
        return size(n.getLeft())+size(n.getRight());

    }
}
