package main;

import java.util.*;
import java.util.stream.Collectors;

public class UseCase9TrainConsistMgmt {

    public static class Bogie {
        private String type;
        private int capacity;

        public Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    public static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));
    }

    public static void main(String[] args) {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("Sleeper", 72),
                new Bogie("First Class", 40)
        );

        Map<String, List<Bogie>> result = groupBogiesByType(bogies);

        result.forEach((k, v) ->
                System.out.println(k + " -> " + v.size()));
    }
}