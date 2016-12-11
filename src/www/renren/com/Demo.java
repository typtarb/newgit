package www.renren.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader read = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println(" ‰»ÎqÕÀ≥ˆ");
		char c;
		do {
			c = (char) read.read();
			System.out.println(c);
		} while (c != 'q');
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
