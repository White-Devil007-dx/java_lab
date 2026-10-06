import java.util.*;

class Player {
    private String name;
    private int jerseyNumber;
    private int matchesPlayed;
    private int runsScored;

    public Player(String name, int jerseyNumber, int matchesPlayed, int runsScored) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    public double calculateAverage() {
        if (matchesPlayed == 0) return 0.0;
        return (double) runsScored / matchesPlayed;
    }

    public String getName() { return name; }
    public int getJerseyNumber() { return jerseyNumber; }
    public int getMatchesPlayed() { return matchesPlayed; }
    public int getRunsScored() { return runsScored; }
}

public class Sports9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        Player[] team = new Player[n];

        // Input players
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Player " + (i+1));
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Jersey Number: ");
            int jersey = sc.nextInt();
            System.out.print("Matches Played: ");
            int matches = sc.nextInt();
            System.out.print("Runs Scored: ");
            int runs = sc.nextInt();

            team[i] = new Player(name, jersey, matches, runs);
        }

        // Manual sorting by batting average (descending)
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (team[i].calculateAverage() < team[j].calculateAverage()) {
                    Player temp = team[i];
                    team[i] = team[j];
                    team[j] = temp;
                }
            }
        }

        // Display roster
        System.out.println("\nTeam Roster (sorted by batting average):");
        for (Player p : team) {
            System.out.printf("Name: %s | Jersey: %d | Matches: %d | Runs: %d | Avg: %.2f%n",
                              p.getName(), p.getJerseyNumber(), p.getMatchesPlayed(),
                              p.getRunsScored(), p.calculateAverage());
        }

        sc.close();
    }
}
