package com.jceloto7.functionalInterfaces;

import com.jceloto7.functionalInterfaces.model.Athlete;

import java.util.List;
import java.util.function.Predicate;

public class Exercise2 {
    public static void main(String[] args) {

        List<Athlete> list = Athlete.createList();
        Predicate<Athlete> findAlice = a-> a.getName().equals("Alice");

        Athlete alice = list.stream()
                .filter(findAlice)
                .findFirst().orElse(null);
        System.out.println(alice);
    }





}