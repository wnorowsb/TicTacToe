package sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AIManager {
    Map boards;
    int count;
    HashMap<Integer, Board> results;

    public AIManager(){
        boards = new HashMap<Integer,Board>();
        count = 0;
        Grid grid= new Grid(3,3);
        results = new HashMap<Integer, Board>();
        boards = generateBoards(grid, 0 ,0);



    }

    private HashMap<Integer, Board> generateBoards(Grid grid, int i, int j){
        int hash;
        for (int x=0; x<3; x++){
            grid.getCells()[i][j].setState(x);
            count++;
            System.out.println(results.size());
            grid.check();
            if (j==2){
                if(i==2){
                    hash= grid.getHash();
                    Board board = new Board (hash, grid.getWinner(),grid.isEnded());
                    results.put(hash, board);
                }
                else results.putAll(generateBoards(grid, i + 1, 0));
            }
            else results.putAll(generateBoards(grid, i , j+1));
        }
        return results;
    }

    private void InitilializeV_O(HashMap boards){




    }



}
