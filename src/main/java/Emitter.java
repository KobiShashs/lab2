import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;


public class Emitter {

    public static Flux<Player> playersFlux() {
        return Flux.just(
                new Player(1, "Lionel", "Messi"),
                new Player(2, "Cristiano", "Ronaldo"),
                new Player(3, "Diego", "Maradona"),
                new Player(4, "Zinedine", "Zidane"),
                new Player(5, "Jürgen", "Klinsmann"),
                new Player(6, "Gareth", "Bale")
        ).delayElements(Duration.ofSeconds(1));
    }

    public static Flux<Score> scoreFlux() {
        return Flux.just(
                new Score(1, 790),
                new Score(2, 800),
                new Score(3, 650),
                new Score(4, 469),
                new Score(5, 538),
                new Score(6, 263)).delayElements(Duration.ofSeconds(2));
    }

    public static Flux<String> itemsFlux() {
        return Flux.just("1", "x", "2", "x", "3", "x")
                .delayElements(Duration.ofMillis(1000));
    }

    public static Flux<String> numbersFlux() {
        return Flux.just("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
                .delayElements(Duration.ofSeconds(1));
    }

    public static Flux<Integer> intsFlux() {
        return Flux
                .range(1, 10)
                .delayElements(Duration.ofSeconds(3));
    }

    public static Flux<Integer> intsFluxWithException() {
        return Flux
                .range(1, 10)
                .delayElements(Duration.ofSeconds(1))
                .map(e -> {
                    if (e == 5) throw new RuntimeException("An error happened in the flux");
                    return e;
                });
    }

    public static Mono<Integer> intMonoWithException() {
        return Mono.error(RuntimeException::new);
    }

    public static Mono<Integer> intMono() {
        return Mono.just(17)
                .delayElement(Duration.ofSeconds(1));
    }

    public static Mono<Player> playerMono() {
        return Mono.just(
                new Player(1, "Lionel", "Messi")
        ).delayElement(Duration.ofSeconds(1));

    }

    public static Flux<String> neverFlux() {
        return Flux.never();
    }

    public static Mono<String> neverMono() {
        return Mono.never();
    }

    public static Flux<Integer> intsFluxRepeat() {
        return Flux
                .just(17, 6, 2, 17, 1, 3, 6, 4, 5, 1, 2, 6, 5)
                .delayElements(Duration.ofSeconds(1));
    }

    public static Flux<Integer> intsFluxSpecial() {
        return Flux
                .just(50, 30, 40, 40, 10, 70, 15, 65, 17)
                .delayElements(Duration.ofSeconds(1));
    }

    public static Flux<Line> lineFlux() {
        return Flux
                .just(new Line(1, "In a hole in the ground there lived a hobbit Not a nasty dirty wet"),
                        new Line(2, "hole filled with the ends of worms and an oozy smell nor yet a dry bare"),
                        new Line(3, "sandy hole with nothing in it to sit down on or to eat it was a hobbithole"),
                        new Line(4, "and that means comfort"),
                        new Line(5, "It had a perfectly round door like a porthole painted green with a"),
                        new Line(6, "shiny yellow brass knob in the exact middle The door opened on to a"),
                        new Line(7, "tubeshaped hall like a tunnel a very comfortable tunnel without smoke"),
                        new Line(8, "with panelled walls and floors tiled and carpeted provided with polished"),
                        new Line(9, "chairs and lots and lots of pegs for hats and coats  the hobbit was fond"),
                        new Line(10, "of visitors The tunnel wound on and on going fairly but not quite straight"))
                .delayElements(Duration.ofSeconds(1));
    }
}
