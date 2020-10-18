import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/*
 * decrypt msg and find sum of ASCII values in original text
 * https://projecteuler.net/problem=59
 */

public class Problem59_XORDecryption {
	static String content = null;
	static Path path = Paths.get("src\\p059_cipher.txt");
	static Charset ENCODING = StandardCharsets.UTF_8;
	
	public static void main(String[] args) {
		/* If the files being read are huge then you would want to use a BufferedReader on top of a FileReader to improve read performance. */
		System.out.println(path);
		try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)){
			String line = null;
			String result = null;
			while ((line = reader.readLine()) != null) {
				result += line;
			}

			System.out.println(result);

			List<String> txtValues = Arrays.asList(result.split(","));

			decryptionXOR(txtValues);

		} catch(IOException ex) {
			System.out.println(ex.toString());
		}

	}

	static void decryptionXOR(List result){
		result.stream()
                .forEach(value->Integer.parseInt(value));
	}

}
