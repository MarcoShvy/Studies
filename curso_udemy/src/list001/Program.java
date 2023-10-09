package list001;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Duda");
        list.add("Maria");
        list.add("Marcolino");
        list.add("Sousa");
        list.add(2, "Marco");
        list.remove("Marcolino");

        System.out.println(list.size());
        list.removeIf(x -> x.charAt(0) == 'S');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("index of duda = "+ list.indexOf("Duda"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
    }
}
