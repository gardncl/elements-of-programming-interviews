import java.util.List;

public class TeamPhotoDay {

    /*
    14.8

    Design an algorithm that takes as input two teams and the
    heights of the players in the teams and checks if it is
    possible to place players to take the photo subject to
    the placement constraint.
     */

    public static boolean validPlacemetnExists(Team A, Team B) {

        return false;
    }

    public static class Team {
        public List<Player> players;
    }

    public static class Player implements Comparable<Player> {
        public Integer height;

        public Player(Integer height) {
            this.height = height;
        }

        @Override
        public int compareTo(Player other) {
            return Integer.compare(height, other.height);
        }
    }
}
