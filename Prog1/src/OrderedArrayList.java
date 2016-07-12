import java.util.Iterator;

public class OrderedArrayList<E> implements OrderedListADT<E>{
	
	private int curentSize;

	@Override
	public void insert(E obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(E obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeMin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeMax() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(E obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int find(E obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(E obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<E> iterator() {
		return new IteratorHelper();
	}
	
	class IteratorHelper implements Iterator<E>{
		private int iterIndex;
		
		public IteratorHelper(){
			iterIndex = 0;
		}

		@Override
		public boolean hasNext() {
			return iterIndex < curentSize;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
