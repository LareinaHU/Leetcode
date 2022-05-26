package ninechapter9;

import java.util.LinkedList;
import java.util.Queue;

public class friendsCIrcle1179 {
    public int beginbfs(int[][] M) {
        int n = M.length;
        int ans = 0;
        boolean[] visisted = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visisted[i]) {
                ans += 1;
                visisted[i] = true;
                Queue<Integer> queue = new LinkedList<>();

                queue.add(i);

                while (!queue.isEmpty()) {
                    int now = queue.poll();
                    //从队首找朋友
                    for (int j = 0; j < n; j++) {
                        //找到新朋友（之前没访问过的朋友）就标记访问并压入队列
                        if (visisted[j] == false && M[now][j] == 1) {
                            visisted[j] = true;
                            queue.add(j);
                        }
                    }
                }

            }
        }
        return ans;
    }

    public int findCircleNum(int[][] M) {
        int ansbfs = beginbfs(M);
        return ansbfs;
    }
}
