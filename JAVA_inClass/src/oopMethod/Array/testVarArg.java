package oopMethod.Array;

public class testVarArg {

	void sum(int [][] x) {
		
		int total = 0;
		for(int[] gg : x) {
			for(int z : gg) {
			total+=z;
		}
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		testVarArg action = new testVarArg();
		//action.sum(1, 7, 45, 6, 3, 7, 3, 87987);
		int[][] values = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		action.sum(values);

	}

}
