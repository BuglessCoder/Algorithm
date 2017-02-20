package AlgorithmForLanqiao;

public class DiGui2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//求n个元素的全排列（递归+回溯）
		char[] data = "abc".toCharArray();
		f(data,0);

	}

	private static void f(char[] data, int k) {
		// TODO 自动生成的方法存根
	
		char temp;
		for(int i=k;i<data.length;i++){
			
			temp = data[k];			//试探
			data[k] = data[i];
			data[i] = temp;
			
			f(data,k+1);			//递归
			
			temp = data[k];			//回溯
			data[k] = data[i];
			data[i] = temp;
			
		}
		
		if(k == data.length){
			for(int i=0;i<data.length;i++){
				System.out.print(data[i] + " ");
			}
			System.out.println();
		}
		
	}

}
