package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {

		Path currentDirectory = Paths.get("."); // define kiya Start path ko as cureentDirectory
		Path pathFileRead = Paths.get("./resources/data.txt");

		List<String> hd = Files.readAllLines(pathFileRead);
//		System.out.println(hd);

		Files.lines(pathFileRead).map(String::toLowerCase).filter(s -> s.contains("a")).forEach(System.out::println);
	}

}
