package exercise02;

import java.util.*;

public class Question02 {
    public static void main(String[] args) {
        List<String> interviewees = Arrays.asList(
                "Nguyễn Văn Nam",
                "Nguyễn Văn Huyên",
                "Trần Văn Nam",
                "Nguyễn Văn A"
        );

        // a) In ra thứ tự tới của các học sinh theo thứ tự sớm nhất tới muộn nhất (gợi ý dùng Stack)
        printArrivalOrder(interviewees, true);

        // b) In ra thứ tự tới của các học sinh theo thứ tự từ muộn nhất tới sớm nhất (gợi ý dùng Queue)
        printArrivalOrder(interviewees, false);
    }

    private static void printArrivalOrder(List<String> names, boolean earliestFirst) {
        if (earliestFirst) {
            Stack<String> stack = new Stack<>();
            stack.addAll(names);
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        } else {
            Queue<String> queue = new LinkedList<>();
            queue.addAll(names);
            while (!queue.isEmpty()) {
                System.out.println(queue.poll());
            }
        }
    }
}


