package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // FIFO: FIRST IN - FIRST OUT
        Queue<Integer> queue = new LinkedList<>();

        // queue.add cũng được
        queue.offer(1);
        // [1]
        queue.offer(3);
        // [1, 3]
        queue.offer(5);
        // [1, 3, 5]
        System.out.println(queue);

        // Xem phần tử đầu tiên
        int peek = queue.peek();
        // 1
        System.out.println("peek = " + peek);
        System.out.println(queue);

        // Lấy ra phần tử đầu tiên khỏi hàng đợi
        int poll = queue.poll();
        // 1 [3, 5]
    }
}
