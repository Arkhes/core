package blocks.demo;

public class InstanceBlk {
	{
		System.out.println(" object created");
	}
	public static void main (String [] args) {
		InstanceBlk ref = new InstanceBlk();
		InstanceBlk ref1 = new InstanceBlk();
		InstanceBlk ref2= new InstanceBlk();
		InstanceBlk ref3 = new InstanceBlk();
	}
}
