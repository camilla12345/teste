package BoardName;

import java.util.Objects;

public class Position {

    private int row;
    private int column;

    public Position(){

    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return row + ", " + column;
    }
}
