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
		
		//读出来：用了装饰模式的包装操作
		
		DataInputStream dis = new DataInputStream(new FileInputStream(file)); 
		
		//打印int值
		int i = dis.readInt();
		System.out.println(i);
		i = dis.readInt();
		System.out.println(i);
		//打印long值
		long I = dis.readLong();
		System.out.println(I);
		I = dis.readLong();
		System.out.println(I);
		
		//打印Double值
		double d = dis.readDouble();
		System.out.println(d);
		
		//打印UTF值
		String s = dis.readUTF();
		System.out.println(s);
		//关闭文件
		dis.close();
	}

}
