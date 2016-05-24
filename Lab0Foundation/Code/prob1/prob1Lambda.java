package lab0Foundation.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class prob1Lambda {
	
	public static void main(String[] args){
		BiFunction<Double, Double, List<Double>> bifunctionTest= (x,y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x,y));
			list.add(x * y);
			return list;
	  };

	  
	   System.out.println(bifunctionTest.apply(2.0,3.0).toString());
	}

}
