package com.JavaLearnByMyself;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestGithub {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		System.out.println("hello github");
		/**
		 * FileOutputStreamʵ�������ļ���д��byte���ݵķ���
		 * 
		 */
		//������ļ������ڣ���ֱ�Ӵ��������������ɾ��֮�����´�����������ϡ�true���������ڸ��ļ���ֱ��׷������
		FileOutputStream out = new FileOutputStream("demo/out.dat");
		//һ��writeֻ��дһ���ֽ�
		out.write('A');//д����A�ĵͰ�λout.write("A");--��˫���ű�ʾ�����ַ�����out.write('A');��ʾ�����ַ�
		out.write('B');//д����B�ĵͰ�λ
		int a = 10;//writeֻ��д��λ��дһ��int��Ҫд4�Σ�ÿ�ΰ�λ
		out.write(a >>> 24);
		out.write(a >>> 16);
		out.write(a >>> 8);
		out.write(a);
		
		//дһ���ֽ�����
		byte[] gbk = "�й�".getBytes("gbk");
		out.write(gbk);
		
		//�ر��ļ�
		out.close();
		
		IOUtil.printHex("demo/out.bat");
		
		
	
	}

}
