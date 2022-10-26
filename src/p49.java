
public class p49 {
	public static void main(String[] args) {
		int[][] a = new int[2][5];
		a[0][0] = 80;
		a[0][1] = 80;
		a[0][2] = 80;
		a[0][3] = 80;
		a[0][4] = 80;
		a[1][0] = 80;
		a[1][1] = 80;
		a[1][2] = 50;
		a[1][3] = 70;
		a[1][4] = 8;
		for (int i = 0; i < a[1].length; i++) {
			System.out.println("第" + (i + 1) + "個是" + a[0][i]);
			System.out.println("第" + (i + 1) + "個是" + a[1][i]);

		}

	}
}
