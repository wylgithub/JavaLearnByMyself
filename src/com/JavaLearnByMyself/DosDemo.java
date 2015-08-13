package com.JavaLearnByMyself;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		//��һ���ļ���д����
		String file = "/demo/dos.dat";
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeInt(10);
		dos.writeInt(-10);
		dos.writeShort(100);
		dos.writeByte(23);
		dos.writeDouble(12.32);
		dos.writeChar('a');
		//��UTF-8д��
		dos.writeUTF("�й�");
		//����UTF-16be����д��
		dos.writeChars("�й���");
		dos.close();
		
		//��ӡ���
		IOUtil.printHex(file);
	}

}
