package com.xl.leetcode;

public class ArraysTest {

	public static void main(String[] args) {
		char [][] arr = new char[][] {{'.','.','.','.','.','.','.','.'},
																	{'.','.','.','p','.','.','.','.'},
																	{'.','.','.','p','.','.','.','.'},
																	{'p','p','.','R','.','p','B','.'},
																	{'.','.','.','.','.','.','.','.'},
																	{'.','.','.','B','.','.','.','.'},
																	{'.','.','.','p','.','.','.','.'},
																	{'.','.','.','.','.','.','.','.'}};

		System.out.println(numRookCaptures(arr));
	}

	public static int numRookCaptures(char[][] board) {
		//get Rook posistion
		int x = -1;
		int y = -1;
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(board[i][j] == 'R'){
					x = i;
					y = j;
				}
			}
		}

		int count = 0;
		//down
		for(int j = x; j < 8; j++){
			if(board[j][y] == 'B'){
				break;
			}

			if(board[j][y] == 'p'){
				count++;
			}
		}

		//up
		for(int j = x; j >= 0; j--){
			if(board[j][y] == 'B'){
				break;
			}

			if(board[j][y] == 'p'){
				count++;
				break;
			}
		}

		//left
		for(int i = y; i >= 0; i--){
			if(board[x][i] == 'B'){
				break;
			}

			if(board[x][i] == 'p'){
				count++;
				break;
			}
		}

		//right
		for(int i = y; i < 8; i++){
			if(board[x][i] == 'B'){
				break;
			}

			if(board[x][i] == 'p'){
				count++;
			}
		}

		return count;
	}

}
