package www.sohu.com;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		File file = new File(".");
		String[] array = file.list(new FilterFile(args[0]));
		Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
	}

	static class FilterFile implements FilenameFilter {
		private Pattern pattern = null;

		FilterFile(String arg) {
			pattern = Pattern.compile(arg);
		}

		@Override
		public boolean accept(File dir, String filename) {
			// TODO Auto-generated method stub
			return pattern.matcher(filename).matches();
		}
	}

	/*
	 * try {
	 * 
	 * @SuppressWarnings("resource") Reader reader = new FileReader(file);
	 * char[] buff = new char[1024]; int n = 0; while ((n = reader.read(buff))
	 * != -1) { for (int i = 0; i < n; i++) System.out.println("buff = " +
	 * buff[i]); } Writer writer = new FileWriter(file); writer.write("tarb"); }
	 * catch (FileNotFoundException e) { e.printStackTrace(); } catch
	 * (IOException e) { e.printStackTrace(); }
	 */
}