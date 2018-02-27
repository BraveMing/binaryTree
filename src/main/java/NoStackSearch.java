public class NoStackSearch implements Search  {
    /**
     * 先序遍历
     * 
     * @param node
     */
    public  void preSearch(BinaryTree node) {
        if (node != null) {
            int value = node.getValue();
            System.out.print(value);
            if (node.getLeft() != null) {
                preSearch(node.getLeft());
            }
            if (node.getRight() != null) {
                preSearch(node.getRight());
            }
        }

    }

    /**
     * 中序遍历
     * 
     * @param node
     */
    public  void inSearch(BinaryTree node) {
        if (node != null) {
            int value = node.getValue();
            if (node.getLeft() != null) {
                inSearch(node.getLeft());
            }
            System.out.print(value);
            if (node.getRight() != null) {
                inSearch(node.getRight());
            }
        }

    }

    /**
     * 后序遍历
     * 
     * @param node
     */
    public  void postSearch(BinaryTree node) {
        if (node != null) {
            int value = node.getValue();
            if (node.getLeft() != null) {
                postSearch(node.getLeft());
            }
            if (node.getRight() != null) {
                postSearch(node.getRight());
            }
            System.out.print(value);
        }

    }

}
