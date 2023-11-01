package test;
import java.util.*;
import java.util.Iterator;
import java.util.List;
//import java.util.stream.Stream;
import java.util.stream.Collectors;



public class Test46 {

		
//		String s1="James";
//		StringBuilder s2=new StringBuilder("James");
//		StringBuffer s3=new StringBuffer("James");
//		System.out.println(s1==s2.toString());
//		System.out.println(s1==s3.toString());
//		 Foo f1 = (i1,i2) -> i1+i2;
//		 int i1 = 1, i2 = 2;
//		 Foo f3 = (i1,i2) -> i1*i2;
//		 System.out.println(f3.calculate(i1,i2));
//		 Stream<Integer> stream = Stream.of(77,7,57,24);
//		 int min = stream.reduce((a,b) -> a<b?a:b);
//		 stream.reduce
//		 System.out.println(min);

//		StringBuilder s2=new StringBuilder("Good Bye");
//		s2.delete(4,5);
//		System.out.println(s2);
//		System.out.println("---------------------");
//		s2.deleteCharAt(4);
//		System.out.println(s2);
		//
//		short x = 10;
//		x=x*5;
//        System.out.print(x);
		//
//		 int[]  x = {120, 200, 016};
//         for(int i = 0; i < x.length; i++){
//                  System.out.print(x[i] + "");
//         }  
		//
//		System.out.println(Math.floor(3.6));
		
//		ArrayList lst=new ArrayList();
//		lst.add(100);
//		lst.add("ram");
//		lst.add(23.4);
//		lst.add(true);
//		
//		Iterator it=lst.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		List<List<Integer>> res = new ArrayList<>();
//            List<Integer> lst = new ArrayList<>();
//            lst.add(1);lst.add(4);res.add(lst);
//            List<Integer> lst1 = new ArrayList<>();
//            lst1.add(0);lst1.add(5);res.add(lst1);
        // To sort list of list in ascending order
//           String slt="9 - 10";
//           String[] str=slt.split(" ", 2);
//           
//        	   System.out.println(str[0]);
        
//		   Integer a = new Integer (127);
//
//		   Integer b = new Integer (127);
//
//		   Integer c = 127;
//
//		   Integer d= 127;
//
//		   Integer e = new Integer (200);
//
//		   Integer f = new Integer (200);
//
//		   Integer g = 200;
//
//		   Integer h = 200;
//
//		   System.out.println( (a == b) + " " + (c == d) + " " + (e == f) + " " + (g == h));
		   

	
		
	
		public static void main(String []args) throws InterruptedException{
			List <int>lst=Arrays.asList(2,3,4,6,1);
		    List<Integer> res=lst.stream().filter(x -> x%2==0).collect(Collectors.toList());
		    System.out.println(res);
			 
			
		}
}

