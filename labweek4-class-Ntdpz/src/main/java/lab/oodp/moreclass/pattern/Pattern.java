package lab.oodp.moreclass.pattern;

public class Pattern {

	private int NumberOfCharacters;
	private char character;
	
	
	public Pattern(int N,char c) {
		NumberOfCharacters=N;
		character=c;
	}
	
	public int getNumberOfCharacters() {
		return NumberOfCharacters;
	}


	public void setNumberOfCharacters(int Number) {
		this.NumberOfCharacters=Number;
	}
	
	public void setCharacter(char Character) {
		this.character=Character;
	}
	
	public char getCharacter() {
		return character;
	}
	
	public String toString() {
		String n="";
		for(int i=0;i<NumberOfCharacters;i++) {
			n+=character;
		}
		return n;
	}
	
		
	
}

