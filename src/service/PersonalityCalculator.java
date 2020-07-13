package service;

public class PersonalityCalculator{
	public String findYourBrainType(String options) {
		int[] array=findAnswers(options);
		int a=0,b=0,x=0;
		a=array[0]+array[1]+array[2]+array[4]+array[7]+array[9]+array[10]+array[11]+array[13]+array[17]+array[19];
		b=array[3]+array[5]+array[6]+array[8]+array[12]+array[14]+array[15]+array[16]+array[18];
		x=66-a+b;
		if(x>=20&&x<=55) {
			return "leftbrained";
		}
		else if(x>=56&&x<=64) {
			return "noclearpreference";
		}
		else if(x>=65&&x<=100){
			return "rightbrained";
		}
		else
			return "false";
		
	}
	public int[] findAnswers(String options){
		String[] str=options.split(",");
		int[] array=new int[str.length];
		for(int i=0;i<array.length;i++) {
			array[i]=Integer.parseInt(str[i]);
		}
		return array;
	}
}