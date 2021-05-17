import java.util.ArrayList;
import java.util.List;

public class Backpack {

	private boolean[] backpack;
	private int residualSize;
	int backupSize;
	int[] mineralWeightGlobal;
	int[] mineralPrice;

	public Backpack(){
		this.residualSize=40;
		this.backupSize=40;
	}
	
	public boolean[] selectMineral(int[] mineralWeight, int[] mineralPrice){
		return selectMineral(this.residualSize, this.mineralWeightGlobal, this.mineralPrice);
	}
	public boolean[] selectMineral(int residualSize, int[] mineralWeight, int[] mineralPrice){
		double w, p;
		double h = 0;
		boolean r=false;
		this.residualSize = residualSize;
		this.backupSize = this.residualSize;
		this.mineralWeightGlobal = new int [mineralWeight.length];
		System.arraycopy(mineralWeight,  0, this.mineralWeightGlobal, 0, mineralWeight.length);
		this.mineralPrice = mineralPrice;
		boolean[] backpack = new boolean[mineralWeight.length];	
		this.backpack = new boolean[mineralWeight.length];	
		int pos = 0;
		

		for (int i=0; i<mineralWeight.length;){				//start // while?
			w=mineralWeight[i];p=mineralPrice[i];pos=i;				// set VAR to start
			if((backpack[i])|| this.residualSize==0){
				i++; break;					// break;
			}
			for (int j=0; j<mineralWeight.length; j++){				// compare start with rest
				h = (double)(w/p);
//				System.out.println(i+": "+j+": "+h+" = "+w+"/"+p);
				if(!(backpack[j]))
				if((mineralWeight[j]/mineralPrice[j])<=(h)){			// if value is higher as start value
					if((this.residualSize-mineralWeight[j])>=0){				// if weight is enough
						w=mineralWeight[j];p=mineralPrice[j];pos=j;			// save values
					}
				}
				if ((j==mineralWeight.length-1)){							// if every value was compared
					if (r){
						mineralWeight[j]=100;
						r=false;
						continue;
					} else{
					backpack[pos]=true;										// set boolean of saved value to true

//					System.out.print(this.residualSize+" - "+ mineralWeight[pos]+ " = ");
					this.residualSize-=mineralWeight[pos];						// reduce rest weight
//					System.out.println(this.residualSize);
					}
				} 
			}
			
		}
		this.backpack = backpack;
		return backpack;										// return boolean of taken minerals
	}

	
	public void newMineralsFound (int [] mineralWeight , int [] mineralPrice ){
		int[] allweights = new int[mineralWeightGlobal.length + mineralWeight.length];			// create array with all weights or prices
		int[] allprices = new int[this.mineralPrice.length + mineralPrice.length];
		int[] weight = getMineralWeight();
		if(mineralWeight.length>0){
		for(int i=0; i<mineralWeight.length; i++ ){
			allweights[i]=mineralWeight[i];
			allprices[i]=mineralPrice[i];
		}
		for(int j=mineralWeight.length; j<allweights.length; j++){
			allweights[j]=weight[j-mineralWeight.length];
			allprices[j]=mineralPrice[j-mineralPrice.length];
		}
		selectMineral(this.backupSize, allweights, allprices);
		}
		
	}


























	public int [] getMineralWeight (){
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<this.backpack.length; i++){
			if (this.backpack[i]){
				list.add(this.mineralWeightGlobal[i]);
			}
		}
		int[] weight = new int[list.size()];
		for (int i=0; i<list.size(); i++){
			weight[i] = list.get(i).intValue();
		} 
		return weight;
	}

	public int [] getMineralPrice (){
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<this.backpack.length; i++){
			if (this.backpack[i]){
				list.add(this.mineralPrice[i]);
			}
		}
		int[] price = new int[list.size()];
		for (int i=0; i<list.size(); i++){
			price[i] = list.get(i).intValue();
		} 
		return price;
	}

	public int getResidualSize (){	
		return this.residualSize;
	}


	public void setResidualSize(int residualSize) {
		selectMineral(residualSize, mineralWeightGlobal, mineralPrice);
	}
}




