package oop.Encapulation;

class bank {

	private int account = 10000;
	private String name = "Wei";
	private boolean marriage = true;

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMarriage() {
		return marriage;
	}

	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}

}

public class testCallEncapulationEx2 {

	public static void main(String[] args) {
		bank BigTree = new bank();
		int deposit = BigTree.getAccount();
		System.out.println("deposit:" + deposit);
		BigTree.setAccount(25000);
		deposit = BigTree.getAccount();
		System.out.println("deposit:" + deposit);
	}

}
