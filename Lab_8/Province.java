/**
 * Lab 8a - BCIT Student A01029917 - Course Comp-1409-0 Intro Software Development 1 - 55053
 * Date Class
 * 
 * @author Andrew Hewitson
 * @version June 6,2017
 */
public class Province
{
    private String province;
    private String capital;
    private int populationInMillions;

    public static final int DEFAULT_POPULATION = 4;
    public static final String DEFAULT_PROVINCE = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";

    /**
     * Default Constructor for Province Class
     */
    public Province()
    {
        populationInMillions= DEFAULT_POPULATION;
        province = DEFAULT_PROVINCE;
        capital =DEFAULT_CAPITAL;
    }

    /**
     * Constructor for objects of Province Class
     */
    public Province(String province, String capital, int populationInMillions)
    {
        if(isValidPopulation(populationInMillions) && isValidProvince(province) && isValidCapitalCity(capital))
        {
            this.populationInMillions = populationInMillions;
            this.province = province;
            this.capital = capital;
        }
        else
        {
            this.populationInMillions = DEFAULT_POPULATION;
            this.province = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
        }
    }

    /**
     * @param get Province
     */
    public String getProvince()
    {
        return province;
    }

    /**
     * @param get Capital
     */
    public String getCapital()
    {
        return capital;
    }

    /**
     * @param get Population in Millions
     */
    public int getPopulationInMillions()
    {
        return populationInMillions;
    }

    /**
     * @return if parameter is a valid province
     */

    private boolean isValidProvince(String province)
    {
        String [] provinces ={"Ontario","Quebec","British Columbia","Alberta","Manitoba","Saskatchewan", 
                "Nova Scotia","New Brunswick","Newfoundland and Labrador","Prince Edward Island"};       

        int arrayProvince = 0;
        while(arrayProvince <= 9)
        {
            if(provinces[arrayProvince].equalsIgnoreCase(province))
            {
                return true;
            }
            arrayProvince = arrayProvince + 1;
        }
        return false;
    }

    /**
     * @return if parameter is a valid capital city
     */
    private boolean isValidCapitalCity(String capital)
    {
        String capitals[] = {"Toronto","Montreal","Victoria","Edmonton","Winnepeg","Regina",
                "Halifax","Fredricton","St.John's","Charlottetown"};

        int arrayCapital = 0;
        while(arrayCapital <=9)
        {
            if(capitals[arrayCapital].equalsIgnoreCase(capital))
            {
                return true;
            }
            arrayCapital = arrayCapital + 1;
        }
        return false;
    }

    /**
     * @return if paramter is a valid population
     */
    private boolean isValidPopulation(int populationInMillions)
    {   
        if(populationInMillions >=0 && populationInMillions<=38)

        {                   
            return true;
        }
        else
        {
            return false;
        }
    }   

    /**
     * @return details
     */
    public String getDetails()
    {
        return "The Capital of " + getProvince() + " (pop. "+ getPopulationInMillions() + " million) is "+ getCapital() + ".";
    }
}
