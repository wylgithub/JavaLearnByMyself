package com.JavaLearnByMyself;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtil {

	public static void printHex(String Filename)throws IOException{
		/**
		 * 读取指定文件内荣，按照16进制输出到控制台，并且
		 * 没输出10byte换行
		 */
		FileInputStream in = new FileInputStream(Filename);
		int b;
		int i = 1;
		while((b = in.read())!=-1){
			if(b <= 0xf){
				//单位数前面补零
				System.out.print("0");
			}
			//以十六进制的形式输出显示，并且以空格分隔
			System.out.print(Integer.toHexString(b)+"  ");
			//当每行输出大于等于十个字节时换行
			if(i++%10 == 0){
				System.out.println();
			}
		}
		//关闭文件，避免异常错误
		in.close();
	}
	
	//文件的copy操作
	public static void copyFile(File srcFile, File destFile)throws IOException{
		if(!srcFile.exists()){
			//如果文件不存在则抛出文件不存在的异常
			throw new IllegalArgumentException("文件"+srcFile+"不存在");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile+"不是文件");
		}
		//文件读写操作
		//读操作
		FileInputStream in = new FileInputStream(srcFile);
		//写操作
		FileOutputStream out = new FileOutputStream(destFile);
		//批量读写
		byte [] buf = new byte[8*1024];
		int b;
		//只要还有文件就继续读取
		while((b = in.read(buf,0,buf.length)) != -1){
			out.write(buf,0,b);
			out.flush();//最好加上：刷新
		}
		//关闭文件操作
		in.close();
		out.close();
	}
	public static void printHexByByteArray(String fileName)throws IOException{
		FileInputStream in = new FileInputStream(fileName);
		byte[] buf = new byte[20*1024];
		//从in中读取字节放入到buf字节数组中，从第0个位置开始放最多放buf.length个
		int bytes = in.read(buf,0,buf.length);//一次性读完，说明字节数组足够大
		int j = 1;
		for(int i = 0; i < bytes;i++){
			if(buf[i] < 0xf){
				//如果为一位数则补零
				System.out.println("0");
			}
			System.out.println(Integer.toHexString(buf[i])+" ");
			if(j++ % 10 == 0){
				System.out.println();
			}
		}
		
	
	}
}
