package chap13;

//private
public abstract class Chara implements CharaAll{
	private int hp;
	private int mp;
	private int atk;
	private String name;

	Chara(int input_hp, int input_mp, int input_atk, String input_nickname){
		if (input_nickname.length() >= 10) {
			throw new IllegalArgumentException("名前が長すぎます！");
		}else {
			this.setName(input_nickname);
		}

		this.setHp(input_hp);
		this.setMp(input_mp);
		this.setAtk(input_atk);
		//this.setName(input_nickname);
		System.out.println(this.getName() );
		System.out.println("体力:" + this.getHp() + "\tMP:"+ this.getMp() + "\t攻撃力:" + this.getAtk());

	}

	final void printStatus(){
		System.out.println(this.getName() + "\tの体力" + this.getHp() + "\tMP:"+ this.getMp() + "\t攻撃力" + this.getAtk());
	}



//基礎攻撃
	public abstract void attack(Monster target);

//attackメソッドはこれコピペして使ってね

	/*
	public void attack(Monster target) {
		target.setHp(target.getHp() - this.getAtk());
		System.out.println(this.getName() + "の攻撃！");
		System.out.println(target.getName() + "に" + this.getAtk() + "のダメージ！");

	*/

//定数ダメ
	void teisu(Monster target) {
		System.out.println(this.getName() + "の攻撃！" );
		this.setAtk((180));
		target.setHp(target.getHp() - this.getAtk());
	}

//飛び込み
	void flyAttack(Monster target) {
		System.out.println(this.getName() + "は飛び上がった！");
		System.out.println(this.getName() + "の攻撃！\t");
		target.setHp((target.getHp() - this.getAtk() * 3));
		System.out.println(this.getName() + "の攻撃！\t" + (this.getAtk() * 3) + "のダメージ！");

	}

//会心の一撃
	void smash(Monster target) {
		System.out.println(this.getName() + "の攻撃！\t" + "smaaaash!!");
		target.setHp(target.getHp() - this.getAtk() * 3);
		System.out.println(this.getAtk() * 3 + "のダメージ！");

	}

	//ここから状態異常
	void sleep() {
		this.setHp(this.getHp() + 500);
		System.out.println(this.getName() + "は、眠って回復した！");
	}

	/*
	 * これが数ターン持続する処理を書きたい！
	 * 今の自分ではChara.poisonをターン毎に書いていく手段しか思いつかない
	 */
	void poison() {
		System.out.println(this.getName() + "は毒に侵された！");
		this.setHp(this.getHp() - 200);

	}

	final void down() {
		System.out.println(this.getName() + "は倒れた！");
		System.out.println("戦闘は終了した…");
	}

	//
	final void run() {
		System.out.println(this.getName() + "は逃げ出した！");
		System.out.println("戦闘は終了した…");
	}

	final void talk() {

	}



	//ここからカプセル
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
