package be.pxl.ja.streamingservice.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtil {

	private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";
	private static final String ALGORITHM = "MD4";

	public static String encodePassword(String password) throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance(ALGORITHM);
		messageDigest.update(password.getBytes(), 0, password.length());
		return new BigInteger(1, messageDigest.digest()).toString(16);
	}

	public static boolean isValid(String providedPassword, String securedPassword) throws NoSuchAlgorithmException {
		return securedPassword.equals(encodePassword(providedPassword));
	}

	public static int calculateStrength(String password) {
		int score = 0;
		if (password.length() < 6) {
			return 0;
		}
		if (password.length() >= 10) {
			score += 2;
		} else {
			score += 1;
		}

		boolean hasDigit = false;
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasSpecialCharacter = false;

		for (int i = 0; i < password.length(); i++) {
			char character = password.charAt(i);
			hasDigit = hasDigit || Character.isDigit(character);
			hasLowerCase = hasLowerCase || Character.isLowerCase(character);
			hasUpperCase = hasUpperCase || Character.isDigit(character);
			hasSpecialCharacter = hasSpecialCharacter || SPECIAL_CHARACTERS.contains(String.valueOf(character));
		}
		if (hasDigit) {
			score += 2;
		}
		if (hasLowerCase) {
			score += 2;
		}
		if (hasUpperCase) {
			score += 2;
		}
		if (hasSpecialCharacter) {
			score += 2;
		}

		return score;
	}
}
