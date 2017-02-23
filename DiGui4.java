package AlgorithmForLanqiao;

public class DiGui4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//杨辉三角求第m行第n个元素（m n均从0开始）
		System.out.println(f(4,3));

	}
	public static int f(int m, int n){
		if(n==0 || m==n)
			return 1;
		return f(m-1,n) + f(m-1,n-1);
		
	}

}
