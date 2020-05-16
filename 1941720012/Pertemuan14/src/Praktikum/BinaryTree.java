package Praktikum;

/**
 *
 * @author FARLAN
 */
public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            Node current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            //if there is no child, simple delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { //if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { //if there is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //if there are 2 childs
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    // 1. Menambahkan node dengan cara rekursif
    public Node insert(Node root, int data) {
        if (isEmpty()) {
            root = new Node(data);
            return root;
        } else {
            Node current = root;
            if (data < current.data) {
                root.left = insert(current.left, data);
            } else if (data > current.data) {
                root.right = insert(current.right, data);
            }
        }
        return root;
    }

    // 2. Menampilkan nilai paling kecil dan paling besar
    int minValue() {
        Node current = root;

        while (current.left != null) {
            current = current.left;
        }
        return (current.data);
    }

    int maxValue() {
        Node current = root;

        while (current.right != null) {
            current = current.right;
        }
        return (current.data);
    }

    // 3. Menampilkan data yang ada di leaf
    void printLeafNodes(Node root) {
        if (isEmpty()) {
            return;
        } else {
            Node current = root;
            if (current.left == null && current.right == null) {
                System.out.print(current.data + " ");
                return;
            }

            if (current.right != null) {
                printLeafNodes(current.right);
            }

            if (current.left != null) {
                printLeafNodes(current.left);
            }
        }
    }

    // 4. Menampilkan banyaknya leaf
    int getLeafCount(Node root) {
        if (isEmpty()) {
            return 0;
        }
        Node current = root;
        if (current.left == null && current.right == null) {
            return 1;
        } else {
            return getLeafCount(current.left) + getLeafCount(current.right);
        }
    }
}
