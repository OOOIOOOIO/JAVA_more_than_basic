package java_class_2;

public class Abstrat_Interface {

}

/*
			<추상 클래스>
			
  추상적인 내용만 정의하고 있는 클래스로 구체적인 내용은 하위 클래스에서 구현되도록 해놓은 클래스
 추상클래스(부모) 클래스들(자식)의 공통요소들을 가상화 시켜놓는다.
 객체화는 가능하나 잘 사용하지 않는다.(목적에 어긋남)
  부모 추상 클래스의 역할은 단지 자식 클래스를 만들 때 도와주는 역할을 수행하기 위해 존재한다.(다형성)
 자식 클래스에서 사용할 메서드를 선언만 해 놓는다. 바디가 없다.
 그 메서드를 추상 메서드라고 하며 앞에 abstract 키워드가 붙는다. 일반 메서드도 선언 가능하다.
 
 abstract 추상클래스명{
 	
 	abstract 리턴타입 추상메서드(); -> 선언만
 
 
 }

			<인터페이스>

  추상 클래스를 고도화 시킨 문법이며, 반드시 추상 메서드와 상수만 선언해야된다.
 즉 다른 클래스에서 인터페이스를 지정할 떄에는 implements를 사용한다.
  지정된 인터페이스가 가지고 있는 추상 메서드들을 반드시 재정의 해야한다.
 또한 일반 메서드는 정의할 수 없다.


			<Marker InterFace>
 클래스들의 공통 그룹명으로 인터페이스를 생성하고 아무것도 생성하지 않음
클래스들이 같은 그룹으로 묶였다는 표시를 하기 위해 쓰인다.
 
*/
