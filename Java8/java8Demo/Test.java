package java8Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Test{
	
	public static void main(String args[]) {
		
		/*
		 * List<String> notes = new ArrayList<>(); notes.add("note1");
		 * notes.add("note2"); notes.add("note3"); notes.add("note4");
		 * notes.add("note5");
		 * 
		 * //Using lambda expression //Output : note1,note2,note3,note4,note5
		 * notes.forEach(note->System.out.println(note));
		 */
		
		/*
		 * List<Notes> notes = new ArrayList<Notes>();
		 * 
		 * notes.add(new Notes(1,"rav","mhs")); notes.add(new Notes(3,"ravi","mhsss"));
		 * notes.add(new Notes(7,"srav","ssmhs")); notes.add(new
		 * Notes(4,"brav","zmhs"));
		 * 
		 * 
		 * notes.sort((n1,n2)->n1.getId()-n2.getId());
		 * 
		 * notes.forEach((note)->System.out.println(note));
		 */
		
		List<String> strings =  Arrays.asList("wer","rews","qdd","wdede","qdqq");
		
		System.out.println(strings.stream().map(String::toUpperCase).collect(Collectors.toList()));
	}
}


