import java.util.*;
class Solution {
    public int solution(int[][] maps) {
		int N = maps.length;
		int M = maps[0].length;
        
		int[][] count = new int[N][M];
        int[][] visited = new int[N][M];
        
        Queue<int[]> q = new LinkedList<int[]>();        
        
        // 시작점 입력, count 및 방문 처리
		int[] temp = { 0, 0 };
		q.add(temp);
		count[0][0] = 1;
		visited[0][0] = 1;


		while (!q.isEmpty()) {
			int[] currNM = q.remove();
			int currN = currNM[0];
			int currM = currNM[1];
			int currCount = count[currN][currM];


			
			if(currN == 3&& currM ==2) {
				System.out.println("s");
			}

			if (currN + 1 < N && visited[currN + 1][currM] == 0 && maps[currN + 1][currM] == 1) {
				int[] t = new int[2];
				t[0] = currN + 1;
				t[1] = currM;
				visited[currN + 1][currM] = 1;
				count[currN + 1][currM] = currCount + 1;
				q.offer(t);
			}
			if (currN - 1 >= 0 && visited[currN - 1][currM] == 0 && maps[currN - 1][currM] == 1) {
				int[] t = new int[2];
				t[0] = currN - 1;
				t[1] = currM;
				visited[currN - 1][currM] = 1;
				count[currN - 1][currM] = currCount + 1;
				q.offer(t);
			}
			if (currM + 1 < M &&  visited[currN][currM + 1] == 0 && maps[currN][currM + 1] == 1) {
				int[] t = new int[2];
				t[0] = currN;
				t[1] = currM + 1;
				visited[currN][currM + 1] = 1;
				count[currN][currM + 1] = currCount + 1;
				q.offer(t);
			}
			if (currM - 1 >= 0 &&visited[currN][currM - 1] == 0 && maps[currN][currM - 1] == 1) {
				int[] t = new int[2];
				t[0] = currN;
				t[1] = currM - 1;
				visited[currN][currM - 1] = 1;
				count[currN][currM - 1] = currCount + 1;
				q.offer(t);
			}
		}
        return count[N-1][M-1] == 0 ? -1 : count[N-1][M-1];
    }
}
