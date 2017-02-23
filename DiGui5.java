package AlgorithmForLanqiao;

public class DiGui5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//求m个A，n个B能组成多少种排列方式
		System.out.println(f(1,2));

	}

	public static int f(int m, int n) {
		// TODO 自动生成的方法存根
		if(m==0 || n==0){
			return 1;
		}
		return f(m-1,n) + f(m,n-1);
	}

}
