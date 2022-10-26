import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class p47 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer a[] = new Integer[5];
		for (int i = 0; i < a.length; i++) {
			String str = br.readLine();
			a[i] = Integer.parseInt(str);
		}

		Arrays.sort(a, Collections.reverseOrder());
		for (int i = 0; i < a.length; i++) {
			System.out.println("²Ä" + (i + 1) + "¦W¬O:" + a[i]);

		}
	}
}
