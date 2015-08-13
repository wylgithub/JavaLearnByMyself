package com.JavaLearnByMyself;

import java.io.File;
import java.io.IOException;

public class IOUtilTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//测试文件拷贝工作
		try {
			IOUtil.copyFile(new File("E:\\JAVA IO\\srcFile.ppt"), new File("E:\\JAVA IO\\destFile.ppt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//返回查看文件确实完成了文件的拷贝工作
	}

}
