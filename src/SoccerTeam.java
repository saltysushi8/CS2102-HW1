public class SoccerTeam implements IContestant {

    String country;
    String jerseyColour;
    boolean ritual;
    int wins;
    int losses;

    public SoccerTeam(String country, String jerseyColour, boolean ritual, int wins, int losses) {
        this.country = country;
        this.jerseyColour = jerseyColour;
        this.ritual = ritual;
        this.wins = wins;
        this.losses = losses;
    }
}
