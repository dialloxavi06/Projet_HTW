
public class City{
    private String cityName;
    private int grainBushels = 2800;
    private int landAcres = 1000;
    private int population = 100;
    private int grainUsedForFood;
    private int cultivatedFieldsSize;
    private int yearsSinceFoundation;
    // Konstruktor
    public City(String cityName, int initialGrain, int initialLand, int initialPopulation, int initialGrainUsed, int initialFieldsSize, int initialYears) {
        this.cityName = cityName;
        this.grainBushels = initialGrain;
        this.landAcres = initialLand;
        this.population = initialPopulation;
        this.grainUsedForFood = initialGrainUsed;
        this.cultivatedFieldsSize = initialFieldsSize;
        this.yearsSinceFoundation = initialYears;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setGrainBushels(int grainBushels) {
        this.grainBushels = grainBushels;
    }

    public void setLandAcres(int landAcres) {
        this.landAcres = landAcres;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setGrainUsedForFood(int grainUsedForFood) {
        this.grainUsedForFood = grainUsedForFood;
    }

    public void setCultivatedFieldsSize(int cultivatedFieldsSize) {
        this.cultivatedFieldsSize = cultivatedFieldsSize;
    }

    public void setYearsSinceFoundation(int yearsSinceFoundation) {
        this.yearsSinceFoundation = yearsSinceFoundation;
    }

    public String getCityName() {
        return cityName;
    }

    public int getGrainBushels() {
        return grainBushels;
    }

    public int getLandAcres() {
        return landAcres;
    }

    public int getPopulation() {
        return population;
    }

    public int getGrainUsedForFood() {
        return grainUsedForFood;
    }

    public int getCultivatedFieldsSize() {
        return cultivatedFieldsSize;
    }

    public int getYearsSinceFoundation() {
        return yearsSinceFoundation;
    }

    public void kaufen(int acres, int pricePerAcre) {
        int totalCost = acres * pricePerAcre;
        if (this.grainBushels >= totalCost) {
            this.landAcres += acres;
            this.grainBushels -= totalCost;
            System.out.println("Land erfolgreich gekauft.");
        } else {
            System.out.println("Nicht genügend Getreide, um das Land zu kaufen.");
        }
    }



    // Methode verkaufen
    public void verkaufen(int acres, int pricePerAcre) {
     if(this.landAcres >= acres){
         int totalPries = acres * pricePerAcre ;
                 this.grainBushels = this.grainBushels + totalPries ;
                 this.landAcres = this.landAcres - acres
         }else {
             System.out.println("Nicht genügend Land, um das Land zu kaufen.");
         }
    }


    void ernaehren(){

    }
    void pflanzen(){

    }

}