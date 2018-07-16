/**
 * Assignment 3 - COMP 1409 Introduction To Java - 55053
 * 
 * @author Andrew Hewitson 
 * @version June 14, 2017
 */
public class BookStore
{
    private String storeName;
    private Book[] inventory;

    /**
     * Constructor for objects of class BookStore
     */
    public BookStore(){}
    { 
        inventory = new Book[20]; 

        inventory[0] = new Book(new Author(new Name("James", "Joyce", null), new Date(), new Date()), new Date(), "ULYSSES");
        inventory[1] = new Book(new Author(new Name("F.", "Fitzgerald", "Scott"), new Date(), new Date()), new Date(), "THE GREAT GATSBY");
        inventory[2] = new Book(new Author(new Name("James", "Joyce", null), new Date(), new Date()), new Date(), "A PORTRAIT OF THE ARTIST AS A YOUNG MAN");
        inventory[3] = new Book(new Author(new Name("Vladimir", "Nabokov", null), new Date(), new Date()), new Date(), "LOLITA"); 
        inventory[4] = new Book(new Author(new Name("Aldous", "Huxley", null), new Date(), new Date()), new Date(), "BRAVE NEW WORLD");
        inventory[5] = new Book(new Author(new Name("William", "Faulkner", "Scott"), new Date(), new Date()), new Date(), "THE SOUND AND THE FURY");
        inventory[6] = new Book(new Author(new Name("Joseph", "Heller", null), new Date(), new Date()), new Date(), "CATCH-22");
        inventory[7] = new Book(new Author(new Name("Arthur", "Koestler", null), new Date(), new Date()), new Date(), "DARKNESS AT NOON");
        inventory[8] = new Book(new Author(new Name("D.", "Lawrence", "H."), new Date(), new Date()), new Date(), "SONS AND LOVERS");
        inventory[9] = new Book(new Author(new Name("John", "Steinbeck", null), new Date(), new Date()), new Date(), "THE GRAPES OF WRATH");
        inventory[10] = new Book(new Author(new Name("Malcolm", "Lowry", null), new Date(), new Date()), new Date(), "UNDER THE VOLCANO");
        inventory[11] = new Book(new Author(new Name("Samuel", "Butler", null), new Date(), new Date()), new Date(), "THE WAY OF ALL FLESH");
        inventory[12] = new Book(new Author(new Name("George", "Orwell", null), new Date(), new Date()), new Date(), "1984");
        inventory[13] = new Book(new Author(new Name("Robert", "Graves", null), new Date(), new Date()), new Date(), "I, CLAUDIUS");
        inventory[14] = new Book(new Author(new Name("Virginia", "Woolf", null), new Date(), new Date()), new Date(), "TO THE LIGHTHOUSE");
        inventory[15] = new Book(new Author(new Name("Theodore", "Dreiser", null), new Date(), new Date()), new Date(), "AN AMERICAN TRAGEDY");
        inventory[16] = new Book(new Author(new Name("Carson", "McCullers", null), new Date(), new Date()), new Date(), "THE HEART IS A LONELY HUNTER");
        inventory[17] = new Book(new Author(new Name("Kurt", "Vonnegut", null), new Date(), new Date()), new Date(), "SLAUGHTERHOUSE-FIVE");
        inventory[18] = new Book(new Author(new Name("George", "Orwell", null), new Date(), new Date()), new Date(), "ANIMAL FARM");
        inventory[19] = new Book(new Author(new Name("W.", "Maugham", "Somerset"), new Date(), new Date()), new Date(), "OF HUMAN BONDAGE");           
    }

    /**
     * Constructor for Arry of objects from Book class
     */
    public BookStore(String storeName)
    {
        setStoreName(storeName);

        inventory = new Book[20]; 

        inventory[0] = new Book(new Author(new Name("James", "Joyce", null), new Date(), new Date()), new Date(), "ULYSSES");
        inventory[1] = new Book(new Author(new Name("F.", "Fitzgerald", "Scott"), new Date(), new Date()), new Date(), "THE GREAT GATSBY");
        inventory[2] = new Book(new Author(new Name("James", "Joyce", null), new Date(), new Date()), new Date(), "A PORTRAIT OF THE ARTIST AS A YOUNG MAN");
        inventory[3] = new Book(new Author(new Name("Vladimir", "Nabokov", null), new Date(), new Date()), new Date(), "LOLITA"); 
        inventory[4] = new Book(new Author(new Name("Aldous", "Huxley", null), new Date(), new Date()), new Date(), "BRAVE NEW WORLD");
        inventory[5] = new Book(new Author(new Name("William", "Faulkner", "Scott"), new Date(), new Date()), new Date(), "THE SOUND AND THE FURY");
        inventory[6] = new Book(new Author(new Name("Joseph", "Heller", null), new Date(), new Date()), new Date(), "CATCH-22");
        inventory[7] = new Book(new Author(new Name("Arthur", "Koestler", null), new Date(), new Date()), new Date(), "DARKNESS AT NOON");
        inventory[8] = new Book(new Author(new Name("D.", "Lawrence", "H."), new Date(), new Date()), new Date(), "SONS AND LOVERS");
        inventory[9] = new Book(new Author(new Name("John", "Steinbeck", null), new Date(), new Date()), new Date(), "THE GRAPES OF WRATH");
        inventory[10] = new Book(new Author(new Name("Malcolm", "Lowry", null), new Date(), new Date()), new Date(), "UNDER THE VOLCANO");
        inventory[11] = new Book(new Author(new Name("Samuel", "Butler", null), new Date(), new Date()), new Date(), "THE WAY OF ALL FLESH");
        inventory[12] = new Book(new Author(new Name("George", "Orwell", null), new Date(), new Date()), new Date(), "1984");
        inventory[13] = new Book(new Author(new Name("Robert", "Graves", null), new Date(), new Date()), new Date(), "I, CLAUDIUS");
        inventory[14] = new Book(new Author(new Name("Virginia", "Woolf", null), new Date(), new Date()), new Date(), "TO THE LIGHTHOUSE");
        inventory[15] = new Book(new Author(new Name("Theodore", "Dreiser", null), new Date(), new Date()), new Date(), "AN AMERICAN TRAGEDY");
        inventory[16] = new Book(new Author(new Name("Carson", "McCullers", null), new Date(), new Date()), new Date(), "THE HEART IS A LONELY HUNTER");
        inventory[17] = new Book(new Author(new Name("Kurt", "Vonnegut", null), new Date(), new Date()), new Date(), "SLAUGHTERHOUSE-FIVE");
        inventory[18] = new Book(new Author(new Name("George", "Orwell", null), new Date(), new Date()), new Date(), "ANIMAL FARM");
        inventory[19] = new Book(new Author(new Name("W.", "Maugham", "Somerset"), new Date(), new Date()), new Date(), "OF HUMAN BONDANGE");            
    }

    /**
     * @return store name
     */
    public String getStoreName()
    {
        return storeName;
    }

    /**
     * @param set new store name
     */
    public void setStoreName(String storeName)
    {
        if(storeName != null)
        {
            this.storeName = storeName;
        }
        if(storeName.equals("Taylor's Used Books"))
        {
            this.storeName = "Jason's Used Books";
        }
    }

    /**
     * @return how many books author with specific last name wrote
     */
    public int howManyBooksDidThisAuthorWrite(String authorLastName)
    {
        int sum = 0;  
        for(int index = 0; index < inventory.length; index++)  
        {
            if(authorLastName.equalsIgnoreCase(inventory[index].getAuthor().getName().getLastName()))
            {
                sum++;
            }
        }
        return sum;
    }

    /**
     * @return Author's full name by title
     */
    public String getAuthorFullName(String title)
    {
        String fullName = null;
        for(int index = 0; index<inventory.length; index++)
        {
            if(title != null && title != "" && title.equalsIgnoreCase(inventory[index].getTitle()))
            {
                // System.out.println(inventory[index].getAuthorName());
                return inventory[index].getAuthorName();
            }
        }
        return fullName;
    }

    /**
     * @return all books written by an author
     */
    public Book[] getBooksWrittenBy(String authorLastName)
    {      
        Book[] booksWrittenBy = new Book[inventory.length];
        int newIndex = 0;
        {
            for(int index = 0; index<inventory.length; index++)
            {
                if(authorLastName.equalsIgnoreCase(inventory[index].getAuthor().getName().getLastName()))
                {                
                    booksWrittenBy[newIndex] = new Book(inventory[index].getAuthor(),inventory[index].getDatePublished(),inventory[index].getTitle());
                    newIndex++;    
                }
            }   
            if(newIndex == 0)
            {
                return null;
            }
            else
            {
                return booksWrittenBy;
            }
        }
    }

    /**
     * @return first Book object written by an author with this first name
     */
    public Book getBookWrittenBy(String firstName)
    {   
        for(int index = 0; index< inventory.length; index++)
        {
            if(inventory[index] != null && inventory[index].getAuthor().getName().getFirstName().equalsIgnoreCase(firstName))
            {
                return inventory[index];
            }
        }
        return null;
    }

    /**
     * @return an array of book titles containing a specific word
     */
    public String[] getBookTitlesContaining(String wordInTitle)
    {
        String[] booksWithWordInTitle = new String[inventory.length];
        int newIndex = 0;
        if (wordInTitle != null)
        for(int index = 0; index<inventory.length; index++)
        {
            if(wordInTitle != null && wordInTitle != "" && inventory[index].getTitle().contains(wordInTitle.toUpperCase()))
            {   
                {
                    booksWithWordInTitle[newIndex] = new String(inventory[index].getTitle());
                    newIndex++;                      
                }           
            }
        }   
        if(newIndex == 0)
        {
            return null;
        }
        else
        {
            return booksWithWordInTitle;
        }
    }
}

