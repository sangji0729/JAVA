package may18;
//�Ǽ�
	//float
	//double(�⺻)

public class DataType2 {

	public static void main(String[] args) {
		//������Ÿ�� ������ = ��;
		//3.14
		double pi = 3.14;
			System.out.println(pi);
		
		int intNum = (int) pi;
			System.out.println(intNum); //3
		
		long longNum = (long)pi;
			System.out.println(longNum);;//3
			
		pi = longNum;
			System.out.println(pi);//3.0
		
		pi = (int) longNum; //3.0
			System.out.println(pi);
			
		pi = Long.MAX_VALUE;
		System.out.println(pi);
		
		
		//float
		float fNum = (float) 3.14; 
		float fNum2 = 3.14F;
			System.out.println(fNum);
			System.out.println(fNum2);
		//float int
		fNum2 = intNum;
			System.out.println(fNum2);
		intNum = (int) fNum;
			System.out.println(intNum);
			
		//float long
		longNum = (long) fNum;
			System.out.println(longNum);
			
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		
		pi = Double.MAX_VALUE;
		longNum = (long) pi;
		
		System.out.println(longNum);
		
		/* �Ǽ���
		 * float�� double�� �ֽ��ϴ�.
		 * double�� �⺻Ÿ���Դϴ�.
		 * float�� ���� �Ǽ��� �ʱ�ȭ �Ҷ���
		 * ǥ����(f,F)�� �־��ּž� �մϴ�.
		 * (�׷��� ������ ������ ����)
		 * ������ �Ǽ� �� ��ü�� double �޸𸮷�
		 * ��������� ������ float�� �����ϴ� ���� �Ұ���
		 * 
		 *  ����2
		 *  ���� ���̶� �������� ������ ū Ÿ������ �����մϴ�
		 *  ���� float�� 4byte��� �ϴ��� long���� ū Ÿ������ �����մϴ�.
		 *  ���� ���� ������ ���� ĳ���� ���ּž� �մϴ�.
		 *  
		 *  
		 * 
		 */
		
		
		fNum = 3.14F + 3.14F;
		fNum2 = fNum + 3.14F; // 
		//intNum = 3 + longNum;
		
		//byte, short
		
		byte bNum = 3;
		short sNum = 5;
		sNum = 3 + 100;
		//bNum = 126 + 19;
		
		//���� Ÿ�԰� ū Ÿ�� ���ÿ� �⺻ Ÿ�� �����̸�
		//�⺻ Ÿ������ ��ȯ, ���˴ϴ�.
		//�⺻ Ÿ�� �̻��� ��쿡�� ������ ū Ÿ������ ��ȯ�� ���˴ϴ�.
		
		
		
		//����
		//8����: ����0��, 16����: ����0x��
		
		System.out.println(10);
		System.out.println(010);
		System.out.println(0x10);	
		
		
		
	}

}
