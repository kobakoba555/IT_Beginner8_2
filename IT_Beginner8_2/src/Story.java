
import java.util.Scanner;

public class Story {

	public static void main(String args[]) {
		
		//8-2課題
		//1.名前、体力指定
		Hero h = new Hero("リンク", 100);	

		System.out.println("勇者が誕生した");
		System.out.println("名前:" + h.name);
		System.out.println("体力：" + h.hp);
		System.out.println("攻撃力:" + h.at);
		System.out.println("防御力:" + h.df);
		
		//2.名前、体力、攻撃力を指定
		Hero h2 = new Hero("マリオ", 200, 100);
		
		System.out.println("勇者が誕生した");
		System.out.println("名前:" + h2.name);
		System.out.println("体力：" + h2.hp);
		System.out.println("攻撃力:" + h2.at);
		System.out.println("防御力:" + h2.df);
		
		//3.名前を指定しない
		Hero h3 = new Hero();
	
	}

}
