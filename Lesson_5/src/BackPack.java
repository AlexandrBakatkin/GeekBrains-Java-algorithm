import java.util.ArrayList;

public class BackPack {
    private int maxWeight;
    private ArrayList<Obj> obj;
    public int maxCost = 0;
    public int currentWeight = 0;
    public int currentCost = 0;
    public int index = 0;
    public int i;


    public BackPack(ArrayList<Obj> objList) {
        this.maxWeight = 50;
        this.obj = objList;
    }

    public void compareObjects (){
        compareTwoObject(index);
        index++;
        System.out.println(maxCost);
        if (index >= (obj.size() - 1)) {
            return;
        }
        compareObjects();
    }

    public int compareTwoObject(int index){
        if ((obj.get(index).getWeight() + obj.get(i).getWeight() < maxWeight) && (obj.get(index).getCost() + obj.get(i).getCost() > maxCost)){
            maxCost = obj.get(index).getCost() + obj.get(i).getCost();
        }
        if (i >= (obj.size() - 1)){
            return maxCost;
        }
        i++;
        compareTwoObject(index);
        return 0;
    }
}