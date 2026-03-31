public class Athlete {
    private String name;
    private int numGold;
    private int numSilver;
    private int numBronze;
    private int numTotal;
    private String country;
    private int weightedScore;
    public Athlete(String name,String country,int numGold, int numSilver, int numBronze, int numTotal, int weightedScore) {
        this.name = name;
        this.numGold = numGold;
        this.numSilver = numSilver;
        this.numBronze = numBronze;
        this.numTotal = numTotal;
        this.country = country;
        this.weightedScore = weightedScore;
    }
    public int getWeightedScore()
    {
        return weightedScore;
    }
    public void setWeightedScore(int weightedScore)
    {
        this.weightedScore = weightedScore;

    }
    public String getName() {
        return name;
    }
    public int getNumGold() {
        return numGold;
    }
    public int getNumSilver() {
        return numSilver;
    }
    public int getNumBronze() {
        return numBronze;
    }
    public int getNumTotal() {
        return numTotal;
    }
    public String getCountry() {
        return country;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumGold(int numGold) {
        this.numGold = numGold;
    }
    public void setNumSilver(int numSilver) {
        this.numSilver = numSilver;
    }
    public void setNumBronze(int numBronze) {
        this.numBronze = numBronze;
    }
    public void setNumTotal(int numTotal) {
        this.numTotal = numTotal;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return "Athlete [name=" + name + ", numGold=" + numGold + ", numSilver=" + numSilver + ", numBronze="
                + numBronze + ", numTotal=" + numTotal + ", country=" + country + "]";
    }
    
}
