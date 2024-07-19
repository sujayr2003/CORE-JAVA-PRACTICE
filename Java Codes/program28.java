
public class program28 {
     public static void main(String args[]){
    String str = "Hello World";
    //String Methods in Java
    System.out.println(str.length());
    System.out.println(str.charAt(6));
    System.out.println(str.substring(6));
    System.out.println(str.substring(0,5));
    System.out.println(str.indexOf('o'));
    System.out.println(str.lastIndexOf('o'));
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.trim());
    System.out.println(str.replace("Hello","Hi"));
    System.out.println(str.concat(" Java"));
    System.out.println(str.startsWith("Hello"));
    System.out.println(str.endsWith("World"));
    System.out.println(str.contains("Hello"));
    System.out.println(str.equals("Hello World"));
    System.out.println(str.equalsIgnoreCase("hello world"));
    System.out.println(str.compareTo("Hello World"));
    System.out.println(str.compareToIgnoreCase("hello world"));
    System.out.println(str.toCharArray());
    System.out.println(str.toCharArray().length);
    System.out.println(str.getBytes());
    System.out.println(str.getBytes().length);
    System.out.println("-----------------------------------------------------------------------------------");
    //Additional String Methods
    String str2 = "Java is a programming language";
    System.out.println(str2.isEmpty());
    System.out.println(str2.isBlank());
    System.out.println(str2.codePointAt(6));
    System.out.println(str2.codePointBefore(6));
    System.out.println(str2.codePointCount(0,5));
    System.out.println(str2.contains("Hello"));
    System.out.println(str2.contentEquals("Hello World"));
    System.out.println(str2.subSequence(0,5));
    String numbers = String.join(" < ", "Four", "Five", "Six", "Seven"); 
    System.out.println(numbers);
    String[] arr = str2.split(" ",5);
    for(String a:arr){
      System.out.println(a);
    }
    
    //Regular Expressions Functions in Java
    String str3="Kotlin and Java are good programming languages";
    System.out.println(str3.matches("(.*)Java(.*)"));
    System.out.println(str3.replaceAll("Java","Python"));
    System.out.println(str3.replaceFirst("Java","Python"));
    System.out.println(str3.split("and")[0]);

    //Java regex character classes
    String str4="Ronaldo has 5 ucls @ 70% under 4.";//description
    System.out.println(str4.matches("(.*)\\d(.*)"));// \\d- digit
    System.out.println(str4.matches("(.*)\\D(.*)"));// \\D- non-digit
    System.out.println(str4.matches("(.*)\\s(.*)"));// \\s- whitespace  
    System.out.println(str4.matches("(.*)\\S(.*)"));// \\S- non-whitespace
    System.out.println(str4.matches("(.*)\\w(.*)"));// \\w- word
    System.out.println(str4.matches("(.*)\\W(.*)"));//  \\W- non-word
    System.out.println(str4.matches("(.*)\\d{1,2}(.*)"));// \\d{1,2}- digit with 1 or 2 digits
    System.out.println(str4.matches("(.*)\\d{1,}(.*)"));//  \\d{1,}- digit with 1 or more digits 
    System.out.println(str4.matches("(.*)\\d{1,3}(.*)"));// \\d{1,3}- digit with 1 to 3 digits
  //[abc] - either a or b or c
	//[^abc] - except a and b and c	
	//[a-zA-Z] - any alphabet
	//[a-d[m-p]] - a to d or m to p(union)	
	//[a-z&&[def]] - d or e or f(intersection)	
	//[a-z&&[^bc]] - a to z except b and c(subtraction)[ad-z]
	//[a-z&&[^m-p]] - a to z and not m through p(subtraction)[a-lq-z]
  //. - any character except newline
  //\b- word boundary
  //\B- non-word boundary
  //| - either or
  //^ - start of a line
  //$ - end of a line
  /*(\)uxxxx - Unicode escape sequence*/
  //.* - any character (0 or more times)

  // Escape characters in java
  // \t - tab
  // \b - backspace
  // \n - newline
  // \r - carriage return
  // \f - form feed
  // \' - single quote
  // \" - double quote
  // \\ - backslash
  // \ddd - octal number
  // (\)uxxxx - hexadecimal number
  // \cx - control character
  }    
}
