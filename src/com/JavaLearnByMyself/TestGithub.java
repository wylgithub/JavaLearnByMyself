package com.JavaLearnByMyself;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestGithub {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		System.out.println("hello github");
		/**
		 * FileOutputStream实现了向文件中写出byte数据的方法
		 * 
		 */
		//如果该文件不存在，则直接创建，如果存在则删除之后重新创建，如果加上“true”则假如存在该文件就直接追加内容
		FileOutputStream out = new FileOutputStream("demo/out.dat");
		//一个write只能写一个字节
		out.write('A');//写出了A的低八位out.write("A");--》双引号表示的是字符串；out.write('A');表示的是字符
		out.write('B');//写出了B的低八位
		int a = 10;//write只能写八位，写一个int需要写4次，每次八位
		out.write(a >>> 24);
		out.write(a >>> 16);
		out.write(a >>> 8);
		out.write(a);
		
		//写一个字节数组
		byte[] gbk = "中国".getBytes("gbk");
		out.write(gbk);
		
		//关闭文件
		out.close();
		
		IOUtil.printHex("demo/out.bat");
		
		
	
	}

}
