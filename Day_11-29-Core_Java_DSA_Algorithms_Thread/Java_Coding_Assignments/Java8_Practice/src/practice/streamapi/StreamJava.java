package practice.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamJava {

	public static void main(String[] args) {
		
		System.out.println("Stream from Array:");

        Integer[] array = {20, 50, 30, 10, 70};

        // Here i have Created a stream from the array and it print each element
        Stream<Integer> streamFromArray = Stream.of(array);
        
        streamFromArray.forEach(num -> System.out.println(num));

        
        // this if for Filter elements greater than 30 and print
        System.out.println("\nFilter and Print number Greater than 30 from Array:");
        
        Stream<Integer> filteredStreamFromArray = Stream.of(array);
        
        filteredStreamFromArray.filter(num -> num > 30).forEach(num -> System.out.println(num)); //This is

        
        //This is for Map each number to its square and print
        System.out.println("\nMap and Print (Squares) from Array:");
        
        Stream<Integer> squaredStreamFromArray = Stream.of(array);
        
        squaredStreamFromArray.map(num -> num * num).forEach(num -> System.out.println(num));

        
        //This is to Reduce the array to find the sum of all elements
        System.out.println("\nReduce to Sum from Array:");
        
        Stream<Integer> sumStreamFromArray = Stream.of(array);
        
        int sum = sumStreamFromArray.reduce(0, (a, b) -> a + b);
        
        System.out.println("Sum: " + sum);
        
        System.out.println("---------------------------------------------------------------------------------------------------------");
        
        System.out.println("\nStream from List:");
        
		List<Integer>  list = new ArrayList<Integer>();
		
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);
		list.add(70);
		
		
			Stream<Integer> stream1 =	list.stream();
		
	
			stream1.forEach( (Integer num)->{ System.out.println(num);}  );
	

			Stream<Integer> stream2 =	list.stream();
	
	
			System.out.println("\nfilter and print");
	
			stream2.filter( (Integer num)->{  return  num > 30;} ).forEach((Integer num)->{ System.out.println(num);});
			
		System.out.println("---------------------------------------------------------------------------------------------------------");
	        
	    System.out.println("\nStream from String:");
	    
	    String text = "Hello World! Stream API in Java.";

        //Here we Convert the string to a stream of characters and print each character
        text.chars()  // here we Creates an IntStream of ASCII values
            .mapToObj(c -> (char) c)  //here we Converts int to Character
            .forEach(ch -> System.out.print(ch + " "));

        //Here we Convert the string to lowercase and print
        System.out.println("\n\nConvert to Lowercase:");
        Stream<String> lowerCaseStream = Stream.of(text.toLowerCase());
        lowerCaseStream.forEach(System.out::println);

        //Here we Convert the string to uppercase and print
        System.out.println("\nConvert to Uppercase:");
        Stream<String> upperCaseStream = Stream.of(text.toUpperCase());
        upperCaseStream.forEach(System.out::println);

        //Here we Split the string into words, map each word to its length, and print
        System.out.println("\nWord Lengths:");
        Stream<String> wordLengthStream = Stream.of(text.split("\\s+")); // Split by spaces
        wordLengthStream.map(word -> word.length()).forEach(length -> System.out.println(length));
	}
}
