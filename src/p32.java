import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p32 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("第幾次結束迴圈??(1-10)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		for (int i = 1; i < 11; i++) {
			System.out.println("第i圈:" + i + "次處理");
			if (i == n)
				break;
		}
	}
}
