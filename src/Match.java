import java.util.function.IntConsumer;

public class Match{

    IContestant contestant1;
    IContestant contestant2;
    IResult results;

    public Match(IContestant contestant1, IContestant contestant2, IResult results){

        this.contestant1 = contestant1;
        this.contestant2 = contestant2;
        this.results = results;

    }

    public IContestant winner(){
        if (results.isValid()){
            return results.getWinner();
        }
        else {
            return null;
        }

    }
}
