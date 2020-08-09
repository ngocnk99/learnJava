package datat_Btree;


public abstract class Datatype {
	public java.util.LinkedList<Node> nodelist = new java.util.LinkedList<Node>();
	Node tmp;

	public java.util.LinkedList<Node> getNodelist() {
		return nodelist;
	}


	public boolean isEmpty() {
		return nodelist.isEmpty();
	}

}
