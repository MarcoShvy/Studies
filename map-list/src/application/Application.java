package application;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        String path = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                String key = fields[0];
                int value = Integer.parseInt(fields[1]);
                if(map.containsKey(key)) {
                    int votes = map.get(key);
                    map.put(key, value + votes);
                }
                else {
                    map.put(key, value);
                }
                line = br.readLine();
            }

            for (String key : map.keySet()) {
                System.out.println(key + " : "+ map.get(key));
            }
        }
        catch(Exception e ) {
            System.out.println(e);
        }
    }
}
