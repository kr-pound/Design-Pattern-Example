package xmastree;

public class Test_tree {
    
        public static void printtree(Tree mytree){
            System.out.println(mytree.getDescription() + " costs: " + mytree.cost());
        }
	
	public static void main(String[] args) {
                /*
		Tree mytree = new Tree_BlueSpruce();
		mytree = new Decoration_Star(mytree);
		mytree = new Decoration_Ruffles(mytree);
		mytree = new Decoration_BallsRed(mytree);
                mytree = new Decoration_BallsSilver(mytree);
                mytree = new Decoration_BallsBlue(mytree);
                mytree = new Decoration_Ribbons(mytree);
                mytree = new Decoration_Lights(mytree);
                mytree = new Decoration_LEDs(mytree);
		mytree = new Decoration_Star(mytree);
                
                Tree mytree2 = new Tree_BalsamFir();
                Tree mytree3 = new Tree_DouglasFir();
                Tree mytree4 = new Tree_FraserFir();
                
		System.out.println(mytree.getDescription() + " costs: " + mytree.cost());
                System.out.println(mytree2.getDescription() + " costs: " + mytree2.cost());
                System.out.println(mytree3.getDescription() + " costs: " + mytree3.cost());
                System.out.println(mytree4.getDescription() + " costs: " + mytree4.cost());
                */
                
                Tree mytree = new Tree_BlueSpruce();
                mytree = new Decoration_Star(mytree);
                mytree = new Decoration_Ruffles(mytree);
                mytree = new Decoration_Star(mytree);
                mytree = new Decoration_Ruffles(mytree);
                printtree(mytree);
                
	}
}
