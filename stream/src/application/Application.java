package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10 ,7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<Integer> st2 = Stream.iterate(0, x -> x +2);
        System.out.println(Arrays.toString(st2.limit(10).toArray()));

        Stream<String> st3 = Stream.of("Duda", "Vitor", "Wender");
        System.out.println(Arrays.toString(st3.toArray()));

        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L},p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}
