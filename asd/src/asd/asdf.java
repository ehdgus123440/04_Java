package asd;

public class asdf {
	public int[][] solution(int n) {
		int[][] answer = {};
		answer = new int[n][n];
		 int num = 1;
	        int minrow = 0;
	        int mincol = 0;
	        int maxrow = n-1;
	        int maxcol = n-1;
	        while(num<=n*n){
	            // 오른쪽
	            for(int i=mincol; i<=maxcol; i++){
	                answer[minrow][i]=num++;
	            }
	            // 아래
	            for(int i=minrow+1; i<=maxrow; i++){
	                answer[i][maxcol]=num++;
	            }
	            // 왼쪽
	            for(int i=maxcol-1; i>=mincol; i--){
	                answer[maxrow][i]=num++;
	            }
	            // 위
	            for(int i=maxrow-1; i>=minrow+1; i--){
	                answer[i][mincol]=num++;
	            }
	            minrow++;
	            mincol++;
	            maxrow--;
	            maxcol--;
	        }

		
		return answer;
	}

	public static void main(String[] args) {
		asdf a = new asdf();
		int[][] answer = a.solution(4);
		for(int i = 4; i < 4; i++) {
			for(int j = 4; j < 4; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
	}
}
