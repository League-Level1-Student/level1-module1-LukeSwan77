package _05_vault;

public class Bond {
	Vault safe = new Vault();
public static void main(String[] args) {
	Bond james = new Bond();
	System.out.println(james.findCode());
}
 int findCode(){
	for (int i = 0; i < 999999; i++) {
		if(safe.tryCode(i)) {
			return(i);
		}
	}
	return -1;
	
}
}
