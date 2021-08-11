package String;

public class String_firstCode {
	public static void main(String[] args) {
		//--------string-----------
		String 	s = "HelloWorld";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				System.out.print(ch+ "_");
			}else {
				System.out.print(ch+ " ");
			}
		}
		//-------------char----------
		System.out.println();
		char c = 'C';
		System.out.println(c + "co ma ASCII la "+ (int)c);
		if('0' == 48) {
			System.out.println("cung gia tri");
		} 
		//-----------String pool------
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1 == s3);
	
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
	
	}
}
