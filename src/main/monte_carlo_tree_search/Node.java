package main.monte_carlo_tree_search;
import java.util.LinkedList;
import java.util.List;

import utils.Utils;

public class Node {
	private Node parent;
	private List<Node> children;
	private List<int[]> moves;
	private int[][] board;
	private int visits =0 ;
	private double wins;
	
	public int getVisits() {
		return visits;
	}


	public void setVisits(int visits) {
		this.visits = visits;
	}


	public double getWins() {
		return wins;
	}


	public void setWins(double wins) {
		this.wins = wins;
	}

	
	public Node(int [][] board) {
		this.board = Utils.copyBoard(board);
		moves = new LinkedList<int[]>();
		children = new LinkedList<Node>();
		
	}
	
	
	public Node(Node parent) {
		this.board = Utils.copyBoard(parent.getBoard());
		this.moves = new LinkedList<int[]>();
		moves.addAll(parent.getMoves());
		children = new LinkedList<Node>();
	}
	
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public int[][] getBoard(){
		return board;
	}
	
	public List<int[]> getMoves(){
		return this.moves;
	}
	
	public List<Node> getChildren(){
		return children;
	}
	public void addChild(Node node) {
		children.add(node);
	}
}
