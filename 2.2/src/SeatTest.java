import org.junit.Test;

public class SeatTest {
	private char[][] seat;

	public void printer(){
		for (int n=0; n<seat.length; n++){			//rows
			System.out.println();
			for (int k=0; k<seat[n].length; k++){
				System.out.print(seat[n][k]);
			}
		}
		System.out.println();System.out.println();
	}

	@Test
	public void test1() {
		char [][] seats = {
				{'O','#','#','#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#','#','#','#'},
				{'#','#','#','#','O','#','#','#','O','#'},
				{'#','#','#','#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#','#','#','#'}};
		SeatFinder train1 = new SeatFinder(seats, 4);

		if(train1.place(4)){
			System.out.print("Platz gefunden! Test1");
			seat = train1.getCompartment();
			printer();
		} else System.out.println("Kein Platz! 1");
	}

	@Test
	public void test2() {
		char [][] seats = {
				{'O','-','-','-','-','-','-','-','-','-'},
				{'#','#','#','#','#','#','#','#','#','#'}};
		SeatFinder train1 = new SeatFinder(seats, 2);

		if(train1.place(2)){
			System.out.print("Platz gefunden! Test2");
			seat = train1.getCompartment();
			printer();
		} else System.out.println("Kein Platz! 2");
	}
	
	@Test
	public void test3() {
		char [][] seats = {
				{'O','#'},{'#','#'}};
		SeatFinder train1 = new SeatFinder(seats, 2);

		if(train1.place(2)){
			System.out.print("Platz gefunden! Test3");
			seat = train1.getCompartment();
			printer();
		} else System.out.println("Kein Platz! 3");
	}
	@Test
	public void test4() {
		char [][] seats = {
				{}};
		SeatFinder train1 = new SeatFinder(seats, 2);

		if(train1.place(2)){
			System.out.print("Platz gefunden! Test4");
			seat = train1.getCompartment();
			printer();
		} else System.out.println("Kein Platz! 4");
	}
	@Test
	public void test5() {
		char [][] seats = {
				{'-'}};
		SeatFinder train1 = new SeatFinder(seats, 2);

		if(train1.place(2)){
			System.out.print("Platz gefunden! Test5");
			seat = train1.getCompartment();
			printer();
		} else System.out.println("Kein Platz! 5");
	}
	@Test
	public void test6() {
		char [][] seats = {
				{'#'}};
		SeatFinder train1 = new SeatFinder(seats, 0);

		if(train1.place()){
			System.out.print("Platz gefunden! Test6");
			seat = train1.getCompartment();
			printer();
		} else System.out.println("Kein Platz! 6");
	}
	@Test
	public void test7() {
		char [][] seats = {
				{'#','#'}};
		SeatFinder train1 = new SeatFinder(seats, 2);

		if(train1.place()){
			System.out.print("Platz gefunden! Test7");
			seat = train1.getCompartment();
			printer();
		} else System.out.println("Kein Platz! 7");
	}
	@Test
	public void test8() {
		char [][] seats = {
				{'#','#','#','#','#','#','#','#','#','-'},
				{'#','#','#','#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#','-','-','-'}};
		SeatFinder train1 = new SeatFinder(seats, 3);

		if(train1.place(4)){
			System.out.print("Platz gefunden! Test8");
			seat = train1.getCompartment();
			printer();
		} else System.out.println("Kein Platz! 8");
	}
	@Test
	public void test9() {
		char [][] seats = {
				{'O','-','-','-','-','-','-','-','-','-'},
				{'O','-','-','-','-'},
				{'#','#','#','#','#','#','#','#','#','#'}};
		SeatFinder train1 = new SeatFinder(seats, 2);

		if(train1.place(2)){
			System.out.print("Platz gefunden! Test9");
			seat = train1.getCompartment();
			printer();
		} else System.out.println("Kein Platz! 9");
	}
	@Test
	public void test10() {
		char [][] seats = {
				{}};
		SeatFinder train1 = new SeatFinder(seats, 1);

		if(train1.place()){
			System.out.print("Platz gefunden! Test10");
			seat = train1.getCompartment();
			printer();
		} else System.out.println("Kein Platz! 10");
	}
}
