package com.JavaLearnByMyself;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFile {

	//�Լ������ļ��Ŀ�������
	public static void testCopyFile(File srcFile,File destFile)throws IOException{
		//�ļ��쳣�����׳�
		if(!srcFile.exists()){
			throw new IllegalArgumentException("�ļ�"+srcFile+"������");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile+"�������ؼ�");
		}
		//ʵ���ļ��Ķ�д���ʵ��
		//��ȡ�ļ����ʵ����
		FileInputStream in = new FileInputStream(srcFile);
		//д���ļ����ʵ����
		FileOutputStream out = new FileOutputStream(destFile);
		//������ȡ
		byte [] buf = new byte[8*1024];
		int b;
		
		//ѭ����ȡ�ļ�����ʵ�ֿ�������
		while((b = in.read(buf,0,buf.length)) != -1){
			out.write(buf, 0, b);
			//ˢ���ļ�
			out.flush();
		}
		//�ֱ�ر��ļ�
		in.close();
		out.close();
	}
}
