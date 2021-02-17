package chap13;

public class Hero1 extends Chara{

	Hero1(int input_hp, int input_mp, int input_atk, String input_nickname) {
		super(input_hp, input_mp, input_atk, input_nickname);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void attack(chap13.Monster target) {
		target.setHp(target.getHp() - this.getAtk());
		System.out.println(this.getName() + "の攻撃！");
		System.out.println(target.getName() + "に" + this.getAtk() + "のダメージ！");
		}

	void specialAttack(Monster target) {
		target.setHp(target.getHp() - this.getAtk() * 5);
		System.out.println(this.getName() + "の必殺剣！！！");
		System.out.println(target.getName() + "に" + (this.getAtk() * 10) + "のダメージ！！！");

	}




}
