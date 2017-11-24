package win.log.greenUnion;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class Word {

	// 随机生成常见汉字
	public static String getRandomChar() {
		String str = "";
		int highCode;
		int lowCode;

		Random random = new Random();

		highCode = (176 + Math.abs(random.nextInt(39))); // B0 + 0~39(16~55)
															// 一级汉字所占区
		lowCode = (161 + Math.abs(random.nextInt(93))); // A1 + 0~93 每区有94个汉字

		byte[] b = new byte[2];
		b[0] = (Integer.valueOf(highCode)).byteValue();
		b[1] = (Integer.valueOf(lowCode)).byteValue();

		try {
			str = new String(b, "GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}

	/**
	 * 生成随机字符串cn
	 * 
	 * @param length
	 * @return
	 */
	public static String getRandomCnStr(int length) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(getRandomChar());
		}
		return sb.toString();
	}

	public static String getRandomStr(int length) {

		String base = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i < 10; i++) {
			str = getRandomChar();
			System.out.print(str + " ");
		}
	}
}