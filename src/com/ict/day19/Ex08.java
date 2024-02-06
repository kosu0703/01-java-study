package com.ict.day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	스트림 : 데이터를 원하는 목적지까지 입/출력하는 방법
	
		종류) 바이트 스트림, 문자 스트림, 결합 스트림, 객체 스트림(오브젝트 스트림)
	
		1. 바이트 스트림 : 모든 처리를 1byte 처리 (기계위주)
				대상) 바이트로 이루어진 모든 파일(사진, 동영상, 음악 등)
			최상위 클래스) InputStream(입력), OutputStream(출력)
						
		2. 문자 스트림 : 모든 처리를 2byte 처리 (인간위주)
				대상) 세계 모든 문자로 구성된 파일을 입출력하는데 적합하다.
			최상위 클래스) Reader(입력), Writer(출력)
			
		3. 결합 스트림 : 바이트 스트림 => 문자 스트림
					기계를 통해 입/출력된 정보를 사람이 알아볼 수 있도록 입/출력 한다.
			최상위 클래스) InputStreamReader(입력), OutputStreamWriter(출력)		
				
		4. 객체 스트림 : 객체 직렬화 후 객체 단위로 입/출력 
		(오브젝트 스트림)		
				대상) 객체			
			최상위 클래스) ObjectInputStream(readObject() : 객체 역직렬화)
					 ObjectOutputStream(writeObject() : 객체 직렬화)		

*/
public class Ex08 {
	public static void main(String[] args) {
	
		//	바이트 출력 스트림 : OutputStream 자식 클래스 FileOutputStream 사용
		
		//			FileOutputStream : 해당 파일에 내용을 1byte 한글자 쓰기 (출력)
		
		//		주요메서드) write(int b) : int 
		//					숫자(아스키코드(0-255), 한글자)
		//					**아스키코드(숫자,대소문자,특수문자 일부만 가능)										
		
		//				write(byte[] b) : 배열 b 에 존재하는 아스키코드 출력
		//					**String 클래스의 getBytes()를 이용하면 byte[]로 만들어진다.	
		
		//				flush() : 출력 버퍼 용량이 다 차지 않아도 바로 출력하게 만든다.
		
		//				close() : 출력 스트림 닫기
		
		
		//	파일 만들 위치 지정
		String pathname = "D:/kosu0703/util/test01.txt";
		File file = new File(pathname);
		//	파일을 만들고 짚어넣기
		//	creatNewFile 대신에 파일 생성하는 방법
		
		FileOutputStream fos = null;			//	finally 에서 사용하기 위해서 밖에서 선언
		
		try {
			//	안에서 선언하면 지역변수가 되서 finally 에서 부를 수 없다.
			//FileOutputStream fos = new FileOutputStream(file);
			
			//	파일이 존재하지 않으면 생성되고
			//	파일이 존재하면 덮어쓰기가 된다.
			fos = new FileOutputStream(file);	//	안에서 생성	
			fos.write(106);						//	다중 catch
			fos.write(97);						
			fos.write(118);						
			fos.write(97);						//	파일을 생성하면서 java 를 출력한다.		
			fos.write(13);	//	**줄바꾸기
			
			fos.write('h');
			fos.write('e');
			fos.write('l');
			fos.write('l');
			fos.write('o');
			fos.write(13);	//	줄바꾸기			//	파일을 생성하면서 java hello 를 출력하고 덮어쓴다.
			
			//	**String.getBytes() 여러글자 사용가능 
			//	byte[] 은 한글, 한자도 사용 가능 
			String msg = "Hi~~~\n안녕\n大韓民國\nBye~~";
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.write(13);	//	줄바꾸기
			
			fos.flush();						//	출력 버퍼 용량이 안차면 원래는 출력이 안되는데 
												//	flush()를 사용하면 버퍼 용량이 차지 않아도 출력됨
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
