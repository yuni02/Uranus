
public class Ex03 {

	public static void main(String[] args) {
		int a; //a는 변수명. 변수란 자료형 값을 저장하는 장소\
/*자바의 변수 선언법:
 * 자료의 변수명;*/
		a=100;//;은 한문장 끝 , =은 오른쪽 값을 왼쪽 변수에 대입하라는 대입(할당) 연산자.
		System.out.println(a);		
		a=200;  //변수 a에는 한개값만 저장가능하고 가장 마지막에 저장된 값만 저장됨.
		System.out.println(a);		
		int x=10;
		int y=20;
		int tmp=100;
		System.out.println("x="+x+", y="+y);//+는 문자열 연결연산기호
		tmp=x; x=y; y=tmp;//x,y변수값이 서로 바뀜.
		System.out.println("x="+x+", y="+y);
	}
}
