import reactor.core.publisher.Flux;

import java.io.IOException;
import java.util.List;

/**
 * Created by kobis on 03 Aug, 2022
 */
public class Test {

    public static void main(String[] args) throws IOException {

        List<String> dataSource = List.of("1", "x", "2", "x", "3", "x");
        Flux<String> reactiveDataSource = Flux.just("1", "x", "2", "x", "3", "x");

        reactiveDataSource.map(str -> str.equals("x") ? "0" : str).subscribe(System.out::println);


        System.out.println("press any key to quit");
        System.in.read();
    }
}
