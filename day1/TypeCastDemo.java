�������������ʱ��һ��Ҫ�����������������ͱ���һ��
����ת����Ϊ����
	1.��ʽת��
	2.ǿ��ת��
	
    ��ʽת����
		byte short char -- int -- long -- float -- double
		��С���������ʽת��



public class TypeCastDemo{
	public static void main(String[] args){
		int a = 3;
		int b = 4;
		int c = a+b;
		System.out.println(c);
		
		byte bb = 2;
		int cc = 5;
		System.out.println(bb+cc);

		byte dd = bb+cc;  //������ʧ����
		int ee = bb+cc;
		System.out.println(dd);
		System.out.println(ee);


	}
}