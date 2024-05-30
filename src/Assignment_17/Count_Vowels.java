package Assignment_17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

// 1. Write a Java Program for counting the vowels and numbers from file( abc.txt) .

public class Count_Vowels {
	public void writeDataInFile() {

		try {
			String str ="9 is pune and 3cuntry name is india2";
			byte [] info =str.getBytes();
			
			FileOutputStream file = new FileOutputStream("D:\\Assignment\\output\\abc.txt");
			
			file.write(info);
			System.out.println("Wite successfully.");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	public void readData() {
		int vowelcount=0;
		int numbercount=0;
		char s=' ';
		try {
		FileInputStream read = new FileInputStream("D:\\Assignment\\output\\abc.txt");
		int i=0;
		//char[] s=new char[400];
		while((i=read.read())!=-1) {
			
		s = (char)i;
			if(s=='a'||s=='A'||s=='e'||s=='E'||s=='o'||s=='O'||s=='i'||s=='I'||s=='u'||s=='U') {
				vowelcount++;
							} 
			if(s>=48 && s<=57 ) {
				//System.out.println(s);
			
				numbercount++;
				
			}
			

		}
		
		System.out.println("Vowelcount : "+vowelcount);
		System.out.println("Number Count : "+numbercount);
		
		
	}catch(Exception e) {
		
		System.out.println(e.getMessage());
	}
		
	}
	public static void main(String[] args) {
		
		Count_Vowels count = new Count_Vowels();
		count.writeDataInFile();
		count.readData();
	}

}
