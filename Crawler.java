package com.san;

import java.io.IOException;
import java.util.*;

public class Crawler {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		boolean in = true;
		String key = null;
		int pn = 0;

		int n = 0;
		while (in) {
			if (n == 0) {
				System.out.println("Enter Keyword : ");
				key = sc.next();
			} else if (n == 1) {
				System.out.println("Enter page no. / Enter '0' for search or  : ");
				pn = sc.nextInt();

				if (pn == 0) {
					break;
				}
				in = false;
			}
			n++;

		}
		if (n == 1) {
			new consumer().start(key);
		} else if (n == 2) {
			new consumer().start(key, pn);
		}

	}

}
