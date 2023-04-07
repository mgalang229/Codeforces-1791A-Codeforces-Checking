import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			char letter = fs.next().charAt(0);
			String pattern = "codeforces";
			System.out.println((pattern.contains(letter + "") ? "YES" : "NO"));
		}
		fs.close();
	}
}
