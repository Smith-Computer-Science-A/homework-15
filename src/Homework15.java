public class Homework15 {

	/* This homework involves the creation of a new class; use the
	 * ToDoList.java file to complete the work.
	 * A ToDoList will have a name (String) and two ArrayLists. One ArrayList
	 * should hold String objects that represent the items on the to-do list.
	 * The other ArrayList should hold Integer objects that represent the items
	 * on the to-do list that have been completed.
	 */

	/* Problem 1:
	 * Write the instance variables for the ToDoList class. These should be
	 * a String for the name and two ArrayLists, as described above. All
	 * instance variables should be private.
	 */


	/* Problem2:
	 * Write a constructor for the ToDoList class. It
	 * should take in one parameter, a String representing the
	 * name of the to-do list. Ensure that you initialize all of
	 * the instance variables in the constructor.
	 */


	/* Problem 3:
	 * Write the addItem method for the ToDoList class. It should take in a
	 * String as a parameter and add it to the to-do list. It should not
	 * return anything.
	 */


	/* Problem 4:
	 * Write the checkOff method for the ToDoList class. It should take in
	 * an int and add that to the list representing items that have been
	 * completed. It should not return anything.
	 */


	/* Problem 5:
	 * Write the remainingItems method for the ToDoList class. It should not
	 * take in any parameters and should return the number of items in the
	 * to-do list that have NOT been completed.
	 */

	 public static void main(String[] args) {
 		boolean passed = true;

		System.out.println("Pass 1");

 		ToDoList todo = new ToDoList("Groceries");
		System.out.println("Pass 2");

		todo.addItem("Eggs");
		todo.addItem("Milk");
		if (todo.remainingItems() != 2) {
			passed = false;
			System.out.println("Fail 3");
		} else {
			System.out.println("Pass 3");
		}

		todo.checkOff(0);
		if (todo.remainingItems() != 1) {
			passed = false;
			System.out.println("Fail 4");
		} else {
			System.out.println("Pass 4");
		}

		todo.addItem("Cheese");
		if (todo.remainingItems() != 2) {
			passed = false;
			System.out.println("Fail 5");
		} else {
			System.out.println("Pass 5");
		}

  		if (passed) {
  			System.out.println("All Passed");
  		} else {
  			System.out.println("Failed");
  		}
 	}

}
