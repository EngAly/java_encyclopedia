package fci.engaly.temporary;

public class Test1 {

	public static void main(String[] args) {
		
		iMethods<String,Integer> subIMethods= new iMethods<String,Integer>() {

			@Override
			public Integer test(String t, String t1) {
				// TODO Auto-generated method stub
				return  t.length()+t1.length();
			}
			
		};
		
		System.out.println(subIMethods.test("12","123"));	
	
}
}

interface iMethods<T, R> {
	R test(T t, T t1);

	 
}