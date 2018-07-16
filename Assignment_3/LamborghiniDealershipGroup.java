/**
 * Assignment 3 - COMP 1409 Introduction To Java - 55053
 * 
 * @author Andrew Hewitson 
 * @version June 14, 2017
 */
import java.util.Iterator;
import java.util.ArrayList;

public class LamborghiniDealershipGroup
{
    private String dealershipGroupName;
    private ArrayList <LamborghiniCarLot> carLots;

    /**
     * Constructor for objects of class LamborghiniDealershipGroup
     */
    public LamborghiniDealershipGroup(){}
    {       
        carLots = new ArrayList <>(); 
    }

    /**
     * Constructor for objects of class LamborghiniDealershipGroup
     */
    public LamborghiniDealershipGroup(String dealershipGroupName){}
    {     
        setDealershipGroupName(dealershipGroupName);

        carLots = new ArrayList <LamborghiniCarLot>(); 

        LamborghiniCarLot carlot1 = new LamborghiniCarLot();  

        carlot1.setLotName("Jason's vintage lambos.");
        carlot1.addLamborghini(new Lamborghini(1965, "350GT", 365.3, true));
        carlot1.addLamborghini(new Lamborghini(1966, "400GT 2+2", 366.3, false));
        carlot1.addLamborghini(new Lamborghini(1967, "MIURA", 367.3, true));
        carlot1.addLamborghini(new Lamborghini(1968, "espada", 368.3, false));
        carlot1.addLamborghini(new Lamborghini(1969, "islero", 369.3, true));
        carlot1.addLamborghini(new Lamborghini(1970, "jarama", 370.3, false));
        carlot1.addLamborghini(new Lamborghini(1971, "urraco", 371.3, false));
        carlot1.addLamborghini(new Lamborghini(1971, "urraco", 371.3, false));
        carlot1.addLamborghini(new Lamborghini(1973, "countache", 373.3, false));
        carlot1.addLamborghini(new Lamborghini(1974, "silhouette", 374.3, false));
        carlot1.addLamborghini(new Lamborghini(1975, "jalpa", 375.3, true));
        carlot1.addLamborghini(new Lamborghini(1976, "silhouette", 476.3, false));
        carlot1.addLamborghini(new Lamborghini(1977, "silhouette", 377.3, true));
        carlot1.addLamborghini(new Lamborghini(1978, "countache", 478.3, false));
        carlot1.addLamborghini(new Lamborghini(1978, "countache", 578.3, false));
        carlot1.addLamborghini(new Lamborghini(1978, "countache", 378.3, true));
        carlot1.addLamborghini(new Lamborghini(1979, "silhouette", 479.3, false));

        LamborghiniCarLot carlot2 = new LamborghiniCarLot();
        carlot2.setLotName("Taylor's brand new lambos.");
        carlot2.addLamborghini(new Lamborghini(2006, "gallardo", 506.3, true));
        carlot2.addLamborghini(new Lamborghini(2007, "gallardo", 507.3, true));
        carlot2.addLamborghini(new Lamborghini(2008, "reventon", 308.3, false));
        carlot2.addLamborghini(new Lamborghini(2008, "reventon", 508.3, true));
        carlot2.addLamborghini(new Lamborghini(2009, "gallardo", 409.3, true));
        carlot2.addLamborghini(new Lamborghini(2010, "murcielago", 310.3, false));
        carlot2.addLamborghini(new Lamborghini(2011, "aventador", 411.3, false));
        carlot2.addLamborghini(new Lamborghini(2012, "sesto elemento", 512.3, true));

        carLots.add(carlot1);
        carLots.add(carlot2);
    }

    /**
     * @return Dealership Group Name
     */
    public String getDealershipGroupName()
    {
        return dealershipGroupName;
    }

    /**
     * @return inventory
     */
    public ArrayList<LamborghiniCarLot> getCarLots()
    {
        return carLots;
    }

    /**
     * @param set new Dealership group name
     */
    public void setDealershipGroupName(String dealershipGroupName)
    {
        if(dealershipGroupName != null)
        {
            this.dealershipGroupName = dealershipGroupName;
        }
    }

    /**
     * @param get set Inventory
     */
    public void setCarLots(ArrayList <LamborghiniCarLot> carLots)
    {
        if(carLots != null)
        {
            this.carLots = carLots;
        }
    }

    /**
     * @param set new car lot
     */
    public void setNewCarLots(LamborghiniCarLot carLot)
    {
        if(carLot != null)
        {
            carLots.add(new LamborghiniCarLot());
        }            
    }

    /**
     * @param add car lot
     */
    public void addCarLot(LamborghiniCarLot carLot)
    {
        if(carLot!= null)
        {   
            setNewCarLots(carLot);
        }
    }

    /**
     * @return total inventory
     */
    public int getTotalInventoryCount()
    {
        int sum = 0;

        if(carLots != null)
        {            
            for(LamborghiniCarLot tempCarLot : carLots)        
            {
                sum = tempCarLot.getInventory().size()+sum;
            }
        }
        return sum;
    }

    /**
     * @return if model name exists
     */
    public boolean hasModelName(String modelName)
    {        
        if(modelName != null)

            if(carLots != null)
            {            
                for(LamborghiniCarLot tempCarLot : carLots)  
                {
                    if(modelName != null && tempCarLot.hasCarModel(modelName))

                        return true;
                }
            }
        return false;
    }

    /**
     * @return an array of all the car lots whos average horsepower for a given year is within the range specified
     */
    public LamborghiniCarLot[] getAllCarLotsWithAverageHorsepowerInRangeForYear(int modelYear, double lowHP, double highHP)
    {     
        int sum = 0;
        LamborghiniCarLot[] allCarLotsWithAverageHorsepowerInRangeForYear = new LamborghiniCarLot[sum]; 
        if(carLots != null)
            for(LamborghiniCarLot tempCarLot : carLots)
            {
                if(tempCarLot.getInventory().iterator().hasNext() && tempCarLot.getInventory().iterator().next().getModelYear()== modelYear)
                {         
                    if(tempCarLot.getInventory().iterator().hasNext() &&
                    tempCarLot.getInventory().iterator().next().getHorsepower()<=highHP &&
                    tempCarLot.getInventory().iterator().next().getHorsepower()>=lowHP)
                    {
                        allCarLotsWithAverageHorsepowerInRangeForYear = new LamborghiniCarLot[sum]; 
                        sum++;
                    }

                }
            }
        return allCarLotsWithAverageHorsepowerInRangeForYear;
    }  
}

