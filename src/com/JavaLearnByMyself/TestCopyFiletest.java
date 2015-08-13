package com.JavaLearnByMyself;

import java.io.File;
import java.io.IOException;

public class TestCopyFiletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			TestCopyFile.testCopyFile(new File("E:\\JAVA IO\\srcFile.txt"),new File("E:\\JAVA IO\\destFile.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
