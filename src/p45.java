import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p45 {
	public static void main(String[] args) throws IOException {
		System.out.println("輸入五個人的分數");
		Integer a[] = new Integer[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < a.length; i++) {
			String str = br.readLine();
			a[i] = Integer.parseInt(str);
		}
		for (int s = 0; s < a.length - 1; s++) {
			for (int t = s + 1; t < a.length; t++) {
				if (a[t] > a[s]) {
					int temp = a[t];
					a[t] = a[s];
					a[s] = temp;
				}
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("第" + (i + 1) + "名是:" + a[i]);
		}

	}
}
