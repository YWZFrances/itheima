我们在做运算的时候一般要求参与运算的数据类型必须一致
类型转换分为两种
	1.隐式转换
	2.强制转换
	
    隐式转换：
		byte short char -- int -- long -- float -- double
		从小到大可以隐式转换



public class TypeCastDemo{
	public static void main(String[] args){
		int a = 3;
		int b = 4;
		int c = a+b;
		System.out.println(c);
		
		byte bb = 2;
		int cc = 5;
		System.out.println(bb+cc);

		byte dd = bb+cc;  //可能损失精度
		int ee = bb+cc;
		System.out.println(dd);
		System.out.println(ee);


	}
}