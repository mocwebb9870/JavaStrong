package chap13;

public class Chap13_Main {

	public static void main(String[] args) {

		//文字数長すぎ版
		//Hero1 meny = new Hero1(1000, 100, 300, "ああああああああああああああああ");

		Hero1 meny = new Hero1(500, 100, 300, "ああああ");
		DeamonMaster demo = new DeamonMaster(5000,2000,300,"デーモンマスター");
		System.out.println();

		meny.smash(demo);
		demo.attack(meny);
		System.out.println();

		meny.printStatus();
		demo.printStatus();
		System.out.println();

		demo.DarkWave(meny);
		meny.printStatus();
		System.out.println();
		
		demo.talk1();
		

	}

}
