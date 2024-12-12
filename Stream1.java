package StreamsAPI;

import java.util.*;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(11);
        list.add(34);
        list.add(67);
        System.out.println("List is \n:");

        //Creation of Stream
        list.stream().forEach(System.out::println);

        //Creating of stream
        Stream <Integer> pricing = Stream.of(24,45,65,34,27,35);
        System.out.println("Number of elements in stream is "+pricing.count());

        list.add(7);
        // Intermediate Operations
        // Distinct
        System.out.println("Distinct elements in list is: ");
        list.stream().distinct().forEach(System.out::println);

        //limit()
        System.out.println("1st 5 elements in list: ");
        list.stream().limit(5).forEach(System.out::println);

        //skip()
        list.stream().skip(3).forEach(System.out::println);

        //Sorting
        System.out.println("Sorted list is: ");
        list.stream().sorted().forEach(System.out::println);

        //min
        System.out.println("Minimum element in given list is:");
        OptionalInt min = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).min();
        System.out.println(min);

        //max
        System.out.println("Maximum element in given list is:");
        OptionalInt max = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).max();
        System.out.println(max);

        //toArray
        System.out.println("Storing 1st 5 elements in list: ");
        Object [] o= list.stream().limit(5).toArray();
        for(Object x: o)
        {
            System.out.println(x);
        }

        //findFirst
        Optional<Integer> firstElement = Stream.of(10,23,45,65,67).findFirst();
        System.out.println(firstElement);

        //findAny
        Optional<Integer> anyElement = Stream.of(10,23,45,65,67).findAny();
        System.out.println(anyElement);

        // reduce
        int sum = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).reduce(0, Integer::sum);

        System.out.println(sum);

        //map()
        List<String> delivery = new ArrayList<>();
        delivery.add("Zepto");

        delivery.add("Blinkit");

        delivery.add("Swiggy_Instamart");

        delivery.add("Big-Basket");

        delivery.add("Amazon");

            //Returns length of each Brand name
        Object [] arr= delivery.stream().map(String::length).toArray();
        for(int i=0; i< arr.length; i++) {
            System.out.println(delivery.get(i) + "->" + arr[i]);
        }
    }
}
