public class Pawn {

    private Position position;
    private Integer color;

    public Pawn() {
        System.out.println("Pawn");
    }

    public boolean isValidMove(Position newPosition, Cell[][] board) {
        System.out.println("Deplacement ??");
        return false;
    }

    public String toString() {
        return "P";
    }

}
