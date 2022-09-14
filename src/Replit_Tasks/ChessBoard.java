package Replit_Tasks;
import java.util.*;
public class ChessBoard {
        public static void main(String[] args) {


                String[][] chessBoard = new String[8][8];
                //WRITE YOUR CODE HERE

                for (int i=0, num=1; i<8; i++, num++){
                    for (int j=0, ch='a'; j<8; j++, ch++){
                        chessBoard[i][j] = ""+num+(char)ch;
                    }
                }
                //DO NOT CHANGE
                System.out.println(Arrays.deepToString(chessBoard));

        }
    }

