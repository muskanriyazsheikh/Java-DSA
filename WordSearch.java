public class WordSearch {
    public static boolean wordSearch(char[][] board, String word) {
            for(int i=0; i<board.length; i++) {
                for(int j=0; j<board[i].length; j++) {
                    if(dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
            return false;
        }
      private static boolean dfs(char[][] board , String word, int i, int j, int index) {
        if(index == word.length()) {
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board.length || board[i][j] != word.charAt(index) ) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' '; //mark board as visited
        boolean found = dfs(board, word, i+1, j, index+1) ||
                         dfs(board, word, i-1, j, index+1)||
                         dfs(board, word, i, j+1, index+1)||
                         dfs(board, word, i, j-1, index+1);
                        
          board[i][j] = temp; //restore the cell
          return found;
      }
    public static void main(String args[]) {
        char[][] board = {{'A','B','C','E'},
                          {'S','F','C','S'},
                          {'A','D','E','E'}};
        System.out.println(wordSearch(board, "ABAB"));
    }
}
