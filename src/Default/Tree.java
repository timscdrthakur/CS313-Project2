package Default;
import java.util.*;

class Tree{
	   private static class TNode{
	      private int value;
	      private TNode parent;
	      private List<TNode> children;
	      public TNode(){
	         this(0, null);
	      }
	      public TNode(int e){
	         this(e, null);
	      }
	      public TNode(int e, TNode p){
	         value = e;
	         parent = p;
	         children = new ArrayList<TNode>();
	      }
	   }
	   private TNode root;
	   private int size;
	   Tree(){
	      root = null;
	      size = 0;
	   }
	    public TNode createNode(int e, TNode p){
	       return new TNode(e, p);
	    }
	    public TNode addChild(TNode n, int e){
	       TNode temp = createNode(e, n);
	       n.children.add(temp);
	       size++;
	       return temp;
	    }
	    public void makeTree(){
	       root = createNode(0, null);
	       size++;
	       buildTree(root, 3);
	    }
	    public void makeTree2(){
	       root = createNode(0, null); 
	       size++; 
	       buildTree(root, 1);
	    }
	    public void makeTree3(){
	       root = createNode(3, null); 
	       size++; 
	    }
	    public void makeTree4(){
	       root = createNode(2, null); 
	       size += 13; 
	       buildTree(root, 1);
	       size -= 12;
	    }
	    private void buildTree(TNode n, int i){
	       if (i <= 0) return;
	       TNode fc = addChild(n, size);
	       TNode sc = addChild(n, size);
	       TNode tc = addChild(n, size);
	       buildTree(fc, i - 1);
	       buildTree(sc, i - 2);
	       if (i % 2 == 0)
	          buildTree(tc, i - 1);
	   }
	   public int height (TNode n){
	      /*implement*/
	   }
	   public int height(){
	      return height(root);
	   }
	   public void levelOrder(){
	      /*implement*/
	   }
	   public boolean isSubTree(Tree st){
	      /*implement for extra credit*/ return false;
	   }
	}