import org.apache.commons.lang3.*;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;




public class helloworld{
	static String readFile(String path){
		byte [] encoded = "".getBytes();;
		try {
			encoded = Files.readAllBytes(Paths.get(path));
		} catch (IOException e) {
			System.out.println(e);	
		}
		return new String(encoded);
	}
	public static void main(String[] args){
		String hostname = readFile("/etc/hostname");
	        String x = "hello world from host: " + hostname;
	        System.out.println(StringUtils.capitalize(x));
	}
}
