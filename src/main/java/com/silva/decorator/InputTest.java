package com.silva.decorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class InputTest {

	public static void main(String[] args) {
		int c;
		try {
			LowerCaseInputStream in = new LowerCaseInputStream(
					new BufferedInputStream(new FileInputStream(new File("test.txt"))));
			while ((c = in.read()) > 0) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
