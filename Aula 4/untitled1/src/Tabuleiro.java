public class Tabuleiro {

    private int turn = 1;
    private char playingColor = 'R';
    private boolean winner = false;
    private char[][] grid = new char[5][10];

    public Tabuleiro() {
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                grid[row][col] = ' ';
            }
        }
    }

    private boolean hasWinner(char player) {

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (peca.sentido == 1) {
                    if (grid[row][col] == player &&
                            grid[row][col + 2] == player &&
                            grid[row - 1][col + 1] == player) {
                        return true;
                    }
                }
            }

            return false;
        }

    }
