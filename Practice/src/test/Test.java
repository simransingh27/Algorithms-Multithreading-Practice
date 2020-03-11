package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        System.out.println(isBalanced1("{}"));
    }

    public static String isBalanced(String s) {

        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char charValue : charArray) {

            System.out.println("Incoming values : " + charValue);
            if (stack.isEmpty()) {
                stack.push(charValue);
            } else {
                switch (charValue) {
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
                        stack.push(charValue);
                }

            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            System.out.println("size of stack : " + stack.size());
            return "NO";
        }
    }

    public static String isBalanced1(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put(')', '(');
        map.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty()) {
                    return "NO";
                }
                char c = stack.pop();
                if (c != map.get(s.charAt(i))) {
                    return "NO";
                }
            }
        }
        if (!stack.empty()) {
            return "NO";
        }
        return "YES";
    }
}
