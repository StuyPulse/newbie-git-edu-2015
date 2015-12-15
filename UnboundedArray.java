class UnboundedArray {
	private Object[] array;
	private int length = 0;
	
	public UnboundedArray () {
		
	}
	private Object[] toNewArray (Object[] oldArray, int length) {
		/*
		/ For pushing an array into a new array of a different size.
		/ This is used for either adding a new element to the array, OR
		/ decreasing the size
		*/
		Object[] newArray = new Object[length];
		for(int i = 0; i < oldArray.length; i++) {
			if (oldArray[i] != null) { // This cuts off, for decreasing the size of array.
				newArray[i] = oldArray[i];
			}
		}
	}
	
	
	
	public void add(Object o, int index) {
		
		
	}
}


