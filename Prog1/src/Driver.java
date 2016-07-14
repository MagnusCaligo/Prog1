
public class Driver {
	
	public static void main(String args[]){
		Driver driver = new Driver();
		driver.test();
	}
	
	public void test(){
		OrderedArrayList<TestClass> a = new OrderedArrayList<TestClass>(10);
		for(int i = 0; i < 9; i++)
			a.insert(new TestClass());
		TestClass m = new TestClass();
		m.test = 60;
		a.insert(m);
		System.out.println(a);
		a.remove(m);
		System.out.println(a);

	}
	
	class TestClass implements Comparable<TestClass>{
		
		public int test;
		
		public TestClass(){
			test = (int)(Math.random()*100) + 11;
		}
		
		public String toString(){
			return Integer.toString(test);
		}

		@Override
		public int compareTo(TestClass o) {
			return this.test - o.test;
		}
		
	}

}
