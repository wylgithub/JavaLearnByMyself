package com.JavaLearnByMyself;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DosDemo1 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub

		String file = "demo.dos.dat";
		IOUtil.printHex(file);
		
		//������������װ��ģʽ�İ�װ����
		
		DataInputStream dis = new DataInputStream(new FileInputStream(file)); 
		
		//��ӡintֵ
		int i = dis.readInt();
		System.out.println(i);
		i = dis.readInt();
		System.out.println(i);
		//��ӡlongֵ
		long I = dis.readLong();
		System.out.println(I);
		I = dis.readLong();
		System.out.println(I);
		
		//��ӡDoubleֵ
		double d = dis.readDouble();
		System.out.println(d);
		
		//��ӡUTFֵ
		String s = dis.readUTF();
		System.out.println(s);
		//�ر��ļ�
		dis.close();
	}

}
