import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseHash {
	static String letters = "acdegilmnoprstuw";

	public static void main(String[] args) throws java.lang.Exception {
		System.out.println(unhash(680131659347L));
	}

	static long hash(String s) {
		long h = 7;

		for (int i = 0; i < s.length(); i++) {
			h = (h * 37 + letters.indexOf(s.charAt(i)));
		}
		return h;

	}

	static String unhash(long n) {
		String result = "";
		while (n > 7) {
			result = letters.charAt((int) (n % 37))+result;
			n/=37;
		}
		return result;
	}
}
