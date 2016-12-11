package dataStructure;

import java.util.ArrayList;

public class GraphTest {
	class DirectedGraphNode{
		int label;
		ArrayList<DirectedGraphNode> neighbors;
		DirectedGraphNode(int x){
			label =x;
			neighbors = new ArrayList<DirectedGraphNode>();
		}
	}
}
