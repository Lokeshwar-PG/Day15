package com.binarysearchtree;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void addNode(int key) {
        root = addRecursive(root, key);
    }

    public Node addRecursive(Node currentNode, int key) {
        if(currentNode == null) {
            return new Node(key);
        }
        if(currentNode.key > key) {
            currentNode.left = addRecursive(currentNode.left, key);
        }
        else if(currentNode.key < key) {
            currentNode.right = addRecursive(currentNode.right, key);
        }
        return currentNode;
    }

    public void inOrderTraversal() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(Node node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.print(node.key + " ");
            inOrderRecursive(node.right);
        }
    }

    public boolean search(int key) {
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(Node currentNode, int key) {
        if(currentNode==null) {
            return false;
        }
        if(currentNode.key == key) {
            return true;
        }
        if(currentNode.key > key) {
            return searchRecursive(currentNode.left, key);
        }
        return searchRecursive(currentNode.right, key);
    }
}
