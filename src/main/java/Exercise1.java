import java.io.IOException;
import java.util.function.Function;

public class Exercise1 {

    public static void main(String[] args) throws IOException {

        // Step 1: Print all items from Emitter.itemsFlux()
        // TODO: 27/11/2022 - code goes here

        // Step 2: Print all numbers from Emitter.numbersFlux()
        // TODO: 27/11/2022 - code goes here

        // Step 3: Print all integers from Emitter.intsFlux()
        Emitter.intsFlux().subscribe(System.out::println);

        // Step 4: Print all players from Emitter.playersFlux()
        // TODO: 27/11/2022 - code goes here

        // Step 5: Print all items from Emitter.itemsFlux() when item is "x" replace with "0"
        // TODO: 27/11/2022 - code goes here


        System.out.println("Press any key to quit");
        System.in.read();
    }

}
