package chap13;

public abstract class Monster implements CharaAll{
	private int hp;
	private int mp;
	private int atk;
	private String name;

	Monster(int input_hp, int input_mp, int input_atk, String input_nickname){
		this.setHp(input_hp);
		this.setMp(input_mp);
		this.setAtk(input_atk);
		this.setName(input_nickname);
		System.out.println(this.getName());
		System.out.println("体力:" + this.getHp() + "\tMP:"+ this.getMp() + "\t攻撃力:" + this.getAtk());

	}

	final void printStatus(){
		System.out.println(this.getName() + "\tの体力" + this.getHp() + "\tMP:"+ this.getMp() + "\t攻撃力" + this.getAtk());
	}


//基礎攻撃
	public abstract void attack(Chara target);

	//attackメソッドはこれコピペして使ってね

		/*
	public void attack(Chara target) {
		target.setHp(target.getHp() - this.getAtk());
		System.out.println(this.getName() + "の攻撃！");
		System.out.println(target.getName() + "に" + this.getAtk() + "のダメージ！");

		*/

	//飛び込み
		void setflyAttack(Chara target) {
			System.out.println(this.name + "は飛び上がった！");
			System.out.println(this.name + "の攻撃！\t");
			target.setHp((target.getHp() - this.atk * 3));
			System.out.println(this.name + "の攻撃！\t" + (this.atk * 3) + "のダメージ！");

		}

		void sleep() {
			this.setHp(this.getHp() + 500);
			System.out.println(this.name + "は、眠って回復した！");
		}

		void talk() {

		}

		void run() {
			System.out.println(this.name + "は逃げ出した！");
			System.out.println("戦闘は終了した…");
		}

		final void down() {
			System.out.println(this.name + "は倒れた！");
			System.out.println("戦闘は終了した…");
		}

		public int getHp() {
			return hp;
		}

		public void setHp(int hp) {
			this.hp = hp;
		}

		public int getMp() {
			return mp;
		}

		public void setMp(int mp) {
			this.mp = mp;
		}

		public int getAtk() {
			return atk;
		}

		public void setAtk(int atk) {
			this.atk = atk;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}


}
