package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String [][] board;
    public TicTacToe(String[][] board) {
        this.board=board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String [] array={board[value][0],board[value][1],board[value][2]};
        return array;
    }

    public String[] getColumn(Integer value) {
        String [] array={board[0][value],board[1][value],board[2][value]};
        return array;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {

        if(board[rowIndex][0].equals(board[rowIndex][1])&&board[rowIndex][1]==board[rowIndex][2])
            return true;
        else
            return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if(board[0][columnIndex]==board[1][columnIndex]&&board[1][columnIndex]==board[2][columnIndex])
            return true;
        else
            return false;
    }

    public String getWinner() {
        if(board[0][0]=="X"&&board[1][1]=="X"&&board[2][2]=="X")
            return "X";
        else if(board[0][0]=="O"&&board[1][1]=="O"&&board[2][2]=="O")
            return "O";
        for(int value=0;value<3;value++) {
            if (board[value][0] == "X" && board[value][1] == "X" && board[value][2] == "X")
                return "X";
            else if (board[value][0] == "O" && board[value][1] == "O" && board[value][2] == "O")
                return "O";
            else if (board[0][value] == "X" && board[1][value] == "X" && board[2][value] == "X")
                return "X";
            else if (board[0][value] == "O" && board[1][value] == "O" && board[2][value] == "O")
                return "O";
        } if(board[2][0]=="X"&&board[1][1]=="X"&&board[0][2]=="X")
            return "X";
        else if(board[2][0]=="O"&&board[1][1]=="O"&&board[0][2]=="O")
            return "O";
        return null;
    }




    public String[][] getBoard() {
        return null;
    }
}
