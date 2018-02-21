package prob04;

public class StringUtil {
	public static String concatenate( String[] str ) {
		StringBuilder sb = new StringBuilder();
		for(String s: str) {
			sb.append(s);
		}
		return sb.toString();
	}
	
}
