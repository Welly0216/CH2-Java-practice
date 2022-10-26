import java.lang.reflect.Array;

public class p40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = (int[]) Array.newInstance(int.class, 3);

		Array.set(a, 0, 123);
		Array.set(a, 1, 456);
		Array.set(a, 2, 789);
		System.out.println("a[0]=" + Array.get(a, 0));
		System.out.println("a[1]=" + Array.get(a, 1));
		System.out.println("a[2]=" + Array.get(a, 2));
	}

}
