package AlgorithmForLanqiao;

public class DiGui3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//求某个字符串的反串
		System.out.println(f("abcd"));

	}

	public static String f(String str) {
		// TODO 自动生成的方法存根
		if(str == null || str.length()<2){
			return str;
		}
		return f(str.substring(1)) + str.charAt(0);		//递归
	}
	

}
