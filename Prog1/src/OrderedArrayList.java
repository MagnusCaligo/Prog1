import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class OrderedArrayList<E> implements OrderedListADT<E>{
	
	private int currentSize;
	private E[] storage;
	private long sequenceNumber;
	private int maxSize;
	
	public OrderedArrayList(int size){
		this.maxSize = size;
		storage = (E[]) new Object[size];
		currentSize = 0;
	}
	
	public String toString(){
		return Arrays.toString(storage);
	}

	@Override
	public void insert(E obj) {
		storage[currentSize++] = obj;
		
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
		this.currentSize = 0;
	}

	@Override
	public boolean isEmpty() {
		return !(this.currentSize>0);
	}

	@Override
	public int size() {
		return this.currentSize;
	}

	@Override
	public Iterator<E> iterator() {
		return new IteratorHelper();
	}
	
	@Override
	public boolean isFull() {
		return this.currentSize == this.maxSize;
	}
	
	public int findInsertionPoint(E obj, int min, int max){
		int mid = (min + max)/2;
		if(min > max)
			return min; 
		if(((Comparable<E>)obj).compareTo(storage[mid])<=0)
			return findInsertionPoint(obj, mid+1, max);
		return findInsertionPoint(obj, min, mid-1);
	}
	
	class IteratorHelper implements Iterator<E>{
		private int iterIndex;
		private long modCheck;
		
		public IteratorHelper(){
			iterIndex = 0;
			modCheck = sequenceNumber;
		}

		@Override
		public boolean hasNext() {
			if(modCheck != sequenceNumber) throw new ConcurrentModificationException();
			return iterIndex < currentSize;
		}

		@Override
		public E next() {
			if(!hasNext()) throw new NoSuchElementException();
			return storage[iterIndex++];
		}
		
	}

	

}
