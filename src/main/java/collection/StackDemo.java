package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // LIFO: LAST IN - FIRST OUT
        Stack<Integer> stack = new Stack<>();

        // Thêm
        stack.push(3);
        // [3]
        stack.push(5);
        // [3, 5]
        stack.push(7);
        // [3, 5, 7]
        System.out.println(stack);

        // Xem phần tử ở đỉnh
        int peek = stack.peek();
        // 7 [3, 5, 7]

        // Lấy phần tử ở đỉnh
        int pop = stack.pop();
        // 7 [3, 5]
    }
}
