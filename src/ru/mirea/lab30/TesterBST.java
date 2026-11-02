package ru.mirea.lab30;

public class TesterBST {
    public static void main(String[] args) {
        System.out.println("1. Создание бинарного поискового дерева из 10 узлов");
        BinarySearchTree.Tree myTree = BinarySearchTree.createTree();
        int[] nodes = {45, 23, 67, 12, 34, 56, 89, 9, 25, 78};
        for (int value : nodes) {
            BinarySearchTree.insert(myTree, value);
        }
        BinarySearchTree.walk2(myTree);
        System.out.println("\nТекущее количество узлов в дереве: " + myTree.count);
        System.out.println("\n2. Удаление одного узла");
        int deleteStatus = BinarySearchTree.delete(myTree, 23);
        System.out.println(deleteStatus);
        System.out.println("\n3. Вторая распечатка");
        BinarySearchTree.walk2(myTree);
        System.out.println("Количество узлов после удаления: " + myTree.count);
        System.out.println("\n4. Полное удаление дерева");
        BinarySearchTree.destroy(myTree);
        BinarySearchTree.walk2(myTree);
    }
}
