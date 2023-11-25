
public class test02 {
	public static void main(String[] args) {
		float f = 12.3f;
		System.out.println(f);
	}

	public static void main4(String[] args) {
		int a = 1;
		int b = 2;
		double number = 1.1;
		System.out.println(a/b);
		System.out.println(number * number);
	}

	public static void main1(String[] args) {
		double num = 12.5;		//12.5默认就是双精度类型
		System.out.println(num);
	}

	public static void main2(String[] args) {
		for(int i = 0; i<args.length ;i++) {
			System.out.println(args[i]);
		}
		System.out.println("kaixin");
	}


	//讲解长整型
	public static void main3(String[] args) {
		long a = 10L;
		long b = 30L;
		System.out.println("hello bit");
		System.out.println(a);
		System.out.println("最大值："+ Long.MAX_VALUE);	//拼接
		System.out.println("最小值:" + Long.MIN_VALUE);	//拼接
		System.out.println("最小值:" + Long.MIN_VALUE);	//拼接
		System.out.println(a + b);	//计算
		System.out.println("hello word" + a + b);	//拼接：有一个拼接后面全都是拼接
	}
}