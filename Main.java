public class Main {
    public static void main(String... arg) {
	int c = 3;
	int a = 2;
	int b = 3;
	System.out.println(a + " + " + b + " = " + Operation.addition(a,b));
	System.out.println(a + " - " + b + " = " + Operation.soustraction(a,b));
	System.out.println(a + " * " + b + " = " + Operation.produit(a,b));
    }
}
