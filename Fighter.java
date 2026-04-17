public class Fighter {
    private String name;
    private String nickname;
    private int wins;
    private int losses;
    private int draws;
    private double heightCm;
    private double weightKg;
    private double reachCm;
    private String stance;
    private double strikesLandedPerMin;
    private double strikingAccuracy;
    private double strikesAbsorbedPerMin;
    private double strikeDefense;
    private double takedownsPer15Min;
    private double takedownAccuracy;
    private double takedownDefense;
    private double submissionsPer15Min;

    public Fighter(String name, String nickname, int wins, int losses, int draws, double heightCm, double weightKg,
            double reachCm,String stance, double strikesLandedPerMin, double strikingAccuracy, double strikesAbsorbedPerMin,
            double strikeDefense, double takedownsPer15Min, double takedownAccuracy, double takedownDefense,
            double submissionsPer15Min) {
        this.name = name;
        this.nickname = nickname;
        this.stance = stance;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
        this.reachCm = reachCm;
        this.strikesLandedPerMin = strikesLandedPerMin;
        this.strikingAccuracy = strikingAccuracy;
        this.strikesAbsorbedPerMin = strikesAbsorbedPerMin;
        this.strikeDefense = strikeDefense;
        this.takedownsPer15Min = takedownsPer15Min;
        this.takedownAccuracy = takedownAccuracy;
        this.takedownDefense = takedownDefense;
        this.submissionsPer15Min = submissionsPer15Min;
    }
    
    
   
        public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getNickname() {
        return nickname;
    }



    public void setNickname(String nickname) {
        this.nickname = nickname;
    }



    public int getWins() {
        return wins;
    }



    public void setWins(int wins) {
        this.wins = wins;
    }



    public int getLosses() {
        return losses;
    }



    public void setLosses(int losses) {
        this.losses = losses;
    }



    public int getDraws() {
        return draws;
    }



    public void setDraws(int draws) {
        this.draws = draws;
    }



    public double getHeightCm() {
        return heightCm;
    }



    public void setHeightCm(double heightCm) {
        this.heightCm = heightCm;
    }



    public double getWeightKg() {
        return weightKg;
    }



    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }



    public double getReachCm() {
        return reachCm;
    }



    public void setReachCm(double reachCm) {
        this.reachCm = reachCm;
    }



    public String getStance() {
        return stance;
    }



    public void setStance(String stance) {
        this.stance = stance;
    }



    public double getStrikesLandedPerMin() {
        return strikesLandedPerMin;
    }



    public void setStrikesLandedPerMin(double strikesLandedPerMin) {
        this.strikesLandedPerMin = strikesLandedPerMin;
    }



    public double getStrikingAccuracy() {
        return strikingAccuracy;
    }



    public void setStrikingAccuracy(double strikingAccuracy) {
        this.strikingAccuracy = strikingAccuracy;
    }



    public double getStrikesAbsorbedPerMin() {
        return strikesAbsorbedPerMin;
    }



    public void setStrikesAbsorbedPerMin(double strikesAbsorbedPerMin) {
        this.strikesAbsorbedPerMin = strikesAbsorbedPerMin;
    }



    public double getStrikeDefense() {
        return strikeDefense;
    }



    public void setStrikeDefense(double strikeDefense) {
        this.strikeDefense = strikeDefense;
    }



    public double getTakedownsPer15Min() {
        return takedownsPer15Min;
    }



    public void setTakedownsPer15Min(double takedownsPer15Min) {
        this.takedownsPer15Min = takedownsPer15Min;
    }



    public double getTakedownAccuracy() {
        return takedownAccuracy;
    }



    public void setTakedownAccuracy(double takedownAccuracy) {
        this.takedownAccuracy = takedownAccuracy;
    }



    public double getTakedownDefense() {
        return takedownDefense;
    }



    public void setTakedownDefense(double takedownDefense) {
        this.takedownDefense = takedownDefense;
    }



    public double getSubmissionsPer15Min() {
        return submissionsPer15Min;
    }



    public void setSubmissionsPer15Min(double submissionsPer15Min) {
        this.submissionsPer15Min = submissionsPer15Min;
    }



        @Override
    public String toString() {
        return "Fighter [name=" + name + ", stance=" + stance + "]";
    }

  
    
}
