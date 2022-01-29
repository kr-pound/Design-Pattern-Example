package xmastree;

public class Decoration_Ruffles extends TreeDecorator {
	
		public Decoration_Ruffles(Tree tree) {
			this.tree=tree;
		}
		
		public String getDescription() {
			return tree.getDescription() + ", Ruffles";
		}

		public double cost() {
			return 1 + tree.cost();
    	}
}
