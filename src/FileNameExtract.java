import java.io.File;

public class FileNameExtract {

	public static void main(String[] args) {
		File folder = new File("D:\\Marriage\\2nd list");
		File[] files = folder.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}
	}

}
