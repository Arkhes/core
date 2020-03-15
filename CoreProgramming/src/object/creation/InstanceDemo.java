package object.creation;

public class InstanceDemo {
	int count;
	String type;

	void display() {
		System.out.println("amoled display");
	}

	public static void main(String[] args) {
		InstanceDemo ref = new InstanceDemo();
		ref.count = 20;
		ref.type = "mobile";
		System.out.println(ref.count);
		InstanceDemo ref1 = new InstanceDemo();
		ref1.count = 20;
		ref1.type = "telephone";
		System.out.println(ref1.count);
		ref.display();
		ref1.display();
		Demo val = new Demo();
		System.out.println(val.ch);
	}

}
