package dsaa;

import java.util.LinkedList;
import java.util.Queue;

class NodeWithNext
{
    NodeWithNext left;
    NodeWithNext right;
    NodeWithNext next;
    int data;
    
}

class populateNext
{
    public static int calcHeight(NodeWithNext root)
    {
        if(root == null)
            return -1;
            
        else
            return 1+Math.max(calcHeight(root.left),calcHeight(root.right));
    }
    
    public static boolean leftHeavy(NodeWithNext root)
    {
        return false;
    }
    
    public static boolean rightHeavy(NodeWithNext root)
    {
        return false;
    }
    
    static Queue q = new LinkedList();
    public static void populateNext(NodeWithNext root)
    {
        fillQ(root);

        NodeWithNext base = (NodeWithNext) q.remove();
        NodeWithNext target = null;
        
        while(!q.isEmpty())
        {
            target = (NodeWithNext) q.remove();
            base.next = target;
            base = target;
        }
        
        
    }
    
    public static void fillQ(NodeWithNext root)
    {
        if(root==null)
            return;
            
        fillQ(root.left);
        
        q.add(root);
        
        fillQ(root.right);
    }

}