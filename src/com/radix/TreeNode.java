package com.radix;

public class TreeNode {
    private int key, val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int inputKey, int inputVal) {
        this.key = inputKey;
        this.val = inputVal;
        left = null;
        right = null;
    }

    public void AddNode(int inputKey, int inputVal) {
        if (inputKey > this.key)
            if (getRight() != null)
                right.AddNode(inputKey, inputVal);
            else
                right = new TreeNode(inputKey, inputVal);

        else if (inputKey < this.key)
            if (getLeft() != null)
                left.AddNode(inputKey, inputVal);
            else
                left = new TreeNode(inputKey, inputVal);

        else if (inputKey == this.key)
            this.val = inputVal;
    }

    public void PrintNodes() {
        if (this.getLeft() != null)
            this.getLeft().PrintNodes();

        System.out.println("Key = '" + this.getKey() + "', value = '" + this.getVal() + "'");

        if (this.getRight() != null)
            this.getRight().PrintNodes();
    }


    public int getKey() {
        return key;
    }

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void Destroy() {
        // удаляем ресурсы детей и удаляем детей
        if (left != null)
            left.Destroy();
        if (right != null)
            right.Destroy();
        left = null;
        right = null;
    }
}