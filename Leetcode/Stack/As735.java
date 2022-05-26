package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class As735 {
    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> Stack = new ArrayDeque<>();
        for (int ast : asteroids) {
            if (ast > 0) {
                Stack.push(ast);
            } else {
                while (!Stack.isEmpty() && Stack.peek() > 0 && Stack.peek() < -ast) {
                    Stack.pop();
                }
                if (Stack.isEmpty() || Stack.peek() < 0) {
                    Stack.push(ast);
                } else if (!Stack.isEmpty() && Stack.peek() == -ast) {
                    Stack.pop();
                }
            }
        }
        int[] aa = new int[Stack.size()];
        for (int i = Stack.size() - 1; i >= 0; i--) {
            aa[i] = Stack.pop();
        }
        return aa;
    }

    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        int[] bb = asteroidCollision(asteroids);
        System.out.println(Arrays.toString(bb));
    }
}
