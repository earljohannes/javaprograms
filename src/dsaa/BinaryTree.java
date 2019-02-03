
package dsaa;


public class BinaryTree 
{
    TreeNode root;
    Queue q;
    
    BinaryTree()
    {
        root = null;
        q = new Queue(20);
    }
    
    public TreeNode Insert(int data)
    {
        if(root==null)
        {
            root = new TreeNode(data);
            q.Enqueue(root);
            return root;
        }

        TreeNode temp = null;
        temp = (TreeNode)q.array[q.front];
        //System.out.println(temp.data);

        if(temp.left==null)
        {
            temp.left = new TreeNode(data);
            q.Enqueue(temp.left);
            return root;
        }

        if(temp.right==null)
        {
            temp.right = new TreeNode(data);
            q.Enqueue(temp.right);
        }

        q.Dequeue();

        return root;
    }
    
    public static void BFS(TreeNode root)
    {
        Queue q = new Queue(20);
        q.Enqueue(root);
        
        TreeNode tn2 = root;
        TreeNode tn = null;
        
        while(!q.isEmpty())
        {
            tn = (TreeNode) q.array[q.front];
            
            System.out.println(tn.data);
            
            if(tn.left!=null)
                q.Enqueue(tn.left);
            
            
            if(tn.right!=null)
                q.Enqueue(tn.right);
            
            q.Dequeue();
            
        }
    }
    
    //ratt le
    int Level(TreeNode node, int data, int level) 
    {
        if (node == null)
            return 0;
  
        if (node.data == data)
            return level;
  
        int downlevel = Level(node.left, data, level + 1);
        
        if (downlevel != 0)
            return downlevel;
  
        downlevel = Level(node.right, data, level + 1);
        return downlevel;
    }
  
    /* Returns level of given data value */
    int getLevel(TreeNode node, int data) 
    {
        return Level(node, data, 1);
    }
    
    public static void main(String[] args) 
    {
        
        BinaryTree b = new BinaryTree();
        
        b.root = b.Insert(12);
        b.root = b.Insert(8);
        b.root = b.Insert(18);
        b.root = b.Insert(22);
        b.root = b.Insert(7);
        b.root = b.Insert(9);
        b.root = b.Insert(11);
        b.root = b.Insert(13);
        b.root = b.Insert(17);
        b.root = b.Insert(19);
        b.root = b.Insert(21);
        b.root = b.Insert(23);
        b.root = b.Insert(30);
        BFS(b.root);
        
        
    }
    
}
