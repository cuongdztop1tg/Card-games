package games;


import models.SamLocPlayer;

import java.util.ArrayList;
import java.util.List;

public class SamLoc {
    List<SamLocPlayer> players;

    public SamLoc() {
        players = new ArrayList<SamLocPlayer>();
    }

    public SamLocPlayer endGame(){
        for (SamLocPlayer player : players) {
            if(player.handSize() == 0) return player;
        }
        return null;
    }

    public SamLocPlayer playGame(String name) {
        SamLocPlayer winner = new SamLocPlayer();
        while(this.endGame() != null) {

        }
        return winner = this.endGame();
    }
}
