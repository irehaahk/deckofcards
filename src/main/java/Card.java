public class Card{
	//Card identifiers
	private String suit;
	private String value;
	
	//No point in using default constructor
	public Card(){
		suit = null;
		value = null;
	}
	
	//Main constructor, making a card based on suit and value
	public Card(int suitnum, int valuenum){
		//assign suit names based on suitnum
		if(suitnum == 0){
			suit = "spades";
		}
		else if(suitnum == 1){
			suit = "hearts";
		}
		else if(suitnum == 2){
			suit = "clubs";
		}
		else if(suitnum == 3){
			suit = "diamonds";
		}
		
		//assign card values base on valuenum
		if(valuenum == 1){
			value = "ace";
		}
		else if(valuenum == 2){
			value = "2";
		}
		else if(valuenum == 3){
			value = "3";
		}
		else if(valuenum == 4){
			value = "4";
		}
		else if(valuenum == 5){
			value = "5";
		}
		else if(valuenum == 6){
			value = "6";
		}
		else if(valuenum == 7){
			value = "7";
		}
		else if(valuenum == 8){
			value = "8";
		}
		else if(valuenum == 9){
			value = "9";
		}
		else if(valuenum == 10){
			value = "10";
		}
		else if(valuenum == 11){
			value = "jack";
		}
		else if(valuenum == 12){
			value = "queen";
		}
		else if(valuenum == 13){
			value = "king";
		}
	}
	//get functions for testing purposes
	String getvalue(){
		return value;
	}
	String getsuit(){
		return suit;
	}
}
