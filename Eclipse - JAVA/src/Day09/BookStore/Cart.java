package Day09.BookStore;

/**
 * 장바구니
 *
 */
public class Cart {
	// 책의 정보
	// 책 id (ISBN)
	// 수량
	// 총 가격
	private String[] bookInfo;
	private String bookID;
	private int count;
	private int totalPrice;
	
	public Cart() {
		
	}
	
	public Cart(String[] bookInfo) {
		this.bookInfo = bookInfo;
		this.bookID = bookInfo[0];
		this.count = 1;
		updateTotalPrice();
	}

	public String[] getBookInfo() {
		return bookInfo;
	}
	
	public void setBookInfo(String[] bookInfo) {
		this.bookInfo = bookInfo;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
		updateTotalPrice();	// 수량이 변경될 때, 총가격 다시 계산
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public void updateTotalPrice() {
		this.totalPrice = count * Integer.parseInt( bookInfo[2] );
	}
	
	
	
	

}
