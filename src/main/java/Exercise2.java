import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Step 6: Print the value of Emitter.playerMono()
        // TODO: 27/11/2022 - code goes here

        // Step 7: Print the value of Emitter.intMono()
        // TODO: 27/11/2022 - code goes here

        // Step 8: Print the value of Emitter.neverMono(), give up after 3 seconds
        // TODO: 27/11/2022 - code goes here

        // Step 9: Print the value of Emitter.intMonoWithException, in case of exception print kokoriko
        // TODO: 27/11/2022 - code goes here

        // Step 10: Print the value of Emitter.playerMono(), in case of exception print kokoriko, when done print "Yeah!"
        Emitter.playerMono().subscribe(System.out::println,
                                    err-> System.out.println("kokoriko"),
                                    ()-> System.out.println("Yeah!!!"));


        System.out.println("Press any key to quit");
        System.in.read();
    }

}
