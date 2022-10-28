import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		Scanner s=new Scanner(System.in);
		s.nextLine();
		int count=0;
		String str=s.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
				
			}
		}
		hm.put(str, count);
		System.out.println(hm);
		s.close();
	}

}
