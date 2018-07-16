/**
 * Lab 8a - COMP 1409 Introduction To Java - 55053
 * 
 * @author Andrew Hewitson 
 * @version June 11, 2017
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Country
{
    private String canada;
    private ArrayList <Province> provinces;

    /**
     * default constructor that sets Array of all provinces
     */
    public Country()
    {
        provinces = new ArrayList<Province>();
        provinces.add(new Province("Ontario","Toronto", 13));
        provinces.add(new Province("Quebec","Montreal",8));
        provinces.add(new Province("British Columbia","Victoria",4));
        provinces.add(new Province("Alberta","Edmonton",4));
        provinces.add(new Province("Manitoba","Winnepeg",1));
        provinces.add(new Province("Saskatchewan","Regina",1));
        provinces.add(new Province("Nova Scotia","Halifax",1));
        provinces.add(new Province("New Brunswick","Fredricton",1));
        provinces.add(new Province("Newfoundland and Labrador","St.John's",1));
        provinces.add(new Province("Prince Edward Island","Charlottetown",1));
    }

    /**
     * @return print all provinces in Array
     */
    public void displayAllProvinces()
    {
        for(Province tempProvince : provinces)
        {
            if(tempProvince != null)
            {
                System.out.println(tempProvince.getDetails());
            }
        }       
    }

    /**
     * @param check for null location and add province in that location
     */
    public void addProvince(Province province)
    {
        if (provinces != null)
        {
            for(Province tempProvince : provinces)
            {
                tempProvince = province;
                return;
            }
        }
    }

    /**
     * @return how many provinces have population in range of 4-6 million
     */
    public int howManyHaveThisPopulation(int min, int max)
    {
        int sum = 0;
        if(provinces != null && provinces.size() != 0)
        {
            Iterator<Province> it = provinces.iterator();
            Province s = null;

            while(it.hasNext())
            {
                s = it.next();

                if(s!=null && s.getPopulationInMillions()<=max && s.getPopulationInMillions() >=min)
                {
                    sum++;
                }
            }
        }
        return sum;
    }

    /**
     * @param remove Province   
     */
    public void removeFromCountry(String provinceName)
    {
        if(provinces != null && provinces.size() != 0)
        {
            Iterator<Province> it = provinces.iterator();
            Province s = null;

            while(it.hasNext())
            {
                s = it.next();

                if(s!=null && s.getProvince().equalsIgnoreCase(provinceName))
                {
                    it.remove();
                    return;
                }
            }
        }
    }

    /**
     * @return an Array of all the provinces that contain a substring
     */
    public Province[] getAll(String substring)
    {
        int howManyContainThisSubstring = 0;

        if (provinces != null)
        {
            for(Province tempProvince: provinces)
            {
                if(tempProvince.getProvince().contains(substring))
                {
                    howManyContainThisSubstring ++;
                }
            }
        }
        Province[] matches = new Province[howManyContainThisSubstring];
        int indexInNewArray = 0;
        if (provinces != null)

            for(Province tempProvince: provinces)
            {
                if(tempProvince.getProvince().contains(substring))
                {
                    matches[indexInNewArray] = tempProvince;
                    indexInNewArray++;
                }
            }
        return matches;
    }

    public int howManyStartWith(String subString)
    {
        int sum = 0;

        if (provinces != null)

            for(Province tempProvince: provinces)

            {
                if(tempProvince.getProvince().startsWith(subString))
                {
                    sum++;
                }
            }
        return sum;  
    }
}
