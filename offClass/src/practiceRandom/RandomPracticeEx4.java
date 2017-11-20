package practiceRandom;

/*
 * get data from SQl command with specific order indicates as follows
 * (ignore space and spaces)
 * 
 * select
 * table name
 * column names
 * 
 * 
 * 2017.11.17 11:17
 * (Using Regular Expression[regx])
 * 
 */

class Data {
	String source = "   SELECT   ename  ,  bdate FROM    employee   ";

	String[] processData() {
		String p1 = source.trim();
		String p2 = p1.replaceAll(",", " ");
		String[] p3 = p2.split(" +");
		return p3;
	}
}

public class RandomPracticeEx4 {

	public static void main(String args[]) {
		String[] init = new Data().processData();
		System.out.println("Start");
		System.out.println("----------------");
		int start = 0;
		int bp = 0;
		for (int i = 0; i < init.length; i++) {
			if (init[i].equalsIgnoreCase("select")) {
				System.out.println(init[i]);
				start = i + 1;
			} else if (init[i].equalsIgnoreCase("from")) {
				System.out.println(init[i + 1]);
				bp = i;
				for (int k = start; k < bp; k++) {
					System.out.println(init[k]);
				}
				System.out.println("----------------");
				System.out.println("Finished");				
			}

		}

	}

}
