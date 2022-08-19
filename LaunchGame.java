package game;
import java.util.*;
public class LaunchGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		u.knockout(1);
	}

}
