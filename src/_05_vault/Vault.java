package _05_vault;

import java.util.Random;

public class Vault {
private int code = new Random().nextInt(999999);
public boolean tryCode(int guess) {
	if (guess == code) {
		return true;
	}
		return false;
}
}
