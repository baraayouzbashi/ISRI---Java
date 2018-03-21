package isri;

import java.util.ArrayList;

public class Demo  {

	public static void main(String[] args)  {
		ISRI s = new ISRI();

		String str = "يأكلون";
		System.out.println(s.stem(str)+" is the stem of "+str);
		ArrayList<String> sentence = new ArrayList<>();
		sentence.add("أنتم");
		sentence.add("تعرفون");
		sentence.add("واجباتكم");
		sentence.add("و");
		sentence.add("هم");
		sentence.add("يعرفون");
		sentence.add("واجباتهم");
		sentence.add("ايضا");
		System.out.println(s.stem(sentence));
		

	}

}
