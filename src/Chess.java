public class Chess {

    private Cell[][] board;
    private Player[] players;
    private Player currentPlayer;

    // Pas de constructeur


    public void play() {
        while (true) {
            createPlayers();
            /*
            initialiseBoard();
            while (!isCheckMate()) {
                printBoard();
                String move;
                do {
                    move = askMove();
                }
                while (!isValideMove(move));
                updateBoard(move);
                switchPlayer();
            }*/
        }
    }

    private void createPlayers() {
        System.out.println("Création du joueur 1 : blanc");

        name, color = "5", 5;
        players["player1"] = new Player(name, 0);

        System.out.println("creation Players2");

        System.out.println("currentPlayer = Player1");
    }

    private void initialiseBoard() {
        System.out.println("creation du plateau");
    }

    private void printBoard() {
        System.out.println("Montrer plateau");
    }

    private String askMove() {
        System.out.println("choisir piece");
        System.out.println("Choisir position");
        return "A1";
    }

    private boolean isCheckMate() {
        System.out.println("T'as perdu");
        return true;
    }

    private boolean isValideMove(String move) {
        System.out.println("Mouvement possible");
        // piece.isValideMove
        return true;
    }

    private void updateBoard(String move) {
        System.out.println("Deplacement piece");
    }

    private void switchPlayer() {
        System.out.println("Changemant de player");
    }



}
