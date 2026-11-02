package ru.mirea.lab30;

public class BinarySearchTree {
    public static class Node{
        public int data;
        public Node left;
        public Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class Tree{
        Node root;
        int count;
    }
    public static Tree createTree(){
        Tree newTree = new Tree();
        newTree.root = null;
        newTree.count = 0;
        return newTree;
    }
    public static int binSearch(final Tree searchTree, int item){
        Node searchNode;
        searchNode = searchTree.root;
        for (;;) {
            if (searchNode == null) return 0;
            else if (item == searchNode.data) return 1;
            else if (item > searchNode.data) searchNode = searchNode.right;
            else searchNode = searchNode.left;
        }
    }
    public static int insert(Tree searchTree, int item){
        if (searchTree.root == null) {
            searchTree.root = new Node(item);
            searchTree.count++;
            return 1;
        }
        Node searchNode = searchTree.root;
        for (;;) {
            if (item == searchNode.data) {
                return 2;
            } else if (item > searchNode.data) {
                if (searchNode.right == null) {
                    searchNode.right = new Node(item);
                    searchTree.count++;
                    return 1;
                }
                searchNode = searchNode.right;
            } else {
                if (searchNode.left == null) {
                    searchNode.left = new Node(item);
                    searchTree.count++;
                    return 1;
                }
                searchNode = searchNode.left;
            }
        }
    }
    public static int delete(Tree searchTree, int item){
        Node parent = null;
        Node z = searchTree.root;
        for (;;) {
            if (z == null) return 0;
            else if (item == z.data) break;
            else if (item > z.data) {
                parent = z;
                z = z.right;
            } else {
                parent = z;
                z = z.left;
            }
        }
        if (z.right == null) {
            // Если мы удаляем корень
            if (parent == null) searchTree.root = z.left;
            else if (parent.right == z) parent.right = z.left;
            else parent.left = z.left;
        } else {
            Node y = z.right;
            if (y.left == null) {
                y.left = z.left;
                if (parent == null) searchTree.root = y;
                else if (parent.right == z) parent.right = y;
                else parent.left = y;
            } else {
                Node x = y.left;
                while (x.left != null) {
                    y = x;
                    x = y.left;
                }
                y.left = x.right;
                x.left = z.left;
                x.right = z.right;
                if (parent == null) searchTree.root = x;
                else if (parent.right == z) parent.right = x;
                else parent.left = x;
            }
        }
        searchTree.count--;
        return 1;
    }
    private static void walk(final Node searchNode){
        if (searchNode == null) return;
        walk(searchNode.left);
        System.out.print(searchNode.data + " ");
        walk(searchNode.right);
    }
    public static void walk2(final Tree myTree) {
        walk(myTree.root);
        System.out.println();
    }
    public static void destroy(Tree searchTree){
        searchTree.root = null;
        searchTree.count = 0;
    }

}
