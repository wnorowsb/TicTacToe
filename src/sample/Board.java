package sample;

public class Board {
    public int hash,winner;
    public int ended;

    public int getHash() {
        return hash;
    }

    public Board (int hash, int winner, int ended){
        this.hash = hash;
        this.winner = winner;
        this.ended = ended;
    }
}
