package day_4.ass33;

public class StringMock {
	String capacity;
	public StringMock(){
	}
	public StringMock(String capacity){
		this.capacity=capacity;
	}
	/** Description: method returns the position of the character if
	 * char to be searched is present in the String otherwise it
	 * returns -1
	 * @param string
	 * @param searchItem
	 * @return int
	 */
	@Deprecated
	public int search(String string,char searchItem){
		//declare loop variable
		int index ;
		//convert the string to char array
		char [] charArray = string.toCharArray();
		//iterate over the char array to search for the character
		for(index=0; index < charArray.length; index ++){
			if(charArray[index]==searchItem)
				return index;
		}
		return index;
	}
}