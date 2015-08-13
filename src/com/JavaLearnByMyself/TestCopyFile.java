package com.JavaLearnByMyself;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFile {

	//自己测试文件的拷贝工作
	public static void testCopyFile(File srcFile,File destFile)throws IOException{
		//文件异常操作抛出
		if(!srcFile.exists()){
			throw new IllegalArgumentException("文件"+srcFile+"不存在");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile+"不是我呢见");
		}
		//实现文件的读写类的实例
		//读取文件类的实例化
		FileInputStream in = new FileInputStream(srcFile);
		//写入文件类的实例化
		FileOutputStream out = new FileOutputStream(destFile);
		//批量读取
		byte [] buf = new byte[8*1024];
		int b;
		
		//循环读取文件内容实现拷贝操作
		while((b = in.read(buf,0,buf.length)) != -1){
			out.write(buf, 0, b);
			//刷新文件
			out.flush();
		}
		//分别关闭文件
		in.close();
		out.close();
	}
}
