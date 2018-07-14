
强制转换：
	目标类型 变量名 = (目标类型) (被转换的数据);
	数据做运算，结果应该是什么类型，就用什么类型接受，不要随意转换类型，否则会有精度的损失

public class TypeCastDemo{
	public static void main(String[] args){
		int a = 10;
		byte b = 20;
		int c = a+b;
		System.out.println(c);
		
		byte d = (byte)(a+b);
		System.out.println(d);
	}
}