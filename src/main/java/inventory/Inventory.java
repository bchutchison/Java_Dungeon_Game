package inventory;
import items.Treasure;
import java.util.ArrayList;

public class Inventory {

    private Treasure treasure;
    private ArrayList<Treasure> inventory;

    public Inventory() {
        this.inventory = new ArrayList<Treasure>();
    }

    public Treasure removeTreasure() {
        return inventory.remove(0);
    }

    public void getTreasure(Treasure item){
        inventory.add(item);
    }

    public int getTreasureCount(){
        return inventory.size();
    }

}
