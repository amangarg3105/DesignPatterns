package visitorDesignPattern;

public class VisitorImpl implements Visitor {

	@Override
	public int visit(ItemElement itemElement) {
		// logic for book cost
		if (itemElement instanceof Book) {
			Book book = (Book) itemElement;
			int cost = 0;
			if (book.getPrice() > 50) {
				cost = book.getPrice() - 5;
			} else
				cost = book.getPrice();
			System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);
			return cost;
		} else if (itemElement instanceof Fruit) {
			Fruit fruit = (Fruit) itemElement;
			int cost = fruit.getPricePerKg() * fruit.getWeight();
			System.out.println(fruit.getName() + " cost = " + cost);
			return cost;
		}
		/*
		 * int cost = 0; // apply 5$ discount if book price is greater than 50 if
		 * (book.getPrice() > 50) { cost = book.getPrice() - 5; } else cost =
		 * book.getPrice(); System.out.println("Book ISBN::" + book.getIsbnNumber() +
		 * " cost =" + cost); return cost;
		 */
		return 0;
	}

	/*
	 * @Override public int visit(Fruit fruit) { // logic for Fruit cost int cost =
	 * fruit.getPricePerKg() * fruit.getWeight(); System.out.println(fruit.getName()
	 * + " cost = " + cost); return cost; }
	 */

}
