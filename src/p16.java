
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J���");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char letter = str.charAt(0);
		switch (letter) {
		case 'a': {
			System.out.println("��J���ȬOa");
			break;
		}
		case 'b': {
			System.out.println("��J���ȬOb");
			break;
		}
		default: {
			System.out.println("��JaORb");
			break;
		}

		}
	}
}
