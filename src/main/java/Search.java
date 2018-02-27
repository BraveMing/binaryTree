public interface Search {
    /**
     * 先序遍历
     * 
     * @param node
     */
    void preSearch(BinaryTree node);
    /**
     * 中序遍历
     * 
     * @param node
     */
    void inSearch(BinaryTree node);
    /**
     * 后序遍历
     * 
     * @param node
     */
    void postSearch(BinaryTree node);
}