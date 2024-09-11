package com.jceloto7.functionalInterfaces;

import com.jceloto7.functionalInterfaces.model.Athlete;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Exercise1 {
    public static void main(String[] args) {

        List<Athlete> list = Athlete.createList();
        Predicate<Athlete> filterGrade = a-> a.getGrade()>=8;

        list.stream()
                .distinct()
                .filter(filterGrade)
                .sorted(Comparator.comparing(Athlete::getGrade).reversed())
                .forEach(System.out::println);

    }





}