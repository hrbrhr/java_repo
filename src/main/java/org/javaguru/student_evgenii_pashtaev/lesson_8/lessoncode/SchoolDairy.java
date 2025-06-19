package org.javaguru.student_evgenii_pashtaev.lesson_8.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class SchoolDairy {
    private List<Mark> array;

    public SchoolDairy(){
        this.array = new ArrayList<>();
    }

    void addMark(String subject, int markValue){

        Mark mark = new Mark(subject, markValue);
        array.add(mark);
    }

    public int findMaxMark(String name){
        int maxMark = 0;

        for(int i = 0; i < array.size(); i++){
            if (array.get(i).getName().equals(name) && maxMark < array.get(i).getMark() ){
                maxMark = array.get(i).getMark();
            }
        }
        return maxMark;
    }

    public int findMinMark(String name){
        int minMark = 10;

        for(int i = 0; i < array.size(); i++){
            if (array.get(i).getName().equals(name) && minMark > array.get(i).getMark() ){
                minMark = array.get(i).getMark();
            }
        }
        return minMark;
    }

    public double findMidMark(String name){
        int sumMark = 0;
        double midMark ;
        int count = 0;

        for(int i = 0; i < array.size(); i++){
            if (array.get(i).getName().equals(name)){
                sumMark += array.get(i).getMark();
                count++;
            }
        }
        midMark = sumMark / (double) count;
        return midMark;
    }
    public double findMidMarkAll(String name){
        int sumMark = 0;
        double midMark ;

        for(int i = 0; i < array.size(); i++){
                sumMark += array.get(i).getMark();
        }
        midMark = sumMark / (double) array.size();
        return midMark;
    }
}

