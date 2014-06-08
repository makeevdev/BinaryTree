package com.radix;

public class BinaryTree {
    TreeNode root;

    public void Insert(int key, int val) { // добавление элемента в дерево
        if (root == null)
            root = new TreeNode(key, val);
        else
            root.AddNode(key, val);

    }

    public void PrintTree() { //INFIX_TRAVERSE
        if (root == null)
            System.out.println("Дерево пусто");
        else { // рекурсивно обходим сначала слева, потом корень, потом рекурсивно справа
            System.out.println("// Вывод дерева по правилу INFIX_TRAVERSE\n");
            if (root.getLeft() != null)
                root.getLeft().PrintNodes();

            System.out.println("Key = '" + root.getKey() + "', value = '" + root.getVal() + "'");

            if (root.getRight() != null)
                root.getRight().PrintNodes();

            System.out.println("\n//Вывод завершен\n");
        }
    }
}


