import java.util.ArrayList;
import java.util.Scanner;

public class PlayerSelection {
    private ArrayList<Player> mPlayers;
    private Scanner mScanner = new Scanner(System.in);

    public void PrintMenu() {
        System.out.println("Commands:");
        System.out.println("    A   -   Add player.");
        System.out.println("    B   -   Display two best batmans.");
        System.out.println("    C   -   Display two best bowlers.");
        System.out.println("    D   -   Display the best keeper.");
        System.out.println("    V   -   View all players.");
        System.out.println();
    }

    public void AddPlayer() {
        System.out.print("Enter player name: ");
        String name = mScanner.nextLine();

        System.out.print("Enter the number of years the players have played: ");
        int years = Integer.parseInt(mScanner.nextLine());

        System.out.print("Enter the player's type (batting, bowling, keeping): ");
        String type = mScanner.nextLine();
        Player.Type pType;

        {
            if (type.equalsIgnoreCase("batting"))
                pType = Player.Type.BATTING;
            else if (type.equalsIgnoreCase("bowling"))
                pType = Player.Type.BOWLING;
            else
                pType = Player.Type.KEEPING;
        }

        System.out.print("Enter player's statistics: ");
        double stat = Double.parseDouble(mScanner.nextLine());

        System.out.print("Enter player rating: ");
        int rating = Integer.parseInt(mScanner.nextLine());

        mPlayers.add(new Player(name, pType, years, stat, rating));
    }

    public void ShowAllPlayers() {
        for (Player iterator : mPlayers) {
            System.out.println(iterator);
        }
    }

    public void BestBatsmans() {
        Player[] players = { new Player(), new Player() };

        int counter = 1;
        for (Player player : mPlayers) {
            if (player.getType() == Player.Type.BATTING) {
                if (counter < 0)
                    return;

                players[counter] = player;
                counter--;
            }
        }
    }


    public void BestBowlers() {
        Player[] players = { new Player(), new Player() };

        int counter = 1;
        for (Player player : mPlayers) {
            if (player.getType() == Player.Type.BOWLING) {
                if (counter < 0)
                    return;

                players[counter] = player;
                counter--;
            }
        }
    }

    /**
     * Iterate and find the best keeper.
     */
    public void BestKeeper() {
        Player[] players = { new Player(), new Player() };

        int counter = 1;
        for (Player player : mPlayers) {
            if (player.getType() == Player.Type.KEEPING) {
                if (counter < 0)
                    return;

                players[counter] = player;
                counter--;
            }
        }
    }
}