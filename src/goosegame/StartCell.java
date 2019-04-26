package goosegame;

public class StartCell implements Cell{
    private int index;
    private Player player;
    public int getIndex() {
        return this.index;
    }

    public Player getPlayer() {
        return this.player;
    }
    public int action(){
        return 0;
    }

    public boolean canleave() {
        return false;
    }
}