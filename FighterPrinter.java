import java.util.*;
import java.io.*;

 public class FighterPrinter {
    public static void main(String[] args) {
        ArrayList<Fighter> fighters = new ArrayList<>();
        String fileName = "ufc-fighters-statistics.csv";

        try {
            Scanner fileReader = new Scanner(new File(fileName));
            
            
            if (fileReader.hasNextLine()) {
                fileReader.nextLine();
            }
            

            
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                line = line.replace("\"", "");
                String[] data = line.split(",");
                //Trims all values
                for(int i = 0; i<data.length; i++){
                    data[i] = data[i].trim();
                }
                
                if(data.length>= 18){
                    try{
                String name = data[0];
                String nickname = data[1];
                int wins = Integer.parseInt(data[2]);
                int losses = Integer.parseInt(data[3]);
                int draws = Integer.parseInt(data[4]);
                double heightCm = Double.parseDouble(data[5]);
                double weightKg = Double.parseDouble(data[6]);
                double reachCm = Double.parseDouble(data[7]);
                String stance = data[8];
                double strikesLandedPerMin = Double.parseDouble(data[10]);
                double strikingAccuracy = Double.parseDouble(data[11]);
                double strikesAbsorbedPerMin = Double.parseDouble(data[12]);
                double strikeDefense = Double.parseDouble(data[13]);
                double takedownsPer15Min = Double.parseDouble(data[14]);
                double takedownAccuracy = Double.parseDouble(data[15]);
                double takedownDefense = Double.parseDouble(data[16]);
                double submissionsPer15Min = Double.parseDouble(data[17]);
                

                //Creates a fighter object

                fighters.add(new Fighter(name,
     nickname,
     wins,
     losses,
     draws,
     heightCm,
     weightKg,
     reachCm,
     stance,
     strikesLandedPerMin,
     strikingAccuracy,
     strikesAbsorbedPerMin,
     strikeDefense,
     takedownsPer15Min,
     takedownAccuracy,
     takedownDefense,
    submissionsPer15Min
));
            } catch (NumberFormatException e){
                //Skips bad rows
            }
            }
            }
            
            fileReader.close();
            System.out.println("Successfully loaded " + fighters.size() + " fighters. ");

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
            return;
            } 
        

        
       
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your stance: Southpaw, Orthodox, Switch");
    String yourStance = input.nextLine();
    int count = 0;
    //loops through fighters and it filters them by their stance
    //Also prints the fighters name and nickname with their stance
    for (Fighter f : fighters){
        if(f.getStance().equalsIgnoreCase(yourStance)){
            System.out.println(f.getName()+ " "  +"\""+  f.getNickname() + "\""+ " Stance: " + f.getStance());
            count++;
        }
    }
    System.out.println("Total Fighters With Your Stance: " + count);
    input.close();
 }
}