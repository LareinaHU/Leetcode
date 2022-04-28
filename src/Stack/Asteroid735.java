package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Asteroid735 {
    public static int[] asteroidCollision(int[] asteroids) {
        // int n = asteroids.length;
        Deque<Integer> Stack = new ArrayDeque<>();
        for (int ast : asteroids) {
            if (ast > 0) {
                Stack.push(ast);
            } else {
                while (!Stack.isEmpty() && Stack.peek() > 0 && Stack.peek() < -ast) {
                    Stack.pop();
                }
                if (!Stack.isEmpty() && Stack.peek() == -ast) {
                    Stack.pop();
                } else if (Stack.isEmpty() || Stack.peek() < 0) {
                    Stack.push(ast);
                }
            }
        }
        int[] res = new int[Stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = Stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {-234, -45346, 34645, 7, 876, -3435, -32432, 89, -67, 5754, 643, 52};
        int[] b = asteroidCollision(a);
        System.out.println(Arrays.toString(b));
    }
}

