package SingleInheritance.librarymanagementsystem;

// Subclass
class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method to display book details
        System.out.println(" Author Info: \n Name = " + name + " \n Bio = " + bio);
    }
}
