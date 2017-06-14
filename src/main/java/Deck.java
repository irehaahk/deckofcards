public class Deck{
	//Card Array
	private Card[] deck;
	
	//Deck's top card location
	private int topcardIndex;
	
	//Constructor
	public Deck(){
		//give values to deck and index (0th index is the top card)
		deck = new Card[52];
		topcardIndex=0;
		//n keeps track of index to create a new card in		
		int n=0;
		//loop through each suit and value and create 52 unique cards
		for(int i = 0; i<4; i++){
			for(int j=1; j<14; j++){
				deck[n] = new Card(i,j);
				n++;
			}
		}
	}
	
	//Shuffling algorithm: for each card in the deck, switch position with random index in the deck
	//Should sufficiently & randomly shuffle all cards in O(n)
	public void shuffle(){
		for(int i=0; i<51; i++){
			int random = (int)(Math.floor(Math.random()*52));
			Card temp = deck[i];
			deck[i]=deck[random];
			deck[random]=temp;
		}
		//reset the index
		topcardIndex = 0;
	}
	
	//gets the top card from the deck
	public Card dealOneCard(){
		//if there are no more cards "left" in the deck, returns null
		if(topcardIndex>51){
			return null;
		}
		
		//otherwise, get the top card and move the index
		Card temp = deck[topcardIndex];
		topcardIndex++;
		return temp;
	}
}
