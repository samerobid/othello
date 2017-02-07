package kth.game.othello.imp;

import kth.game.othello.board.Node;

/**
 * Created by robertog on 2/7/17.
 */
public class NodeImp implements Node {
    private final int x;
    private final int y;
    private String playerId;

    public NodeImp(int x, int y) {
        this.x = x;
        this.y = y;
        playerId = null;
    }

    public NodeImp(String nodeId, String playerId) {
        this.x = getXCoordinate(nodeId);
        this.y = getYCoordinate(nodeId);
        this.playerId = playerId;
    }

    @Override
    public String getId() {
        return String.format("%d,%d", x, y);
    }
    
    @Override
    public String getOccupantPlayerId() {
        return this.playerId;
    }

    @Override
    public int getXCoordinate() {
        return x;
    }
    @Override
    public int getYCoordinate() {
        return y;
    }
    @Override
    public boolean isMarked() {
        return (playerId != null);
    }

    public static int getXCoordinate(String nodeId) {
        return Integer.valueOf(nodeId.split(",")[0]);
    }
    public static int getYCoordinate(String nodeId) {
        return Integer.valueOf(nodeId.split(",")[1]);
    }

}
