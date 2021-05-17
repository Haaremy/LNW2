
import org.junit.Test;

public class BackpackTest {
	
	public void ausgabe(Backpack Rucksack, boolean[] taken, int[] weights, int[] prices, int size){
		for(int i=0; i<taken.length; i++){
			System.out.print(taken[i]+" ");
		}
		System.out.println();
		int j=0;
		for(int i=0; i<taken.length; i++){
			if (taken[i]){
			System.out.print(weights[j]+":"+prices[j]+"  ");
			j++;
			} else System.out.print("      ");
		}
		System.out.println("Size remain: "+size+"/"+Rucksack.backupSize);
		System.out.println("-------------------------------------------------");
	}

	@Test
	public void test1() {
		int[] mineralWeight = {2, 5, 1, 2, 1, 2, 2, 1};
		//					----------------------------
		 int[] mineralPrice = {1, 5, 4, 1, 4, 3, 1, 4};	
		Backpack Rucksack = new Backpack();	
		System.out.println("1)");
		ausgabe(Rucksack, Rucksack.selectMineral( 7, mineralWeight, mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());
	}
	
	@Test
	public void test2() {
		int[] mineralPrice = {};
		int[] mineralWeight = {};
		Backpack Rucksack = new Backpack();	

		System.out.println("2)");
		ausgabe(Rucksack, Rucksack.selectMineral(40, mineralWeight, mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());
	}
	
	@Test
	public void test3() {
		int[] mineralPrice = {1, 1, 15, 15};
		int[] mineralWeight = {2, 2, 5, 5};
		Backpack Rucksack = new Backpack();	

		System.out.println("3)");
		ausgabe(Rucksack, Rucksack.selectMineral(40, mineralWeight, mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());
	}
	
	@Test
	public void test4() {
		int[] mineralPrice = {8, 8, 15, 1};
		int[] mineralWeight = {4, 4, 5, 2};
		Backpack Rucksack = new Backpack();	
		System.out.println("4)");
		ausgabe(Rucksack, Rucksack.selectMineral(9, mineralWeight, mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());
	}
	
	@Test
	public void test5() {
		int[] mineralPrice = {8, 8, 15, 4};
		int[] mineralWeight = {4, 4, 5, 1};
		Backpack Rucksack = new Backpack();	

		System.out.println("5)");
		ausgabe(Rucksack, Rucksack.selectMineral(10, mineralWeight, mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());
	}
	
	@Test
	public void test6() {
		int[] mineralPrice = {};
		int[] mineralWeight = {};
		int[] mineralPrice2 = {1, 8, 1};
		int[] mineralWeight2 = {2, 4, 2};
		Backpack Rucksack = new Backpack();	

		System.out.println("6)");
		ausgabe(Rucksack, Rucksack.selectMineral(6, mineralWeight, mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());
		System.out.println("6.1)");
		Rucksack.newMineralsFound(mineralWeight2, mineralPrice2);
		Rucksack.setResidualSize(16);
		ausgabe(Rucksack, Rucksack.selectMineral(Rucksack.backupSize, Rucksack.mineralWeightGlobal, Rucksack.mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());	
	}
	
	@Test
	public void test7() {
		int[] mineralPrice = {1, 3, 1};
		int[] mineralWeight = {2, 2, 2};
		int[] mineralPrice2 = {};
		int[] mineralWeight2 = {};
		Backpack Rucksack = new Backpack();	
		System.out.println("7)");
		ausgabe(Rucksack, Rucksack.selectMineral(12, mineralWeight, mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());
		System.out.println("7.1)");
		Rucksack.newMineralsFound(mineralWeight2, mineralPrice2);
		Rucksack.setResidualSize(2);
		ausgabe(Rucksack, Rucksack.selectMineral(Rucksack.backupSize, Rucksack.mineralWeightGlobal, Rucksack.mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());	
	}
	
	@Test
	public void test8() {
		int[] mineralPrice = {1, 8, 1};
		int[] mineralWeight = {2, 4, 2};
		int[] mineralPrice2 = {1, 8, 1};
		int[] mineralWeight2 = {2, 4, 2};
		Backpack Rucksack = new Backpack();	
		System.out.println("8)");
		ausgabe(Rucksack, Rucksack.selectMineral(15, mineralWeight, mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());
		System.out.println("8.1)");
		Rucksack.newMineralsFound(mineralWeight2, mineralPrice2);
		Rucksack.setResidualSize(16);
		ausgabe(Rucksack, Rucksack.selectMineral(Rucksack.backupSize, Rucksack.mineralWeightGlobal, Rucksack.mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());	
	}
	
	@Test
	public void test9() {
		int[] mineralPrice = {1, 8, 1};
		int[] mineralWeight = {2, 4, 2};
		int[] mineralPrice2 = {1, 8, 1};
		int[] mineralWeight2 = {2, 4, 2};
		Backpack Rucksack = new Backpack();	
		System.out.println("9)");
		ausgabe(Rucksack, Rucksack.selectMineral(19, mineralWeight, mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());
		System.out.println("9.1)");
		Rucksack.newMineralsFound(mineralWeight2, mineralPrice2);
		Rucksack.setResidualSize(16);
		ausgabe(Rucksack, Rucksack.selectMineral(Rucksack.backupSize, Rucksack.mineralWeightGlobal, Rucksack.mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());	
	}
	
	@Test
	public void test10() {
		int[] mineralPrice = {1, 8, 1};
		int[] mineralWeight = {2, 4, 2};
		int[] mineralPrice2 = {1, 8, 1, 5, 15};
		int[] mineralWeight2 = {2, 4, 2, 5, 5};
		Backpack Rucksack = new Backpack();
		System.out.println("10)");
		ausgabe(Rucksack, Rucksack.selectMineral(100, mineralWeight, mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());
		System.out.println("10.1)");
		Rucksack.newMineralsFound(mineralWeight2, mineralPrice2);
		Rucksack.setResidualSize(6);
		ausgabe(Rucksack, Rucksack.selectMineral(Rucksack.backupSize, Rucksack.mineralWeightGlobal, Rucksack.mineralPrice),Rucksack.getMineralWeight(),Rucksack.getMineralPrice(),Rucksack.getResidualSize());	
	}

}
