
package dsaa;
import java.util.Stack;


public class BST 
{
    TreeNode root;
    
    BST()
    {
        root = null;
    }
    
    public static int FindMin(TreeNode root)
    {
        
        if(root==null)
            return -1;
        
        if(root.left==null)
            return root.data;
        
        else
            return FindMin(root.left);
        
    }
    
    public static int FindMax(TreeNode root)
    {
        TreeNode tn = root;
        
        if(root==null)
            return -1;
        
        if(root.right==null)
            return root.data;
        
        else
            return FindMax(root.right);

    }
    
    public static TreeNode Insert(TreeNode root, int data)
    {
        TreeNode tn = new TreeNode(data);
        
        if(root==null)
        {
            root = tn;
            //System.out.println("Inserted root");
        }
        
        else if(tn.data<=root.data)
        {
            //System.out.println("Inserted Left");
            root.left = Insert(root.left, data);
        }
        
        else
        {
            //System.out.println("Inserted Right");
            root.right = Insert(root.right, data);
        }
        
        return root;

    }
    
    public static int Search(TreeNode root, int data)
    {
        if(root==null)
        {
            System.out.println("Tree Empty");
            return 0;
            
        }
        
        else if(root.data==data)
        {
            return 1;
        }
        
        else if(data<=root.data)
        {
            System.out.println("LEFT");
            return Search(root.left, data);
        }
        
        else
        {
            System.out.println("RIGHT");
            return Search(root.right, data);
        }
    }
    
    public static int Height(TreeNode root)
    {
        if(root==null)
            return -1;
                    
        if(root.left==null&&root.right==null)
        {
            return 0;
        }
        
        else
        {
            int rht = 1+Height(root.right);
            int lft = 1+Height(root.left);
            
            if(rht>lft)
                return rht;
            else
                return lft;
        }

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
    
    public static void PreOrder(TreeNode root)
    {
        if(root==null)
            return;
        
        System.out.println(""+root.data);
        
        PreOrder(root.left);
        PreOrder(root.right);
        
    }
    
    public static void InOrder(TreeNode root)
    {
        if(root==null)
            return;
        
        if(root.left!=null)
            InOrder(root.left);
        
        System.out.println(root.data);
        
        if(root.right!=null)
            InOrder(root.right);
        
    }
    
    public void MorrisInOrder()
    {
        TreeNode temp = this.root; 
        
        while(temp!=null)
        {
            if(temp.left==null)
            {
                System.out.println(""+temp.data);
                temp = temp.right;
            }

            else
            {
                TreeNode pre = temp.left;
                while(pre.right!=null && pre.right!=temp)
                {
                    pre = pre.right;
                }
                
                if(pre.right==null)
                {
                    pre.right = temp;
                    temp = temp.left;
                }
                
                else
                {
                    pre.right = null;
                    System.out.println(temp.data);
                    temp = temp.right;
                }
                
            }
        }
    }
    
    public static void PostOrder(TreeNode root)
    {
        if(root==null)
            return;
        
        PostOrder(root.left);
        PostOrder(root.right);
        
        System.out.println(""+root.data);
        
    }
    
    public static boolean CheckBST(TreeNode root)
    {
        boolean c = true;
        
        if(root.left==null&&root.right==null)
            return true;
        
        if(root.left!=null)
        {
            if(root.left.data<=root.data)
            {
                c = CheckBST(root.left);
            }
            
            else
                c = false;
        }
        

        if(root.right!=null)
        {
            if(root.data<=root.right.data)
            {
                c = CheckBST(root.right);
            }
            
            else
                c = false;
        }
        
        return c;
        
    }
    
    public static void main(String[] args) 
    {
        BST b = new BST();
        BST b2 = new BST();
        
        
        b.root = Insert(b.root, 15);
        //System.out.println(""+b.root.data);
        b.root = Insert(b.root, 10);
        //System.out.println(""+b.root.data);
        //System.out.println(""+b.root.left.data);
        b.root = Insert(b.root, 20);
        //System.out.println(""+b.root.data);
        //System.out.println(""+b.root.left.data);
        //System.out.println(""+b.root.right.data);
        b.root = Insert(b.root, 12);
        b.root = Insert(b.root, 8);
        b.root = Insert(b.root, 18);
        b.root = Insert(b.root, 22);
        b.root = Insert(b.root, 7);
        b.root = Insert(b.root, 9);
        b.root = Insert(b.root, 11);
        b.root = Insert(b.root, 13);
        b.root = Insert(b.root, 17);
        b.root = Insert(b.root, 19);
        b.root = Insert(b.root, 21);
        b.root = Insert(b.root, 23);
        b.root = Insert(b.root, 30);

        //int y = Search(b.root, 19);
        /*
        System.out.println(""+ y);
        
        System.out.println(""+FindMin(b.root));
        System.out.println(""+FindMax(b.root));
        
        System.out.println(""+Height(b.root));
        
        */
        b2.root = Insert(b2.root, 4);
        //BFS(b2.root);
        //BFS(b2.root);
        //PreOrder(b.root);
        //InOrder(b.root);
        //PostOrder(b.root);
        //System.out.println(""+CheckBST(b.root));
        b.MorrisInOrder();
    }
    
}
