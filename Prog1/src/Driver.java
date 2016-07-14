
public class Driver {
	
	public static void main(String args[]){
		Driver driver = new Driver();
		driver.test();
	}
	
	public void test(){
		OrderedArrayList<Integer> a = new OrderedArrayList<Integer>(10);
		a.insert(1);
		a.insert(2);
		a.insert(2);
		a.insert(3);
		a.insert(4);
		a.insert(5);
		System.out.println(a);
	}

}
