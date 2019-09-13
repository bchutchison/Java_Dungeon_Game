package inventory;
import items.Treasure;
import java.util.ArrayList;

public class Inventory {

    private Treasure treasure;
    private ArrayList<Treasure> treasures;

    public Inventory() {
        this.treasures = new ArrayList<Treasure>();
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public Treasure removeTreasure() {
        return treasures.remove(0);
    }

    public void addTreasureToInventory(Treasure item){
        treasures.add(item);
    }

    public int getTreasureCount(){
        return treasures.size();
    }

    public int getTotalTreasureValue() {
        int total = 0;
        for(items.Treasure i : getTreasures()) {
            total += i.getWorth();
        }
        return total;
    }
}
