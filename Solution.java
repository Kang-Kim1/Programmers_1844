import java.util.*;
class Solution {
    public int solution(int[][] maps) {
	int N = maps.length;
	int M = maps[0].length;
        
	// 출바점으로부터의 거리를 측정하기 위한 count, 와 방문 여부 기록을 위한 visited
	int[][] count = new int[N][M];
        int[][] visited = new int[N][M];
        
	// BFS 알고리즘을 위한 Queue
        Queue<int[]> q = new LinkedList<int[]>();        
        
        // 시작점 입력, count 및 방문 처리
	int[] temp = { 0, 0 };
	q.add(temp);
	count[0][0] = 1;
	visited[0][0] = 1;

	// Queue가 빌 때까지 4방향 확인하며 Count값 증가
	while (!q.isEmpty()) {
		int[] currNM = q.remove();
		int currN = currNM[0];
		int currM = currNM[1];
		int currCount = count[currN][currM];

		if (currN + 1 < N && visited[currN + 1][currM] == 0 && maps[currN + 1][currM] == 1) {
			int[] t = new int[2];
			t[0] = currN + 1;
			t[1] = currM;
			visited[t[0]][t[1]] = 1;
			count[t[0]][t[1]] = currCount + 1;
			q.offer(t);
		}
		if (currN - 1 >= 0 && visited[currN - 1][currM] == 0 && maps[currN - 1][currM] == 1) {
			int[] t = new int[2];
			t[0] = currN - 1;
			t[1] = currM;
			visited[t[0]][t[1]] = 1;
			count[t[0]][t[1]] = currCount + 1;
			q.offer(t);
		}
		if (currM + 1 < M &&  visited[currN][currM + 1] == 0 && maps[currN][currM + 1] == 1) {
			int[] t = new int[2];
			t[0] = currN;
			t[1] = currM + 1;
			visited[t[0]][t[1]] = 1;
			count[t[0]][t[1]] = currCount + 1;
			q.offer(t);
		}
		if (currM - 1 >= 0 &&visited[currN][currM - 1] == 0 && maps[currN][currM - 1] == 1) {
			int[] t = new int[2];
			t[0] = currN;
			t[1] = currM - 1;
			visited[t[0]][t[1]] = 1;
			count[t[0]][t[1]] = currCount + 1;
			q.offer(t);
		}
	}
	// 도착점의 카운트 값이 0일 경우, 도달할 수 없음을 의미
        return count[N-1][M-1] == 0 ? -1 : count[N-1][M-1];
    }
}
