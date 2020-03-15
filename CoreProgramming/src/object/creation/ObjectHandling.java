package object.creation;

public class ObjectHandling {

	public static void main(String[] args) {

		ObjectHandling ref = new ObjectHandling();
		System.out.println(ref);
		ObjectHandling ref2 = new ObjectHandling();
		System.out.println(ref2);
		ref = new ObjectHandling();// re-instantiation
		System.out.println(ref);
	}

}
