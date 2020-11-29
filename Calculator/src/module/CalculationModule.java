package module;

import java.util.ArrayList;

public class CalculationModule {
	//branch feature/./3
	//created arraylist for storign data #but only arraylist creation and not much on calc
	public ArrayList<String> addValue(ArrayList<String> list, String num, String key){
		list.add(num);
		list.add(key);
		return list;
	}


	//branch feature/./2
	public int add(int i1, int i2) {
		return i1 + i2;
	}

	public int subtract(int i1, int i2) {
		return i1 - i2;
	}

	public int multiply(int i1, int i2) {
		return i1 * i2;
	}

	public int divide(int i1, int i2) {
		return i1 / i2;
	}
}
