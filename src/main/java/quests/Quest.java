package quests;

import items.RoomNames;

import java.util.ArrayList;

public class Quest {

    private RoomNames roomNames;
    private Room room;
    private int questLength;
    private ArrayList<Room> quests;

    public Quest(int questLength) {
        this.questLength = questLength;
        this.quests = new ArrayList<Room>();
    }

    public void start(int questLength) {
        for(Room room: this.quests) {
            for(int i = 0; i < questLength; i++){
                room = new Room();
                quests.add(room);
            }
        }
    }

    public int questCount() {
        return quests.size();
    }

}
