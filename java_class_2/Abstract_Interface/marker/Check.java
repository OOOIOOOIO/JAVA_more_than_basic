package marker;

public class Check {
	public static void main(String[] args) {
		Digimon d = new Digimon(); 		// ��ü ����
		
		Pokemon p = new Pokemon();
		
		ZzangGu z = new ZzangGu();
		
		HarryPotter h = new HarryPotter();
		
		if(d instanceof Animation) { // a instanceof b : b�ȿ� a�� �ִ�?
			System.out.println("�������� �ִϸ��̼� �Դϴ�.");
		}
		
		if(p instanceof Animation) {
			System.out.println("���ϸ��� �ִϸ��̼� �Դϴ�.");
		}
		
		if(z instanceof Animation) {
			System.out.println("¯���� �ִϸ��̼� �Դϴ�.");
		}
		
		if(!(h instanceof Animation)) {
			System.out.println("�ظ����ʹ� �ִϸ��̼� �Դϴ�.");
		}
	}
}