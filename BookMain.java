package ExceptionTest;

public class BookMain {
	public static void main(String[] args) {
		
		//Creating array of Book type
		Book[] arr = new Book[6];
	
			arr[0] = new Book(101, "Programming With Java");
			arr[1] = new Book(102, "Web Development");
			arr[2] = new Book(103, "React");
			arr[3] = new Book(104, "C#");
			arr[4] = new Book(105, "Cloud");
		
			try {
				boolean isFound = findById(arr, 10);  //Calling method findById 
				if(isFound)
					System.out.println("Found");
			}
			catch(BookNotFoundException ex) {
				
				//System.out.println(ex.getMessage());
				ex.printStackTrace();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
	}
	
	// Method to match the given id with the  id of array of Book 
		public static boolean findById(Book[] books, int id) throws BookNotFoundException {
			
			for(int i = 0; i< books.length; i++) {
				
				if(books[i].getId() == id) 
					//System.out.println("Found");
					return true;
				
				else 
					throw new BookNotFoundException("Book not found.");
				
			}
			return false;
			
		}
}
