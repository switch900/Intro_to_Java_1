/**
 * Assignment 3 - COMP 1409 Introduction To Java - 55053
 * 
 * @author Andrew Hewitson 
 * @version June 14, 2017
 */
import java.util.ArrayList;

public class LamborghiniCarLot
{
    private String lotName;
    private ArrayList<Lamborghini> inventory;

    /**
     * Constructor for objects of class LamborghiniCarLot
     */
    public LamborghiniCarLot(){}
    {
        inventory = new ArrayList<Lamborghini>();
    }

    /**
     * Constructor to create inventory ArrayList object
     */

    public LamborghiniCarLot(String lotName){}
    {        
        setLotName(lotName);
        
        inventory = new ArrayList<Lamborghini>();
        
        inventory.add(new Lamborghini(1965, "350GT", 365.3, true));
        inventory.add(new Lamborghini(1966, "400GT 2+2", 366.3, false));
        inventory.add(new Lamborghini(1967, "MIURA", 367.3, true));
        inventory.add(new Lamborghini(1968, "espada", 368.3, false));
        inventory.add(new Lamborghini(1969, "islero", 369.3, true));
        inventory.add(new Lamborghini(1970, "jarama", 370.3, false));
        inventory.add(new Lamborghini(1971, "urraco", 371.3, false));
        inventory.add(new Lamborghini(1971, "urraco", 371.3, false));
        inventory.add(new Lamborghini(1973, "countache", 373.3, false));
        inventory.add(new Lamborghini(1974, "silhouette", 374.3, false));
        inventory.add(new Lamborghini(1975, "jalpa", 375.3, true));
        inventory.add(new Lamborghini(1976, "silhouette", 476.3, false));
        inventory.add(new Lamborghini(1977, "silhouette", 377.3, true));
        inventory.add(new Lamborghini(1978, "countache", 478.3, false));
        inventory.add(new Lamborghini(1978, "countache", 578.3, false));
        inventory.add(new Lamborghini(1978, "countache", 378.3, true));
        inventory.add(new Lamborghini(1979, "silhouette", 479.3, false));
        inventory.add(new Lamborghini(1980, "countache", 580.3, false));
        inventory.add(new Lamborghini(1981, "jalpa", 381.3, true));
        inventory.add(new Lamborghini(1981, "jalpa", 481.3, true));
        inventory.add(new Lamborghini(1982, "countache", 582.3, true));
        inventory.add(new Lamborghini(1983, "countache", 383.3, false));
        inventory.add(new Lamborghini(1984, "countache", 484.3, false));
        inventory.add(new Lamborghini(1985, "countache", 585.3, false));
        inventory.add(new Lamborghini(1986, "lm002", 386.3, true));
        inventory.add(new Lamborghini(1987, "jalpa", 487.3, false));
        inventory.add(new Lamborghini(1988, "countache", 588.3, false));
        inventory.add(new Lamborghini(1989, "countache", 389.3, true));
        inventory.add(new Lamborghini(1990, "diablo", 490.3, false));
        inventory.add(new Lamborghini(1991, "lm002", 591.3, false));
        inventory.add(new Lamborghini(1991, "lm002", 391.3, true));
        inventory.add(new Lamborghini(1991, "lm002", 491.3, false));
        inventory.add(new Lamborghini(1991, "lm002", 591.3, true));
        inventory.add(new Lamborghini(1992, "lm002", 392.3, false));
        inventory.add(new Lamborghini(1993, "lm002", 493.3, false));
        inventory.add(new Lamborghini(1994, "diablo", 594.3, false));
        inventory.add(new Lamborghini(1994, "diablo", 394.3, true));
        inventory.add(new Lamborghini(1995, "diablo", 495.3, false));
        inventory.add(new Lamborghini(1996, "diablo", 596.3, false));
        inventory.add(new Lamborghini(1997, "diablo", 397.3, false));
        inventory.add(new Lamborghini(1998, "diablo", 498.3, false));
        inventory.add(new Lamborghini(1999, "diablo", 599.3, false));
        inventory.add(new Lamborghini(1999, "diablo", 599.3, false));
        inventory.add(new Lamborghini(2000, "diablo", 400.3, false));
        inventory.add(new Lamborghini(2000, "diablo", 500.3, false));
        inventory.add(new Lamborghini(2001, "murcielago", 501.3, false));
        inventory.add(new Lamborghini(2002, "murcielago", 502.3, false));
        inventory.add(new Lamborghini(2003, "gallardo", 303.3, true));
        inventory.add(new Lamborghini(2004, "murcielago", 404.3, true));
        inventory.add(new Lamborghini(2005, "murcielago", 505.3, true));
        inventory.add(new Lamborghini(2006, "gallardo", 506.3, true));
        inventory.add(new Lamborghini(2007, "gallardo", 507.3, true));
        inventory.add(new Lamborghini(2008, "reventon", 308.3, false));
        inventory.add(new Lamborghini(2008, "reventon", 508.3, true));
        inventory.add(new Lamborghini(2009, "gallardo", 409.3, true));
        inventory.add(new Lamborghini(2010, "murcielago", 310.3, false));
        inventory.add(new Lamborghini(2011, "aventador", 411.3, false));
        inventory.add(new Lamborghini(2012, "sesto elemento", 512.3, true));
    }

    /**
     * @return lot name
     */
    public String getLotName()
    {
        return lotName;
    }

    /**
     * @return inventory
     */
    public ArrayList <Lamborghini> getInventory()
    {
        return inventory;
    }

    /**
     * @param get new Lot Name
     */
    public void setLotName(String lotName)
    {
        if(lotName != null)
        {
            this.lotName = lotName;
        }       
        if(lotName!=null && lotName.equals("Taylor's Used Lambos"))
        {
            this.lotName = "Jason's Used Lambos";
        }
    }

    /**
     * @param get new Inventory
     */
    public void setInventory(ArrayList <Lamborghini> inventory)
    {
        if(inventory != null && lotName!=null)
        {
            this.inventory = inventory;
        }
    }

    /**
     * @param add new Lamborghini
     */
    public void addLamborghini(Lamborghini newLamborghini)
    {   
        if(newLamborghini != null && inventory!= null)
        {
            inventory.add(newLamborghini);
        }
    }

    /**
     * @return years between models
     */
    public int howManyBetweenTheseYears(int startYear, int endYear)
    {
        int sum = 0;
        if (inventory != null)
        {
            for(Lamborghini tempInventory : inventory)

                if(tempInventory.getModelYear() >= startYear && tempInventory.getModelYear() <= endYear)
                {
                    sum = sum + 1;
                }
        }
        return sum;
    }

    /**
     * @return how many are rear wheel drive
     */
    public int howManyAreRearWheelDrive()
    {
        int sum = 0;
        if (inventory != null)
        {
            for(Lamborghini tempInventory : inventory)

                if(tempInventory.getIsRearWheelDrive() == true)
                {
                    sum = sum + 1;
                }
        }
        return sum;
    }

    /**
     * @return array list of cars from specific year
     */
    public ArrayList<Lamborghini> getCarsFromThisYear(int year)
    {
        ArrayList<Lamborghini> carsFromThisYear = new ArrayList<Lamborghini>();

        if (inventory != null)

            for(Lamborghini tempInventory : inventory)
            {
                if(tempInventory.getModelYear() == year)
                {
                    carsFromThisYear.add(tempInventory);
                }   
            }
        return carsFromThisYear;
    }

    /**
     * @return array of cars with specific horsepower
     */
    public Lamborghini[] getCarsWithHorsepowerRange(double lowHP, double highHP)
    {  
        int carsWithHPRange = 0;

        if(inventory != null)
        {
            for(Lamborghini tempInventory : inventory)
            {
                if(tempInventory.getHorsepower() >= lowHP && tempInventory.getHorsepower() <= highHP)
                {
                    carsWithHPRange ++;
                }
            }
        }
        Lamborghini[] carsWithHorsepowerRange = new Lamborghini[carsWithHPRange];
        int newIndex = 0;
        if(inventory != null)

            for(Lamborghini tempInventory : inventory)
            {
                if(tempInventory.getHorsepower() >= lowHP && tempInventory.getHorsepower() <= highHP)
                {     
                    carsWithHorsepowerRange[newIndex] =  tempInventory;
                    newIndex++;
                }  
            }
        return carsWithHorsepowerRange;
    }

    /**
     * @return true if model name exists in car lot
     */
    public boolean hasCarModel(String modelName)
    {
        if (inventory!= null)

            for(Lamborghini tempInventory : inventory)
            {
                String tempModelName = tempInventory.getModelName();
                if(tempModelName != null && tempInventory!= null && modelName != null && tempModelName.toUpperCase().equals(modelName.toUpperCase()))
                {
                    return true;
                }
            }
        return false;         
    }

    /**
     * @return get Average Horsepower of all Lamborghini objects that match the model year specified as the parameter
     */
    public double getAverageHorsepowerOfYear(int modelYear)
    {
        double totalHP = 0.0;
        double averageHP = 0.0;
        int total = 0;

        for(int index = 0; index<inventory.size(); index++)
        {
            if(inventory.get(index) != null && inventory.get(index).getModelYear() == modelYear)           
            {
                totalHP = totalHP + inventory.get(index).getHorsepower(); 
                total++;            
            }
        }
        if(totalHP != 0.0)
        {
            averageHP = totalHP/total;
        }       
        return averageHP;       
    }
}