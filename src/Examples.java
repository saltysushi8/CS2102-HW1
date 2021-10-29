import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

    SoccerTeam soccerTeamCheck = new SoccerTeam("WPI", "maroon", false, 4, 6);
    SoccerTeam soccerTeamCheck1 = new SoccerTeam("RPI", "red", true, 2, 8);
    LegoRobotTeam robotsTeamCheck = new LegoRobotTeam("WPI","goat cheese", 7);
    LegoRobotTeam robotsTeamCheck1 = new LegoRobotTeam("RPI", "renselpolytechnitute", 4);
    SoccerResult soccerResultCheck = new SoccerResult(soccerTeamCheck,
            soccerTeamCheck1, 10.5,15.2);
    LegoRobotResult robotsResultCheck = new LegoRobotResult(robotsTeamCheck,
            robotsTeamCheck1, 3.1, 5, true, 3.2, 2, false);
    Match soccerMatchCheck = new Match(soccerTeamCheck, soccerTeamCheck, soccerResultCheck);
    Match robotsMatchCheck = new Match(robotsTeamCheck, robotsTeamCheck, robotsResultCheck);

    @Test
    public void getSoccerWinner() {
        assertEquals(soccerResultCheck.getWinner(), soccerTeamCheck1);
    }
    @Test
    public void getRobotWinner() {
        assertEquals(robotsResultCheck.getWinner(), robotsTeamCheck1);
    }

}
