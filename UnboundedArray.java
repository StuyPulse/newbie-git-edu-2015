class UnboundedArray {
/* UnboundedArray.java
* This is basically us trying to make ArrayList, but it's gonna be better.
* We promise.
* Somebody replace this comment with a better description
*
*/

	private Object[] array = new array[0];
	private int length = 0;

	
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
	
	
	
	public void add(Object o, int index) {
		if (index >= length) {
			array = t
		}else {
		
		}
		
	}
}
