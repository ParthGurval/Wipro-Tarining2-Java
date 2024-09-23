package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {


		List<Integer>  list = new ArrayList<Integer>();
		
			list.add(20);
			list.add(50);
			list.add(30);
			list.add(10);
			list.add(70);
			
			
				Stream<Integer> stream1 =	list.stream();
			
		
		stream1.forEach( (Integer num)->{ System.out.println(num);}  );
		
	
		Stream<Integer> stream2 =	list.stream();
		
		
		System.out.println("filter and print");
		
			stream2.filter( (Integer num)->{  return  num > 30;} )
			       .forEach((Integer num)->{ System.out.println(num);});
					
		
		
		
	}

}
