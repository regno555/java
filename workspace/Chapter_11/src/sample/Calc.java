package sample;

import java.util.Arrays;

public class Calc {
	public static double sum(double a, double b, double c){
		return a + b + c;
	}

	public static double sum(double... data){
		double total = 0;
		for(double v : data){
			total += v;
		}
		return total;
	}
	
	public static double ave(double... data){
		double average = 0;
		for(double v : data){
			average += v;
		}
		average = average / data.length;
		return average;
	}
	
	public static double max(double... data){
		//double maxValue = 0;
		Arrays.sort(data);
		return data[data.length - 1];
	}
}
