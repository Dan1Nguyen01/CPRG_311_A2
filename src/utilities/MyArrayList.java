package utilities;

import java.util.NoSuchElementException;

public class MyArrayList<E> implements ListADT<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 105230250866964144L;
	private E[] array = null;
	private int size;

	public MyArrayList() {
		array = (E[]) new Object[10];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		array = null;

	}

	@Override
	public boolean add(int index, E toAdd) throws NullPointerException, IndexOutOfBoundsException {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		if (array == null) {
			throw new NullPointerException();
		}
		if (size < array.length) {
			for (int i = size - 1; i > 0; i--) {
				array[i + 1] = array[i];
			}
			array[index] = toAdd;

			size++;
			return true;
		}
		return false;
	}

	@Override
	public boolean add(E toAdd) throws NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(ListADT<? extends E> toAdd) throws NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(Object toRemove) throws NullPointerException {
		if (array== null) {
			throw new NullPointerException();
		}
		for(int i=0; i<size; i++) {
			if(array[i]== toRemove) {
				array[i] = array[i+1];
			}
		}
		return null;
	}

	@Override
	public E set(int index, E toChange) throws NullPointerException, IndexOutOfBoundsException {
		if (array == null) {
			throw new NullPointerException();
		}
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();

		}
		if (array != null) {
			array[index] = toChange;
		}
		return array[index];
	}

	@Override
	public boolean isEmpty() {
		if (array != null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean contains(E toFind) throws NullPointerException {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == toFind) {
				return true;
			}
		}
		return false;
	}

	@Override
	public E[] toArray(E[] toHold) throws NullPointerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new MyArrayListIterator();
	}

	private class MyArrayListIterator implements Iterator {
		private int pos;
		private int size;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return pos < size;
		}

		@Override
		public E next() throws NoSuchElementException {
			if (pos >= size) {
				throw new NoSuchElementException();
			}
			E toReturn = array[pos++];
			return toReturn;
		}

	}

}
