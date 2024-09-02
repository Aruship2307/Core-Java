package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreations {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<100;i++) {
			list.add(i);
		}
		
		// Stream.of() to create a stream from similar type of data like for Int or Integer objects
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		
		// OR below also works fines
		
		stream = Stream.of(new Integer[]{1,2,3,4,5});
		
		// Compile time error, Type mismatch: cannot convert from Stream<int[]>
		// to Stream<Integer>
		// stream1 = Stream.of(new int[]{1,2,3,4});
		
		
		// sequential stream , to access data by stream and filtered below 10 numbers, collected in arraylist
		
		Stream<Integer> sequentialStream = list.stream();
		
		System.out.println(sequentialStream.filter(p->p<10).collect(Collectors.toList()));
		
		
		// parallel stream
		Stream<Integer> parallelStream = list.parallelStream();
		
		//System.out.println(parallelStream);
	}

}
