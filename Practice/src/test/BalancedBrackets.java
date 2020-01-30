package test;

import java.util.*;
/***
 * Check if the incoming string is balanced or not
 * Balanced strings : " "{}()", "[{()}]", "({()})""
 *Unbalanced strings : ""{}(", "({)}", "[[", "}{" "
 */


class BalancedBrackets {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            Deque<Character> stack = new ArrayDeque<>();
            for (int i = 0; i < input.length(); i++) {
                if (!stack.isEmpty()) {
                    switch (input.charAt(i)) {
                        case '}':
                            if (stack.peek() == '{') {
                                stack.pop();
                            }
                            break;
                        case ']':
                            if (stack.peek() == '[') {
                                stack.pop();
                            }
                            break;
                        case ')':
                            if (stack.peek() == '(') {
                                stack.pop();
                            }
                            break;
                        default:
                            stack.push(input.charAt(i));
                    }
                } else {
                    stack.push(input.charAt(i));
                }
            }
            System.out.println(stack.isEmpty());
        }
    }
}
