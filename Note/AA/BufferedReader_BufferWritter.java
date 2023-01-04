package AA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedReader_BufferWritter {

	public static void main(String[] args) throws IOException {
		/* scanner는 띄어쓰기와 엔터를 경계로 입력값을 인식한다.
		 * 
		 * BufferedReader는 엔터만 경계로 인식하고 데이터가 String으로 고정되기
		 * 때문에 데이터를 따로 가공해줘야한다.
		 * 	- 속도가 scanner보다 빨라 많은 데이터를 입력받아야할 경우 사용.
		 *  - readLine()을 사용하면 데이터를 라인 단위로 읽을 수 있다.
		 *  - readLine()의 리턴값은 String으로 고정되기 때문에 다른 타입으로
		 *  	입력을 받으려는 경우 형변환을 해줘야한다.
		*/
		
		// 콘솔에서 입력받을 경우 (선언 형식)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 예외처리가 반드시 필요하다.
		// readLine()시마다 혹은 throws IOException을 해주면 된다.
		String name= br.readLine();
		int i = Integer.parseInt(br.readLine());
		
		// 공백단위로 데이터를 가공해줄 경우
		//1. StringTokenizer : 입력받은 값을 공백단위로 구분해 순서대로 호출
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		//2. String.split() : 공백단위로 끊어 데이터를 저장
		String arr[] = s.split(" ");
		
		
		
		// BufferedWritter 사용번
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "abcdef";	// 출력할 문자열
		bw.write(s);	// 출력
		
		
	}

}
