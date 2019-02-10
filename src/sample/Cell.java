package sample;

public class Cell {
    private int x,y,state;
    public Cell (int x, int y){
        this.x=x;
        this.y=y;
        state=0;

    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }


}

