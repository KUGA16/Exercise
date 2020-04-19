package Exercise;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class exercise1 {
	public static final int FROM = -10000;
	public static final int TO = 10000;
	public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 入力パラメータを読み込む
        String input = br.readLine();
        String[] param = input.split(" ");//入力値を空白で分解する

        int num1 = Integer.parseInt(param[0]);
        int num2 = Integer.parseInt(param[1]);

        if (!isRange(num1)) {
        	System.out.println("1つ目の値が1万以内ではないです");
        	return;
        }
        if (!isRange(num2)) {
        	System.out.println("2つ目の値が1万以内ではないです");
        	return;
        }

        int number = num1 + num2;
        System.out.println(number);

    }
	public static boolean isRange(int num) {
		return (num >= FROM && num <= TO);
	}
}

