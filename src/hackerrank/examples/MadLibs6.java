package hackerrank.examples;

import java.util.Random;
import java.util.Scanner;

public class MadLibs6 {
    
    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randNums;
    Random rand = new Random();

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String newStory) {
        this.story = newStory;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public void setAdjective1(String newAdjective1) {
        this.adjective1 = newAdjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public void setAdjective2(String newAdjective2) {
        this.adjective2 = newAdjective2;
    }

    public String getNoun1() {
        return noun1;
    }

    public void setNoun1(String newNoun1) {
        this.noun1 = newNoun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public void setNoun2(String newNoun2) {
        this.noun2 = newNoun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public void setNoun3(String newNoun3) {
        this.noun3 = newNoun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String newAdverb) {
        this.adverb = newAdverb;
    }

    public String getRandNums() {
        return randNums;
    }

    public void setRandNums() {
        int num = Math.abs(rand.nextInt())%100;
        int index = 0;
        int[] numberHolder = new int[3];
        
        while(index<numberHolder.length){
            numberHolder[index] = num + index;
            index++;
        }
        randNums = "not " + numberHolder[0] + ", not " + numberHolder[1] 
                + ", but " +numberHolder[2];
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random newRand) {
        this.rand = newRand;
    }
    
    public void printInstructions(){
        System.out.println("Welcome to the MadLibs game. If you type in "
                + "words , we'll give you a story. "
                + "\nStart by typing in a name.");
    }
    
    public void enterName(){
        setName(scanner.nextLine());
    }
    
    public void enterNoun1(){
        System.out.println("Give me a noun");
        setNoun1(scanner.nextLine());
    }
     
    public void enterNoun2(){
        System.out.println("Give me another noun");
        setNoun2(scanner.nextLine());
    }
    
    public void enterNoun3(){
        System.out.println("Give me the last noun");
        setNoun3(scanner.nextLine());
    }
    
    public void enterAdjective1(){
        System.out.println("I need an adjective");
        setAdjective1(scanner.nextLine());
    } 
    
    public void enterAdjective2(){
        System.out.println("I need another adjective");
        setAdjective2(scanner.nextLine());
    } 
     
    public void enterAdverb(){
        System.out.println("Please give me an adverb");
        setAdverb(scanner.nextLine());
    } 
     
    public void play(){
        enterName();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        setRandNums();
        enterAdjective1();
        enterAdjective2();
        enterAdverb();
        putTogetherTheStory();
        System.out.println(getStory());

    }
    public void putTogetherTheStory(){
        
        String story;
        int num = Math.abs(rand.nextInt())%2;
        if(num==0){
                story = "Jesse and her best friend " + getName() 
                + "\nwent to Disney World today! They saw a " + getNoun1() 
                + "\nin a Magic Kingdom and ate a " + getAdjective1() 
                + "\nfeast for dinner. The next day I ran " + getAdverb() 
                + "\nto meet Mickey Mouse in his " + getNoun2() 
                + "\nand then that night I gazed at the" + getRandNums()+ " "
                + "\n"+getAdjective2() + " fireworks shooting from the " + getNoun3() 
                + ".";
        }
        else {
            story = "Amanda and her frenemy " + getName() 
                + "\nwent to went to the zoo last summer. They saw a huge " 
                + "\n"+getNoun1() + " and a little " + getNoun2() 
                + ". \nThat night they decided to climb " + getAdverb() 
                + "\ninto " + getNoun3()+ " to get a closer look. The zoo was" 
                + "\n"+getAdjective1()+ " at night, but they didn't care...until "
                + "\n"+getRandNums() + " " + getAdjective2() + " apes yelled in "
                + "\nin their faces, making " + "Amanda and " + getName()
                + "\nsprint all the way back home.";
        }
        setStory(story);
        
    }
    
    
    
    
    
}
