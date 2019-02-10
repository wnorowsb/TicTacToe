package sample;

public class Grid {

    Cell[][] cells;
    int ended;
    int winner;
    public int getSize() {
        return size;
    }



    private int size,condition;
    public Grid (int size,int condition){
        this.size=size;
        this.condition=condition;

        cells = new Cell[size][size];

        for (int i=0; i<size; i++){
            for(int j=0; j<size; j++)
                cells[i][j]= new Cell(i,j);
        }
    }

    public void check(){

        int current = 0;
        int count = 0;
        for (int i=0; i<size; i++){
            current = 0;
            count = 0;
            for(int j=0; j<size; j++){
                if(cells[i][j].getState()== current && cells[i][j].getState()!=0)
                    count++;
                if(cells[i][j].getState()!= current && cells[i][j].getState()!=0)
                    count=1;
                if(cells[i][j].getState()!= current && cells[i][j].getState()==0)
                    count=0;
                if(count == condition){ System.out.println("Gra zakończona");
                    ended = 1;
                    winner = current;
                }
                current = cells[i][j].getState();
            }
        }

        for (int i=0; i<size; i++){
            current = 0;
            count = 0;
            for(int j=0; j<size; j++){
                if(cells[j][i].getState()== current && cells[j][i].getState()!=0)
                    count++;
                if(cells[j][i].getState()!= current && cells[j][i].getState()!=0)
                    count=1;
                if(cells[j][i].getState()!= current && cells[j][i].getState()==0)
                    count=0;
                if(count == condition){ System.out.println("Gra zakończona");
                    ended = 1;
                    winner = current;
                }
                current = cells[j][i].getState();
            }
        }

        for (int i=0; i<size; i++){
            current = 0;
            count = 0;
            for(int j=0; j+i<size; j++){
                if(cells[j][i+j].getState()== current && cells[j][i+j].getState()!=0)
                    count++;
                if(cells[j][i+j].getState()!= current && cells[j][i+j].getState()!=0)
                    count=1;
                if(cells[j][i+j].getState()== current && cells[j][i+j].getState()==0)
                    count=0;
                if(count == condition){ System.out.println("Gra zakończona");
                    ended = 1;
                    winner = current;
                }
                current = cells[j][i+j].getState();
            }
        }

        for (int i=1; i<size; i++){
            current = 0;
            count = 0;
            for(int j=0; j+i<size; j++){
                if(cells[j+i][j].getState()== current && cells[j+i][j].getState()!=0)
                    count++;
                if(cells[j+i][j].getState()!= current && cells[j+i][j].getState()!=0)
                    count=1;
                if(cells[j+i][j].getState()== current && cells[j+i][j].getState()==0)
                    count=0;
                if(count == condition){ System.out.println("Gra zakończona");
                    ended = 1;
                    winner = current;
                }
                current = cells[j+i][j].getState();
            }
        }

        for (int i=1; i<size; i++){
            current = 0;
            count = 0;
            for(int j=i; j>=0; j--){
                if(cells[i-j][j].getState()== current && cells[i-j][j].getState()!=0)
                    count++;
                if(cells[i-j][j].getState()!= current && cells[i-j][j].getState()!=0)
                    count=1;
                if(cells[i-j][j].getState()== current && cells[i-j][j].getState()==0)
                    count=0;

                if(count == condition){ System.out.println("Gra zakończona");
                    ended = 1;
                    winner = current;
                }
                current = cells[i-j][j].getState();
            }
        }

        for (int i=0; i<size; i++){
            current = 0;
            count = 0;
            for(int j=i; j>=0; j--){
                if(cells[j][i-j].getState()== current && cells[j][i-j].getState()!=0)
                    count++;
                if(cells[j][i-j].getState()!= current && cells[j][i-j].getState()!=0)
                    count=1;
                if(cells[j][i-j].getState()== current && cells[j][i-j].getState()==0)
                    count=0;

                if(count == condition){ System.out.println("Gra zakończona");
                    ended = 1;
                    winner = current;
                }
                current = cells[j][i-j].getState();
            }
        }


    }


    public Cell[][] getCells() {
        return cells;
    }

    public int getHash(){
        int hash=0;
        int k=1;
        for (int i=0; i<size; i++){
            for(int j=0; j<size; j++) {
                hash += cells[i][j].getState() * k;
                k*=3;
            }
        }
        return hash;
    }

    public int isEnded() {
        return ended;
    }

    public int getWinner() {
        return winner;
    }
}
