package com.jceloto7;

import com.jceloto7.model.Athlete;

import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        List<Athlete> list = Athlete.createList();

        Predicate<Athlete> filterGrade = a-> a.getGrade()>=8;

        Predicate<Athlete> findAlice = a-> a.getName().equals("Alice");

        Athlete alice = list.stream()
                //.distinct()
                //.filter(filterGrade)
                .filter(findAlice)
                //.sorted(Comparator.comparing(Athlete::getGrade).reversed())
                .findFirst().orElse(null);
                //.forEach(System.out::println);

        System.out.println(alice);
    }





}