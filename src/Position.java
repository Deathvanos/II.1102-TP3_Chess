public class Position {

    private char column;
    private int row;

    public Position(char column, int row) {
        this.column = column;
        this.row = row;
    }

    public String toString() {
        return "" + this.column + this.row;

    }
}
