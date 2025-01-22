interface MacD {
	default public void burger() {
		System.out.println("Making Burger");
	}
	void revenue();
}
class SinhadMacD implements MacD {
	public void revenue() {
		System.out.println("1 CR");
	}
}

