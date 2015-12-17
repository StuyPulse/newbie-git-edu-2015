class UnboundedArray {
/* UnboundedArray.java
* This is basically us trying to make ArrayList, but it's gonna be better.
* We promise.
* Somebody replace this comment with a better description
*
*/

	private Object[] array = new Object[1];
	private int length = 0;
	private int indexToRemove = 0;

	private Object[] toNewArray (Object[] oldArray, int length) {
		/*
		 For pushing an array into a new array of a different size.
		 This is used for either adding a new element to the array, OR
		 decreasing the size
		*/

		Object[] newArray = new Object[length];
		for(int i = 0; i < oldArray.length; i++) {
			if (oldArray[i] != null) { // This cuts off, for decreasing the size of array.
				newArray[i] = oldArray[i];
			}
		}
		return newArray;
	}
	
	private Object[] compressArray (Object[] oldArray) {
		// Removes nulls and fits array. (Shifts over to replacen nulls)
		Object[] newArray = new Object[oldArray.length];
		int index = 0; // This keeps track of what index in newArray we are in
		for(int i = 0; i < oldArray.length; i++) {
			if (oldArray[i] != null) {
				newArray[index] = i;
				index++;
			}
	
		}
		return newArray;
	}
	
	public void remove(int index) {
		array[index] = null;
		array = compressArray(array);
		array = toNewArray(array, length - 1);
	}

	public void add(Object o, int index) {
		if (index >= length) {
			array = toNewArray(array, length + 1);
			// Set to length, because length is 1 greater than the maximum value.
			array[length] = o;
			length++;
		}else {
			array[index] = o;
		}
	
	}

	public void append(Object o) {
		add(o, array.length);
	}

	public int size() {
		return array.length;
	}

	public Object get(int index) {
		return array[index];
	}

	public void reverse () {
		Object placeholder1;
		Object placeholder2;{
		if (array.length % 2 == 0)
			{for (int i = 0; i < array.length / 2;){
				placeholder1 = array[i];
				placeholder2 = array[array.length - i];
				array[i] = placeholder2;
				array[array.length - i] = placeholder1;
				i++;}
				}
		else {for (int i = 0; i < (array.length / 2 + 1);){
				placeholder1 = array[i];
				placeholder2 = array[array.length - i];
				array[i] = placeholder2;
				array[array.length - i] = placeholder1;
				i++;}
			}
		}
	}
}
