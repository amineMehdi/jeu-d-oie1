package goosegame;

public abstract class Board{
    public final int  nbOfCells;
    public Cell[] theCells;

    abstract void initBoard();

    public Board(int nbOfCells){
        this.nbOfCells = nbOfCells;
        this.theCells = new Cell[nbOfCells + 1];
        this.initBoard();
        this.theCells[0] = new StartCell();
    }
    public Cell getCell(int index){
        return theCells[index];
    }
    public  int getNbOfCells(){
        return this.nbOfCells;
    }
}

