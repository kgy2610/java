package p.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		/*
		 	네트워크 : 여러대의 컴퓨터들이 연결되어있는 통신망
		 			=> 네트워크를 통해서 서로 데이터를 교환하기 위함
		 	IP주소 : 네트워크상에 각 컴퓨터들을 식별해줄 수 있는 번호
		 	(실제 주소와 동일한 역할을 한다고 생각하면 된다.)
		 	
		 	* 서버와 클라이언트
		 	* 서버 : 클라이언트(고객)에게 서비스를 제공해주는 프로그램 또는 컴퓨터(요청에 대해서 응답해주는 것)
		 	* 클라이언트 : 서버에 요청을 하는 컴퓨터(서비스를 제공받는 고객)
		 	
		 	
		 	- 서버에 요청하기 위해서는 요청하고자하는 서버의 IP주소(또는 도메인), 포트번호를 알아햐함
		 	
		 	* 현재 구동 중인 서버가 있을 때
		 	  클라이언트는 그 서버로 요청을 보낼 수 있음 -> 응답 결과가 돌아옴
		 	  
		 	  - 요청과 응답에 의해서 웹은 작동한다("통신한다")
		 	  - 웹에서의 통신 방식은 HTTP프로토콜을 사용한다.
		 	  
		 	  * 자바만 가지고 서버와 클라이언트의 간단한 통신을 해보자
		 	    이때 데이터를 입출력하고자 한다면 서버와 클라이언트 간에 스트림(통로)이 필요함
		 	    
		 	  소켓 프로그래밍(TCP / UDP)
		 	  - TCP 방식 : 데이터의 전송속도가 느림, 데이터가 정확하고 안정적으로 전달(신뢰성이 요구되는 프로그램)
		 	  - UDP 방식 : 데이터의 전송속도가 빠름, 신뢰성이 없는 데이터 전달에 용이(데이터를 빠른 속도로 전송하고자 할 때)
		 */
		
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			// 내 PC에 대한 정보를 반환
			System.out.println(localhost);
			// 내 pc명 + 내 ip 주소
			
			System.out.println("내 PC명 : " + localhost.getHostName());
			// 호스트의 이름을 반환
			System.out.println("내 IP주소 : " + localhost.getHostAddress());
			
			System.out.println(" ============================================= ");
			
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			// 도메인 명을 통해서 해당 호스트의 정보를 가져올 수 있다
			
			System.out.println("Google 서버명 : " + googleHost.getHostName());
			// google의 이름을 반환
			System.out.println("Google IP주소 : " + googleHost.getHostAddress());
			
			System.out.println(" ============================================= ");

			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 호스트의 개수 : " + naverHost.length);
			
			for(InetAddress n : naverHost) {
				System.out.println("네이버 서버명 : " + n.getHostName());
				System.out.println("네이버 IP주소 : " + n.getHostAddress());
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
