package may18;



//������ Ÿ��
/* �ڹٿ����� ����, ����� �� ���� ��� ���ؼ���
 * �ݵ�� �� ���� Ÿ�Կ� �´� ������ ����ؾ� �մϴ�.
 * �̸� ������ Ÿ���̶�� �մϴ�.
 * 
 * ������ Ÿ���� ũ��
 * Reference ����Ÿ��
 * Primitive �⺻Ÿ��
 * �� ���е˴ϴ�.
 * 
 * �� �� P���� ���ڽ��ϴ�.
 * 
 * �ڹ��� ������ Ÿ���� ũ�� 2����, P�� R�̶�� ������ֽø�
 * �˴ϴ�.
 * 
 * pŸ���� ��ġ��, ������, ����
 * ������ Ÿ�Ե��� �޸� ũ�Ⱑ ������ ���ѵ˴ϴ�.
 * 
 * ��ġ��
 * 		������
 *			byte
 *			short
 *			int(�⺻)
 *			long
 * 
 * 		�Ǽ���
 * 			float
 * 			double(�⺻)
 * 
 * 		������ = �ѱ��� EX) A, ��, ��, $
 * 			char
 * 	
 * 		���� = ��/���� = true, false = ������ ������� x 
 * 			boolean
 */
public class DataType1 {
	public static void main(String[] args) {
		//�޼ҵ� �ٵ� �ӿ��� ����� ���� = ��������
		//������Ÿ�� ������     = ��;
		  byte       byteNumber = 10;
		// -128 ~ 0 ~ 127
		  
		  short  shortNumber = byteNumber;
		  shortNumber = 32767;
		  
		  int intNumber = 1000000; //���ͷ�
		  
		  intNumber = Integer.MAX_VALUE;
		  intNumber = Integer.MIN_VALUE;
		 
		  
		  long longNum = intNumber;
		  
		 
		  longNum = Long.MAX_VALUE;
		  longNum = Long.MIN_VALUE;
		  longNum = -9223372036854775808L; //�ǵ޼��ڿ� L�� ���������μ� �������� ������

		  
		  System.out.println(byteNumber);
		  System.out.println(shortNumber);
		  System.out.println(intNumber); //2147483647
		  System.out.println(longNum);
		  
		  // = ����       == ����
		  intNumber = (int) longNum;
		  //cast    casting
		  short shorNum = (short) intNumber;
		  
		  byte byteNum = (byte) shorNum;
		  
		  byteNum = (byte) 120;
		  
		  System.out.println(byteNum);
		  
		  /* ĳ���� / ĳ��Ʈ
		   * ū Ÿ���� ���� Ÿ�Կ� �����Ҷ� �ݵ�� �ؾ� �ϴ� ����
		   * (type)�� ����ؼ� ���� ���Խ�ŵ�ϴ�.
		   * �̶� ������ ����
		   * ���� ��Ʈ�� �����Ҷ� ���� Ÿ�Կ� �°� �߶󳻱� ������
		   * ���� ��ȭ�� �� �� �ֽ��ϴ�.
		   * 
		   * 
		   */
		  short shortNum2;
		  
		  shortNum2 = byteNum;
		  //���θ��
		  /*ūŸ�Կ� ���� Ÿ���� ���ԵǴ� ��
		   * ���� Ÿ���� ū Ÿ�Կ� �ڵ����� ���� ��. 
		   * �� ��ȭ X
		   */
		  
		  
		  intNumber =(int) longNum; // ĳ����(������Ÿ�� ��ġȭ) �ʿ�
		  intNumber = byteNum; // �ڵ� ���� = ���θ��
	}
}





