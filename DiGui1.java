package AlgorithmForLanqiao;

public class DiGui1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//在n个球中任意取出m个（不放回），有多少种取法
		System.out.println(f(5,3));
		
	}
	
	public static int f(int n, int m){
		if(n<m)
			return 0;
		if(n==m)
			return 1;
		if(m==0)
			return 1;	//三个判断的顺序使得不用再判断n和0的关系
		
		return f(n-1,m-1) + f(n-1,m);	//自己假设一个特殊球x，以取不取出x为条件划分成两部分
		
	}

}

