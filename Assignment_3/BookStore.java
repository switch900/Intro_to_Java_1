/**
 * Assignment 3 - COMP 1409 Introduction To Java - 55053
 * 
 * @author Andrew Hewitson 
 * @version July 3, 2017
 */
public class BookStore
{
    private String storeName;
    private Book[] inventory;
    
    private static String GOOD_NAME = "Jason's Used Books";
    private static String BAD_NAME = "Taylor's Used Books";

    /**
     * Constructor for objects of class BookStore
     */
    public BookStore()
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
     * Constructor for Array of objects from Book class and creates storeName parameter
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
     * @param storeName - set new store name
     */
    public void setStoreName(String storeName)
    {
        if(storeName != null)
        {
            this.storeName = storeName;
        }
        if(storeName.equals(BAD_NAME))
        {
            this.storeName = GOOD_NAME;
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
     * @return the full name of the author who wrote the book by this title
     */
    public String getAuthorFullName(String title)
    {
        String fullName = null;
        for(int index = 0; index<inventory.length; index++)
        {
            if(title != null && title != "" && title.equalsIgnoreCase(inventory[index].getTitle()))
            {
                return inventory[index].getAuthorName();
            }
        }
        return fullName;
    }

    /**
     * @return an Array of all books written by an author with this last name
     */
    public Book[] getBooksWrittenBy(String authorLastName)
    {   
        int a = 0;
        for(int b = 0; b<inventory.length; b++)
        { 
            if(authorLastName.equalsIgnoreCase(inventory[b].getAuthor().getName().getLastName()))
                {                
                    a++;    
                }
            }            
        Book[] booksWrittenBy = new Book[a];
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
     * @return an Array of book titles containing wordInTitle
     */
    public String[] getBookTitlesContaining(String wordInTitle)
    {
        int firstIndex = 0;
        if (wordInTitle != null)
            for(int a = 0; a<inventory.length; a++)
            {
                if(inventory != null && wordInTitle != null && wordInTitle != "" && inventory[a].getTitle().contains(wordInTitle.toUpperCase()))
                {                                
                    firstIndex++;                     
                }
            }
        int newIndex = 0;
        String[] getBookTitlesContaining = new String[firstIndex];
        if (wordInTitle != null)
            for(int index = 0; index<inventory.length; index++)
            {
                if(inventory != null && wordInTitle != null && wordInTitle != "" && inventory[index].getTitle().contains(wordInTitle.toUpperCase()))
                {                 
                    getBookTitlesContaining[newIndex] = new String(inventory[index].getTitle());
                    newIndex++;  
                    if(inventory[index].getTitle().equals(null))
                    {
                        break;
                    }
                }
            }

        if(newIndex == 0)
        {
            return null;
        }
        else
        {
            return getBookTitlesContaining; 
        }
    }
}