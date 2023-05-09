public class recursion{
    public static String process (String str) {
  int n = str.length(); 
  if (n >= 2) 
  { 
    int n2 = n/2; 
    str = process(str.substring(n2)) + 
          process(str.substring(0, n2)); 
  } 
  return str;
}

}