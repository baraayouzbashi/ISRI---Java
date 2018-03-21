# ISRI-Java
Arabic NLP ISRI Stemmer implementation in Java

implementation and comments are inspired by [nltk's Python version of the stemmer](http://www.nltk.org/_modules/nltk/stem/isri.html)

## input
`String` or `ArrayList <String>` representing a word or a tokenized sentence, respectively.

## returns
`String` or `ArrayList <String>` representing the Stemmed word or sentence.

## Example
```Java
      ISRI s = new ISRI();
		String str = "يأكلون";
		System.out.println(s.stem(str)+" is the stem of "+str);
    
```
output : أكل is the stem of يأكلون
    
 ```Java
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
 ```
 output : [نتم, عرف, وجب, و, هم, عرف, وجب, ايض]
