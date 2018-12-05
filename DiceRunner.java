public class DiceRunner{
	public static void main(String[]args){
		DiceHolder cup = new DiceHolder();
		int getStat = 1;
		while(getStat != -1){
			Die die = new Die((int)(Math.random()*10)+1);
			getStat = cup.addDie(die);
			System.out.println(cup);
		}
		cup.shake();
		System.out.println("After shaking cup: "+cup);
	}
}