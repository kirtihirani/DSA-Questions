package java8Features;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Features {
    public static void main(String[] args){
        Integer[] arr = {5,2,7,4,3,1,10,8};

        //without lambda function
        Arrays.sort(arr, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });
        System.out.println(Arrays.toString(arr));

        //with lambda function(java 8 new feature)
        Arrays.sort(arr, (a,b)-> b-a);
        System.out.println(Arrays.toString(arr));


        // Stream API (java 8 new feature)
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> doubledEvenNumbers = numbers.stream().filter(n-> n%2==0).map(n-> n*2).collect(Collectors.toList());
        System.out.println("doubled even number list: "+ doubledEvenNumbers );

        //local variable type inference(>=java10 feature) where your can declare a variable using "var"

        var word = "Hello";
        var num = 23;
        var lst = List.of(1,2,3,4,5);
        System.out.println(word+" "+num+" "+lst);

        //text blocks (>=java15)
        var sentence = """
                Hi, how are you ?
                Nice to meet you.
                """;
        System.out.println(sentence);

        //Extended switch statements (>=java 14)
        int dayOfWeek = 3;
        String dayType = switch(dayOfWeek){
            case 1 ,2 ,3 ,4 ,5 -> "Weekday";
            case 6, 7-> "weekend";
            default ->  "invalid";
        };
        System.out.println(dayType);
    }


}
