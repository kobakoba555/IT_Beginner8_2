
public class Hero {

	String name;	//名前
	int hp;			//体力
	int at;			//攻撃力
	int df;			//防御力
	static int money = 100;	//静的メンバ
	
	//8-2課題
	//コンストラクタのオーバーロード
	
	//コンストラクタ1:名前、体力を指定
	Hero(String name, int hp){
		this.name = name;
		this.hp = hp;
		this.at = 30;
		this.df = 20;
	}
	
	//コンストラクタ2:名前、体力、攻撃力を指定
	Hero(String name, int hp, int at){
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.df = 20;
	}
	
	//名前を指定しない場合、エラーを投げる
	Hero(){
		throw new IllegalArgumentException("名前未指定のため、インスタンス化できません。");
	}
	
}
