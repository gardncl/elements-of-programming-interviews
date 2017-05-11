import java.util.List;

public class TeamPhotoDay {

    /*
    14.8
    */

    public static boolean validPlacementExists(Team A, Team B) {

        return false;
    }

    public static class Team {
        public List<Player> players;

        public Team(List<Player> players) {
            this.players = players;
        }
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Player player = (Player) o;

            if (height != null ? !height.equals(player.height) : player.height != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return height != null ? height.hashCode() : 0;
        }
    }
}
