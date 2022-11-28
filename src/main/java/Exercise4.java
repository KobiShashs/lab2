import reactor.core.publisher.Flux;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;

public class Exercise4 {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {

        // Step 16: Print all lines from Emitter.lineFlux()
        // TODO: 27/11/2022 - code goes here

        // Step 17: Print all lines from Emitter.lineFlux(), skip the 3 first lines
        // TODO: 27/11/2022 - code goes here

        // Step 18: Print all lines from Emitter.lineFlux() which contains the word "with"
        Emitter.lineFlux().filter(line->line.getContent().contains("with")).subscribe(line-> System.out.println(line));


        // Step 19: Print all lines from Emitter.lineFlux() when line contains at least 12 words
        // TODO: 27/11/2022 - code goes here

        // Step 20: Print all lines which contains "and", with more then 12 words
        // TODO: 27/11/2022 - code goes here

        System.out.println("Press any key to quit");
        System.in.read();
    }

}
