public class DiceRunner{
	public static void main(String[]args){

		Die dice = new Die();
		Die dice2 = new Die();

		int counter = 0;
		int sum = 0;

		do{
			System.out.println();
			counter++;
			dice.roll();
			dice2.roll();

			System.out.println("Roll " + counter + ": Die 1 " + dice.toString()+ "\t Die 2 " + dice2.toString());

			sum = dice.getValue()+dice2.getValue();
		}while(sum!=2);




	}
}