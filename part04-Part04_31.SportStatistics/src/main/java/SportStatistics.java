
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        // Array to hold all games
        ArrayList<Game> games = readFromFile(file);
        
        // Array to hold games played
        ArrayList<Game> gamesPlayed = new ArrayList<>();
        
        // Add all games played by team 
        for (Game game : games) {
            if (team.equals(game.getHomeTeam()) || team.equals(game.getAwayTeam())) {
                gamesPlayed.add(game);
            }
        }
        
        // Print number of total games played
        System.out.println("Games: " + gamesPlayed.size());
        
        // Calculate how many wins the team has
        int wins = 0;
        for (Game game : gamesPlayed) {
            if (game.winnerIs(team)) {
                wins++;
            }
        }
        
        // Print wins and losses
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + Math.abs(wins - gamesPlayed.size()));
    }
    
    public static ArrayList<Game> readFromFile(String fileName) {
        ArrayList<Game> games = new ArrayList<>();
        
        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                
                String line = reader.nextLine();
                String[] parts = line.split(",");
                
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);
                
                games.add(new Game(homeTeam, awayTeam, homePoints, awayPoints));
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return games;
    }

}
