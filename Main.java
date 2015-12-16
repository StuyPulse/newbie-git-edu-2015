class Main {

	// Some tests
	public static void main(String args[]) {
		UnboundedArray uArray = new UnboundedArray();
		
		for(int i = 0; i < 10; i++)
			uArray.append(new Integer(i));
			
			
		for(int i = 0; i < uArray.size(); i++) 
			System.out.println(uArray.get(i));
	}
}
