import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreOrderPrint {

    public static List<Integer> iterativelyPreOrderPrint(BinaryTree binaryTree) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<BinaryTree> stack = new Stack<BinaryTree>();
        if (binaryTree != null)
            stack.push(binaryTree);
        while (!stack.isEmpty()) {
            binaryTree = stack.peek();
            stack.pop();
            list.add(binaryTree.getValue());

            if (binaryTree.getRight() != null)
                stack.push(binaryTree.getRight());
            if (binaryTree.getLeft() != null)
                stack.push(binaryTree.getLeft());
        }
        return list;
    }

    public static List<Integer> iterativelyInOrderPrint(BinaryTree binaryTree) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<BinaryTree> stack = new Stack<BinaryTree>();
        while (!stack.isEmpty() || binaryTree != null) {
            if (binaryTree != null) {
                stack.push(binaryTree);
                binaryTree = binaryTree.getLeft();
            } else {
                binaryTree = stack.peek();
                stack.pop();
                list.add(binaryTree.getValue());
                binaryTree = binaryTree.getRight();
            }
        }
        return list;
    }

    public static List<Integer> iterativelyPostOrderPrint(BinaryTree binaryTree) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<BinaryTree> stack = new Stack<BinaryTree>();

        do {
            while (binaryTree != null) {
                stack.push(binaryTree);
                binaryTree = binaryTree.getLeft();
            }
            BinaryTree bi = null;
            while (!stack.isEmpty()) {
                if (binaryTree.getRight() != bi) {
                    stack.push(binaryTree);
                    binaryTree = binaryTree.getRight();
                    break;
                } else {
                    list.add(binaryTree.getValue());
                    bi = binaryTree;
                }
            }
        } while (!stack.isEmpty());

        return list;
    }
}