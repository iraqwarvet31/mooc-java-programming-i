/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justadev
 */
public class Game {
    private String homeTeam;
    private String awayTeam;
    private int homePoints;
    private int awayPoints;
    
    
    public Game (String homeTeam, String awayTeam, int homePoints, int awayPoints) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getAwayTeam() {
        return this.awayTeam;
    }
    
    public boolean winnerIs(String team) {
        if (team.equals(homeTeam) && homePoints > awayPoints) {
            return true;
        }
        
        if (team.equals(awayTeam) && awayPoints > homePoints) {
            return true;
        }
        return false;
    }
    
    
}
