public class SeatFinder {

	private char[][] compartment;
	private int d;



	public SeatFinder(char[][] compartment, int d){ // constructor of seats
		this.compartment = compartment;
		this.d = d-1;
	}

	boolean place() {
		boolean check = false;
		for (int n=0; n<this.compartment.length; n++){			//rows
			for (int k=0; k<this.compartment[n].length; k++){	 // seats
				if((isPlaceValid(n, k))&&(this.compartment[n][k]!='-')){			// checking
					this.compartment[n][k]='O';							// place guest
					return true;
				}
			}
		}
		return check;										// return result
	}
	boolean place(int peopleToPlace) {
		while(peopleToPlace>0){
			if (place()){
				peopleToPlace--;
			} else return false;
		}
		return true;
	}
	

	boolean isPlaceValid(int i, int j) {
		boolean check = true;
		for (int n=(0-d); n<=d; n++){	// all rows near
			if(check){
				for (int k=(0-d); k<=d; k++){	// all seats near
					if(((i+n)>=0)&&((j+k)>=0)){		// if existent
						if(((i+n)<compartment.length)&&((j+k)<compartment[i+n].length)){
							if ((this.compartment[i+n][j+k]=='O')){	// if taken
								check=false;						// set not available
								break;
							}
						}
					}
				}
			} else break;
		}
		if (compartment[i][j]!='#'){
			return false;
		} else return check;	   
}

char[][] getCompartment() {
	return this.compartment;
}

}