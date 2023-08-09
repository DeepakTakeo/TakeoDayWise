package com.takeo.week4.day1;

import com.takeo.week3.day5.Employee;

import java.util.*;

public class ListInAction {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.remove(2);

        List<Integer> list = new ArrayList<>();  //capacity 10
        list.add(10);
        list.add(20);

        List<Integer> list2 = new ArrayList<>();
        list.add(3);
        list.add(4);

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list);
        list3.addAll(list2);

        list.get(4);
        list.add(0,39);

        System.out.println(list3);

        //sort
        Collections.sort(list3);

        System.out.println(list3);

        //reverse order
        Collections.sort(list3,Collections.reverseOrder());

        System.out.println(list3);


        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student(1,20,"Test1"));
        listStudent.add(new Student(2,18,"Test2"));
        listStudent.add(new Student(3,15,"Test3"));
        listStudent.add(new Student(4,16,"Test4"));

        for(Student stu : listStudent){
            System.out.println(stu.getAge());
        }

        System.out.println("Sorted List");
        //Collections.sort(listStudent);

        int size = listStudent.size();

        Collections.sort(listStudent, new AgeComparator());

        for(Student stu : listStudent){
            System.out.println(stu.getAge());
        }




    }



}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(),s2.getAge());
    }
}
