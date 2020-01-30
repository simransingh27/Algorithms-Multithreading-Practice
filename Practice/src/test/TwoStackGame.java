package test;

import java.util.Stack;
/**
 * We have two stacks of non-negative integers,
 * We can remove one integer from the top of either stack  or stack. make sure sum should be less than x variable
 * Once that is reached , just print the values.
 * */
public class TwoStackGame {

    public static void main(String[] args) {

        int[] a = new int[]{4, 2, 4, 4, 1, 2, 3, 4, 5, 6, 7};
        int[] b = new int[]{2, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
        int value = twoStacks(10, a, b);
        System.out.println("Output " + value);

    }

    /*
     * Complete the twoStacks function below.
     */
    public static int twoStacks(int x, int[] a, int[] b) {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        for (int i = a.length - 1; i >= 0; i--) {
            stack1.push(a[i]);
        }
        for (int i = b.length - 1; i > 0; i--) {
            stack2.push(a[i]);
        }

        int count = 0;
        int countStack1 = a.length;
        int countStack2 = b.length;

        while (countStack1 > 0 || countStack2 > 0) {
            int finalValue = stack1.peek() + stack2.peek();
            if (finalValue < x) {
                stack1.pop();
                stack2.pop();
                count += 2;
                countStack1--;
                countStack2--;
            } else {
                break;
            }
        }
        return count;
    }

}
