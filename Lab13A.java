//Class: CSE 1321L
//Section: WJ2
//Term: Fall 2022
//Instructor: Yamini Hanisha Talluri
//Name: Robert Scruggs
//Lab#: 13
import java.util.Scanner;


class BuildingBlueprint {
    // attributes
    private int stories;
    private int apartments;
    private float occupancyRate;
    private boolean isFullyOccupied;


    //constructors
    public BuildingBlueprint(){
        this.stories = 10;
        this.apartments = 20;
        this.occupancyRate = 1.0f;
        this.isFullyOccupied = true;
    }

    public BuildingBlueprint(int stories, int apartments, float occupancyRate){
        this.stories = stories;
        this.apartments = apartments;
        this.occupancyRate = occupancyRate;
        if (this.occupancyRate < 1){
            isFullyOccupied = false;
        }else{
            isFullyOccupied = true;
        }
    }

    //methods
    public float getOccupancyRate(){
        return occupancyRate;
    }
    public void setOccupancyRate(float occupancyRate){
        this.occupancyRate = occupancyRate;
        if (this.occupancyRate < 1){
            isFullyOccupied = false;
        }else{
            isFullyOccupied = true;
        }
    }
    public int getStories(){
        return stories;
    }
    public int getApartments(){
        return apartments;
    }
    public boolean getIsFullyOccupied(){
        return isFullyOccupied;
    }
}


public class Lab13A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BuildingBlueprint buildingOne = new BuildingBlueprint();
        BuildingBlueprint buildingTwo = new BuildingBlueprint(30,30,.75f);

        System.out.println("Year 2020:");
        System.out.println("Building 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getApartments() + " apartments, and is " + String.format("%.0f%%",buildingOne.getOccupancyRate() * 100) + " occupied. Full? " + buildingOne.getIsFullyOccupied());
        System.out.println("Building 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getApartments() + " apartments, and is " + String.format("%.0f%%",buildingTwo.getOccupancyRate() * 100) + " occupied. Full? " + buildingTwo.getIsFullyOccupied());

        System.out.println("Many years pass.");

        buildingOne.setOccupancyRate(0.0f);
        buildingTwo.setOccupancyRate(1.0f);

        System.out.println("Year 2043:");
        System.out.println("Building 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getApartments() + " apartments, and is " + String.format("%.0f%%",buildingOne.getOccupancyRate() * 100) + " occupied. Full? " + buildingOne.getIsFullyOccupied());
        System.out.println("Building 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getApartments() + " apartments, and is " + String.format("%.0f%%",buildingTwo.getOccupancyRate() * 100) + " occupied. Full? " + buildingTwo.getIsFullyOccupied());

        System.out.println("Looks like people prefer taller buildings.");




    }


}