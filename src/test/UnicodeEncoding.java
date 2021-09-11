package test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class UnicodeEncoding {

	public static void test() throws UnsupportedEncodingException {
		
		String stringA = "ç";

		System.out.println(stringA.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();

		System.out.println(charset.displayName());
		
		byte[] bytes = stringA.getBytes("windows-1252");

		System.out.print(bytes.length + ", windows-1252, ");

		String stringB = new String(bytes, "windows-1252");

		System.out.println(stringB);
		
		bytes = stringA.getBytes(StandardCharsets.UTF_16);

		System.out.print(bytes.length + ", UTF-16, ");

		stringB = new String(bytes, StandardCharsets.UTF_16);

		System.out.println(stringB);
		
		bytes = stringA.getBytes(StandardCharsets.US_ASCII);

		System.out.print(bytes.length + ", US-ASCII, ");

		stringB = new String(bytes, StandardCharsets.US_ASCII);

		System.out.println(stringB);
	}
}
