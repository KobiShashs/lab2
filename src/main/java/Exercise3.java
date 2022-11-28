import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

    public static void main(String[] args) throws IOException {


        // Step 11: Print from Emitter.playersFlux() the relevant Score from Emitter.scoreFlux(),print err when thrown, print "done" when finish
        // TODO: 27/11/2022 - code goes here

        // Step 12: Print from Emitter.playersFlux() the max numOfGoals Score from Emitter.scoreFlux()
        // TODO: 27/11/2022 - code goes here

        // Step 13: Print from Emitter.playersFlux() the min numOfGoals Score from Emitter.scoreFlux()
        // TODO: 27/11/2022 - code goes here

        // Step 14: Print only distinct numbers from Emitter.intsFluxRepeat();
        Emitter.intsFluxRepeat().distinct().subscribe(num-> System.out.println(num));

        // Step 15: Print only numbers greater then 50 from Emitter.intsFluxRepeat() ,if there are not numbers over 50 then return -1
        // TODO: 27/11/2022 - code goes here


        System.out.println("Press any key to quit");
        System.in.read();
    }

}
