package javaConcepts;

public class JavaVariables {
int i=17;
static String str1 = "learningjava";

int add(int a, int b) {
	return a+b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaVariables obj = new JavaVariables();
		
		System.out.println(obj.i);
		System.out.println(obj.add(5, 8));
		System.out.println(str1);
		
		
	}

}
