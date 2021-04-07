package Default;

/**
 **Student:
 **/
public class A2{

   public static void main(String [] args){ 

      String[] expression = new String[]{"{5 * (x + 2) + (y - 1);}", "32 * (20 + (x[i] * 3) - 1", "((){([][])})", "({}((0))", "{([]})", "{}())", "{"};
      for (String st: expression) 
         System.out.println(st + " is " + ParathesisCheck.isMatch(st));
  
      Tree t1 = new Tree();
      Tree t2 = new Tree();
      t1.makeTree();
      t1.levelOrder();	//0 1 2 3 4 5 6 13 14 15 7 8 9 10 11 12
      System.out.println("height: " + t1.height()); //3
      t2.makeTree2();
      t2.levelOrder();	//0 1 2 3
      System.out.println("height: " + t2.height()); //1
      System.out.println("sub tree t1 and t1 " + t1.isSubTree(t1));
      System.out.println("sub tree t1 and t2 " + t1.isSubTree(t2)); //t2 is not a subTree of t1
      Tree t3 = new Tree();
      t3.makeTree3();
      t3.levelOrder();
      System.out.println("sub tree t1 and t3 " + t1.isSubTree(t3)); //t3 is a subTree of t1
      Tree t4 = new Tree();
      t4.makeTree4();
      t4.levelOrder();
      System.out.println("sub tree t1 and t4 " + t1.isSubTree(t4)); //t4 is a subTree of t1

   }
}