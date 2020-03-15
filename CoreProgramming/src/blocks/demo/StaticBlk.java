package blocks.demo;
public class StaticBlk {
	static {
		System.out.println("can be executed only once");
	}
	static {
		System.out.println("can be executed sequentially ");
	}
	static {
		System.out.println("executed before the main method");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main starts");
		System.out.println(DifferentBlk.a);// to access different class static block
		System.out.println(DifferentBlk.a);
		Class.forName("blocks.demo.Cases");// to access the static block directly wihtout accessing any members
	}

}

class DifferentBlk {
	static int a = 20;
	static {
		System.out.println("can be accesssed by accessing any member of this class");
	}
}

class Cases {
	static {
		System.out.println("using forName()");
	}
}
