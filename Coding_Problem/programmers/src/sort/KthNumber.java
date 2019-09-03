package sort;

import java.util.ArrayList;
import java.util.Collections;

// 프로그래머스 정렬 1번째 문
public class KthNumber {
	/*
	 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
	 * 
	 * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
	 * 
	 * array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다. 2에서
	 * 나온 배열의 3번째 숫자는 5입니다. 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질
	 * 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution
	 * 함수를 작성해주세요.
	 * 
	 * 제한사항 array의 길이는 1 이상 100 이하입니다. array의 각 원소는 1 이상 100 이하입니다. commands의 길이는 1
	 * 이상 50 이하입니다. commands의 각 원소는 길이가 3입니다. 입출력 예 array commands return [1, 5, 2,
	 * 6, 3, 7, 4] [[2, 5, 3], [4, 4, 1], [1, 7, 3]] [5, 6, 3]
	 */
	public static void main(String[] args) {
		SolutionKthNum su = new SolutionKthNum();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		for(int data : su.solution(array, commands))
			System.out.print(data + " ");
	}
}
class SolutionKthNum {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> st = null;
			int[] result = new int[commands.length];
			for(int i=0; i<commands.length; i++) {
				st = new ArrayList<Integer>();	// copyOfRange(원본배열, 복사할 시작인덱스, 복사할 끝 인덱스)
				for(int j=commands[i][0]; j<=commands[i][1]; j++) {
					st.add(array[j-1]);
				}
				Collections.sort(st);		
				result[i] = st.get(commands[i][2]-1);
			}
        return result;
    }
}