package com.tolyan_game;

import com.tolyan_game.board.Board;

public abstract class GameStateChecker {
    public abstract GameState check(Board board, Color color);
}
