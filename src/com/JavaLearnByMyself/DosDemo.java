package com.JavaLearnByMyself;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		//往一个文件里写数字
		String file = "/demo/dos.dat";
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeInt(10);
		dos.writeInt(-10);
		dos.writeShort(100);
		dos.writeByte(23);
		dos.writeDouble(12.32);
		dos.writeChar('a');
		//以UTF-8写出
		dos.writeUTF("中国");
		//采用UTF-16be编码写出
		dos.writeChars("中国人");
		dos.close();
		
		//打印输出
		IOUtil.printHex(file);
	}

}
