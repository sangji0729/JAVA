package may18;
//char ������
//���� �ϳ��� �����մϴ�.
/*	�ݵ�� �����δ� ���� �ϳ��� �;� �մϴ�.
 * 	�ϳ� �̻��� ��쿡��? String�� �����մϴ�.
 * 	������ Ÿ�� 0 ~ 65,535 = 2byte
 * 
 * 	�������� ������ ����?
 * 	�ݵ�� Ȧ����ǥ��
 * 
 * �������̱� ������ int�� ���θ�� �����մϴ�.
 * �ݴ�� int �� ���� ���ڷ� �ٲ� �� �ֽ��ϴ�.(cast)
 */

public class DataType3 {

	public static void main(String[] args) {
		//������ �ʱ�ȭ �ϱ�
		//������Ÿ�� ������ = '��';
		
		char char1 = 'A';
		char char2 = '��';
		char char3 = '��';
		char1 = 100;
		char2 = '\ub777'; //�����ڵ�
		//�ƽ�Ű�ڵ�, �����ڵ� ----utf-8 euc-kr, ms949
		
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
		
		/*for(int i = 1; i < 128; i++) {
		*	System.out.print(i + " : " + (char) i + "\n");
		}*/
	
	String str = "������"; //���ڿ� = ��Ʈ��
	
	  str = "" + char1 + char2 + char3;
	
		System.out.println(str);//d����
	
	int iNum = char3;
		System.out.println(iNum);
	
	int iNum2 = 0xb127;
		System.out.println(iNum2);
		System.out.println((char)iNum2);
		
		
		//////////////////����
		//boolean ��, ����

		boolean check = true;
		
		System.out.println(check);
		
		System.out.println('A' == 'a');
		
		iNum = 10;
		iNum2 = 10;
		
		System.out.println(iNum == iNum2);
		
		check = iNum == iNum2 + 1;
		System.out.println("����� : " + check);
		
		check = iNum != iNum2 + 1; // ! = not
		System.out.println("����� : " + check);
		//�� ���� �����ϴ� Ÿ��
		//off on
		
		/* PŸ�� 8�� �������
		 * 
		 * ������
		 * 		1.byte 
		 * 		2.short 
		 * 		3.int
		 * 		4.long
		 * 
		 * �Ǽ���
		 * 		1.float
		 * 		2.double
		 * 
		 * ������
		 * 		1.char
		 * 
		 * ����
		 * 		1.boolean
		 */
		
		int code = 1;
		int result = code % 2; //��ⷯ = ������ ��
		check = result == 0;
		
		if(check) {//���࿡ check�� ���̶��
			System.out.println("����� ����");
		} else {
			System.out.println("����� ����");
		}
		
	}

}
