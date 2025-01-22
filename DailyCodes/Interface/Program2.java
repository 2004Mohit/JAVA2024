interface Demo {
	void fun();
}
class Child implements Demo {

}
class Client {
	public static void main(String[] s) {
		Demo obj = new Demo();
	}
}
