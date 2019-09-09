import java.util.Stack;

public class StackSearch implements Search {

    @Override
    public void preSearch(BinaryTree node) {
        //先序遍历根节点-左节点-右节点
        Stack<BinaryTree> stack = new Stack<BinaryTree>();
        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.push(node);
                System.out.print(node.getValue());
                node = node.getLeft();
            }
            if (!stack.empty()) {
                node = stack.pop();
                node = node.getRight();
            }
        }

    }

    @Override
    public void inSearch(BinaryTree node) {
        //中序遍历左节点-根节点-右节点
        Stack<BinaryTree> stack = new Stack<BinaryTree>();
        //获取开始位置，并把左边的根节点压栈便于后续去查找右节点
        while (node != null || !stack.empty()) {

            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }
            if (node == null) {
                //如果node为空说明可以出栈了
                node = stack.pop();
                System.out.print(node.getValue());
                node = node.getRight();
            }
        }
    }

    @Override
    public void postSearch(BinaryTree node) {
        //后序遍历左节点-右节点-根节点
        Stack<BinaryTree> stack = new Stack<BinaryTree>();

        while (node != null || !stack.empty()) {

            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }
            BinaryTree lastNode = null;
            while (!stack.empty()) {
                    node = stack.pop();
                //要不要打印就要看它的右节点打印了吗，右节点打印了才可以 要标识是否右节点打印了可以加个状态，
                //也可以加个变量记录最后一次打印是不是右节点，如果是现在根节点是需要打印了

                    if (node.getRight() == null || lastNode == node.getRight()) {
                        System.out.print(node.getValue());
                        lastNode = node;
                        
                    } else {
                        stack.push(node);
                        node = node.getRight();
                        break;
                    }
            }
        }
    }

}
