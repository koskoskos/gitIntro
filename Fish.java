/**
 * Created by kos on 29.06.2017.
 */
public class Fish extends Pet{

    int currentDepth=0;

    public int dive(int howDeep){

        currentDepth = currentDepth + howDeep;
        System.out.println("Diving for" + howDeep + "feet");
        System.out.println("I'm at " + currentDepth + " feet below see level");

        return currentDepth;

    }

        public String talk(String some){
        return "Don't you know that fish do not talk?";
        }


}
