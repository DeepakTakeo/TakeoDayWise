package com.takeo.week3.day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListImp {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(8);  //0 //int  //Integer //call //autoboxing
        intList.add(9);  //1
        intList.add(10); //2
        intList.add(11); //3
        intList.add(0,67);
        intList.remove(3);  // 67,8,9,11  ordered  // can contain duplicates

        System.out.println(intList.size());

        System.out.println(intList); //output 8,9,10,11  // address

         List<Employee> empList = new ArrayList<>();
         empList.add(new Employee("name",20,"address"));
         empList.add(new Employee("name1",35,"Address1"));
         empList.add(new Employee("name2",30,"Address2"));
         empList.add(new Employee("name3",29,"Address3"));
         empList.add(new Employee("name4",39,"Address4"));
         System.out.println(empList);

         for(Employee emp : empList){
             if(emp.getAge() > 30 && (emp.getName().contains("1") || emp.getName().contains("2"))){
                 System.out.println(emp.getName()); //name 1 and name 4  // name contain digit 1 or 2
             }
         }


         // iteration

         //for each ,simple for loop

         /*for(int i = 0;i<intList.size();i++){
             System.out.println(intList.get(i));
         }*/

        /*for(Integer element : intList){
            System.out.println(element);
        }*/

        // java 8  ,Streams in Java 8/operations   - Group A prepare this topic
        //intList.forEach(System.out::println);

        Iterator<Integer> iterator = intList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }





        // loop?



    }
}
