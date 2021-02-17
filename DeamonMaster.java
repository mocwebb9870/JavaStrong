package chap13;

public class DeamonMaster extends Monster{

	DeamonMaster(int input_hp, int input_mp, int input_atk, String input_nickname) {
		super(input_hp, input_mp, input_atk, input_nickname);

	}



	@Override
	public void attack(Chara target) {
		target.setHp(target.getHp() - this.getAtk());
		System.out.println(this.getName() + "の攻撃！");
		System.out.println(target.getName() + "に" + this.getAtk() + "のダメージ！");


	}

/*こういう処理だとコメントの後に処理という形式が良さそう？
 * 処理の後コメントだともう一度割った数字が出てしまう
 */
	void DarkWave(Chara target) {
		this.setMp(this.getMp() - 100);
		System.out.println(this.getName() + "は闇の波動を解き放った！");
		System.out.println(target.getName() + "のHPが" + (target.getHp() / 2) + "減った！");
		target.setHp(target.getHp() / 2);
	}

//多段ヒット攻撃にしたい！
	void MeteorBlast(Chara target) {
		System.out.println(this.getName() + "は流星の如き拳を叩きつけてきた！");
	}

	public void talk1() {
		System.out.println("あああああ");

	}

}
