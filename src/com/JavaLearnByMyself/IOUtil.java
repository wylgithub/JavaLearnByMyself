package com.JavaLearnByMyself;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtil {

	public static void printHex(String Filename)throws IOException{
		/**
		 * ��ȡָ���ļ����٣�����16�������������̨������
		 * û���10byte����
		 */
		FileInputStream in = new FileInputStream(Filename);
		int b;
		int i = 1;
		while((b = in.read())!=-1){
			if(b <= 0xf){
				//��λ��ǰ�油��
				System.out.print("0");
			}
			//��ʮ�����Ƶ���ʽ�����ʾ�������Կո�ָ�
			System.out.print(Integer.toHexString(b)+"  ");
			//��ÿ��������ڵ���ʮ���ֽ�ʱ����
			if(i++%10 == 0){
				System.out.println();
			}
		}
		//�ر��ļ��������쳣����
		in.close();
	}
	
	//�ļ���copy����
	public static void copyFile(File srcFile, File destFile)throws IOException{
		if(!srcFile.exists()){
			//����ļ����������׳��ļ������ڵ��쳣
			throw new IllegalArgumentException("�ļ�"+srcFile+"������");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile+"�����ļ�");
		}
		//�ļ���д����
		//������
		FileInputStream in = new FileInputStream(srcFile);
		//д����
		FileOutputStream out = new FileOutputStream(destFile);
		//������д
		byte [] buf = new byte[8*1024];
		int b;
		//ֻҪ�����ļ��ͼ�����ȡ
		while((b = in.read(buf,0,buf.length)) != -1){
			out.write(buf,0,b);
			out.flush();//��ü��ϣ�ˢ��
		}
		//�ر��ļ�����
		in.close();
		out.close();
	}
	public static void printHexByByteArray(String fileName)throws IOException{
		FileInputStream in = new FileInputStream(fileName);
		byte[] buf = new byte[20*1024];
		//��in�ж�ȡ�ֽڷ��뵽buf�ֽ������У��ӵ�0��λ�ÿ�ʼ������buf.length��
		int bytes = in.read(buf,0,buf.length);//һ���Զ��꣬˵���ֽ������㹻��
		int j = 1;
		for(int i = 0; i < bytes;i++){
			if(buf[i] < 0xf){
				//���Ϊһλ������
				System.out.println("0");
			}
			System.out.println(Integer.toHexString(buf[i])+" ");
			if(j++ % 10 == 0){
				System.out.println();
			}
		}
		
	
	}
}
