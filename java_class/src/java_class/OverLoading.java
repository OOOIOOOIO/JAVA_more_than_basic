package java_class;

public class OverLoading {
	
	void add(int num1, int num2) {
		System.out.println("�� ������ ��");
		System.out.println(num1 + num2);
	}
	
	void add(int num1, int num2, int num3) {
		System.out.println("�� ������ ��");
		System.out.println(num1 + num2 + num3);
	}
	
	void add(double num1, double num2) {
		System.out.println("�� �Ǽ��� ��");
		System.out.println(num1 + num2);
	}
	
	
	
	public static void main(String[] args) {
		OverLoading o = new OverLoading();
		o.add(10, 20); // �̰� �����ε�
		o.add(10.5, 20.9);
		o.add(1,  2, 3);
	}
}
/*
	<���� �ε�(over loading)>
	 
 �����̸��� �޼���� �Ű������� ���� Ȥ�� Ÿ���� �ٸ���
������ �����ϴ�.


*/