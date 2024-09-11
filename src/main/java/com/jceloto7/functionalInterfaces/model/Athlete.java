package com.jceloto7.functionalInterfaces.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class AthleteReview {

    private int id;
    private String name;
    private double grade;

    public Athlete(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public static List<Athlete> createList(){
        List<Athlete> list = new LinkedList<>();
        list.add(new Athlete(1, "Adryen", 9.5));
        list.add(new Athlete(2, "Jessica", 10d));
        list.add(new Athlete(3, "Minerva", 9.5));
        list.add(new Athlete(4, "Ana", 8.5));
        list.add(new Athlete(5, "Maria", 8.5));
        list.add(new Athlete(6, "Guts", 9d));
        list.add(new Athlete(7, "Gustavo", 7d));
        list.add(new Athlete(8, "Romanov", 9.5));
        list.add(new Athlete(9, "Cuieio", 4d));
        list.add(new Athlete(10, "Marcos", 4d));
        list.add(new Athlete(11, "Batman", 8d));
        list.add(new Athlete(12, "Astrid", 7d));
        list.add(new Athlete(13, "Giovanna", 7.5));
        list.add(new Athlete(14, "Alice", 7.5));
        list.add(new Athlete(15, "Esmeralda", 9d));
        list.add(new Athlete(16, "Martin", 9d));
        list.add(new Athlete(17, "Seraphine", 7d));
        list.add(new Athlete(18, "Kayla", 6d));
        list.add(new Athlete(19, "Truman", 6.5));
        list.add(new Athlete(20, "Spartakus", 8d));
        list.add(new Athlete(20, "Spartakus", 10d ));
        list.add(new Athlete(21, "Byonetta", 7.5));

        return list;
    }

    @Override
    public String toString(){
        return "Id:" + id +" " + "Name:" + name + " " + "Grade:" + grade + "\n";
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof  Athlete a){
            return this.id == a.getId() && this.name.equals(a.getName());
        }else{
            return false;
        }

    }

    @Override
    public int hashCode(){
        return Objects.hash(id,name);
    }


}
