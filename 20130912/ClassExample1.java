
public class ClassExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GoodsStock obj;
		GoodsStock obj1;
			//obj = new GoodsStock();
			//GoodsStock obj = new GoodsStock();
			//GoodsStock obj1 = new GoodsStock();
			
			//obj.goodsCode = "52135";
			//obj.stockNum = 200;
		
			obj = new GoodsStock("52135",  200);
			GoodsStock obj1 = new GoodsStock();
			
			System.out.println("상품코드 : " + obj.goodsCode);
			System.out.println("재고수량 : " + obj.stockNum);
			
			obj.addStock(100);
			
			System.out.println("상품코드 : " + obj.goodsCode);
			System.out.println("재고수량 : " + obj.stockNum);
			
			obj.substractStock(200);
			
			System.out.println("상품코드 : " + obj.goodsCode);
			System.out.println("재고수량 : " + obj.stockNum);
			
	}

}
