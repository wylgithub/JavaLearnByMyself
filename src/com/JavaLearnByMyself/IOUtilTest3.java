package com.JavaLearnByMyself;

import java.io.File;
import java.io.IOException;

public class IOUtilTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�����ļ���������
		try {
			IOUtil.copyFile(new File("E:\\JAVA IO\\srcFile.ppt"), new File("E:\\JAVA IO\\destFile.ppt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//���ز鿴�ļ�ȷʵ������ļ��Ŀ�������
	}

}
