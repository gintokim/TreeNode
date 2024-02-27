public class Tree {
    private TreeNode root;

    public Tree() {
        this.root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    // Метод для добавления узла в дерево
    public void addNode(int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
        } else {
            TreeNode current = root;
            current.getChildren().add(newNode);
        }
    }

    // Рекурсивный метод для обхода дерева в глубину (DFS)
    public void depthFirstSearch(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            for (TreeNode child : node.getChildren()) {
                depthFirstSearch(child);
            }
        }
    }

    public static void main(String[] args) {
        // Создаем дерево
        Tree tree = new Tree();

        // Добавляем узлы в дерево
        tree.addNode(1);
        tree.addNode(2);
        tree.addNode(3);

        // Добавляем потомков для узла 1
        TreeNode root = tree.getRoot();
        root.addChild(new TreeNode(4));
        root.addChild(new TreeNode(5));

        // Добавляем потомков для узла 2
        TreeNode node2 = root.getChildren().get(0);
        node2.addChild(new TreeNode(6));
        node2.addChild(new TreeNode(7));

        // Добавляем потомков для узла 3
        TreeNode node3 = root.getChildren().get(1);
        node3.addChild(new TreeNode(8));

        // Выполняем обход дерева в глубину (DFS) и выводим значения узлов
        System.out.println("Depth-First Search:");
        tree.depthFirstSearch(root);
    }
}