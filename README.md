# Programmers_1844
## 프로그래머스 - 게임 맵 최단거리(https://programmers.co.kr/learn/courses/30/lessons/1844)  
최단경로를 구해야하는 문제로 BFS알고리즘을 사용해야 함.  
딱히 꼬아놓은 내용이 없어서 어렵지 않게 풀 수 있었음.  
다음번엔 재귀로 구현해 볼 예정  

실행 순서는 다음과 같다 : 
1. 방문을 체크하기 위한 배열, 거리를 계산해 줄 count 배열과 BFS 알고리즘을 수행할 Queue 구현
2. BFS 알고리즘을 수행할 While 문 구현 > Queue가 empty일 떄까지 반복
3. 4방향을 확인하며 Queue에 새로운 좌표 입력, visited, count 배열 업데이트
4. 목적지의 count 값 반환, 값이 0일 경우 도달할 방법이 없는 것을 의미하므로 -1 반환

