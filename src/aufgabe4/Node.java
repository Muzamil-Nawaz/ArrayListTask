/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe4;

public class Node {
	private String load;
	private int number;
	private Node left;
	private Node right;

	public Node(int number, String load) {
		this.number = number;
		this.load = load;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public String getLoad() {
		return load;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean equals(Node other) {
		if (this == other)
			return true;
		if (other == null)
			return false;
		if (load == null) {
			if (other.load != null)
				return false;
		} else if (!load.equals(other.load))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
}