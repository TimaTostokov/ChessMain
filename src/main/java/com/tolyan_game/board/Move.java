package com.tolyan_game.board;

import com.tolyan_game.Coordinates;

public class Move {
    public final Coordinates from, to;

    public Move(Coordinates from, Coordinates to) {
        this.from = from;
        this.to = to;
    }

}
