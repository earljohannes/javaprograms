
package dsaa;

import static dsaa.AVLNode.calcHeight;

        
class AVLNode
{
    AVLNode left;
    AVLNode right;
    int height;
    int data;
    
    AVLNode(int value)
    {
        left = null;
        right = null;
        height = 0;
        data = value;
    }
    
    int Height()
    {
        return height;
    }
    
    public static int calcHeight(AVLNode node)
    {
        if(node==null)
            return -1;
        
        else
        {
            return 1+Math.max(calcHeight(node.left), calcHeight(node.right));
        }
        
    }
    
    public boolean isLeftHeavy()
    {
        
        if(this.left==null)
        {
            return false;
        }

        if(this.right==null&&this.left!=null)
        {
            return (this.left.height+1)>1;
        }
                
        return (this.left.height-this.right.height)>1;
    }
    
    public boolean isRightHeavy()
    {
        if(this.right==null)
        {
            return false;
        }
        
        if(this.left==null&&this.right!=null)
        {
            return (this.right.height+1)>1;
        }
        
        return (this.right.height-this.left.height)>1;
    }
    
    public AVLNode RotateRight()
    {
        AVLNode newPivot = this.left;
        
        this.left = newPivot.right;
        newPivot.right = this;
        
        this.height--;
        newPivot.height++;
        
        return newPivot;
    }
    
    public AVLNode RotateLeft()
    {
        AVLNode newPivot = this.right;
        
        this.right = newPivot.left;
        newPivot.left = this;
        
        this.height--;
        newPivot.height++;
        
        return newPivot;
    }
}

public class AVLTree 
{
    AVLNode root;
    
    AVLTree()
    {
        root = null;
    }
    
    public static int Rotated = 0;
    
    public AVLNode AVLInsert(int data)
    {
        root = Insert(root, data);
        root = Rotate(root,data);
        
        if(Rotated==1)
            Rotated--;
        
        return root;
    }
    
    public static AVLNode Insert(AVLNode root, int data)
    {
        AVLNode a = new AVLNode(data);
        
        if(root==null)
        {
            root = a;
            root.height = 0;
            return root;
        }
        
        else if(a.data<=root.data)
        {
            root.left = Insert(root.left, data);
            
            if(root.right==null)
                root.height = root.left.height+1;
            
            else
                root.height = Math.max(root.left.height, root.right.height)+1;
        }
        
        else
        {
            root.right = Insert(root.right, data);
            
            if(root.left==null)
                root.height = root.right.height+1;
            
            else
                root.height = Math.max(root.left.height, root.right.height)+1;
        }
        
        return root;
    }
    
    public static AVLNode Rotate(AVLNode root, int data)
    {
        AVLNode temp = root;
        
        if(data==temp.data)
        {
            return temp;
        }
        
        else if(data<=temp.data)
        {
            root.left =  Rotate(temp.left, data);
            
            if(root.isLeftHeavy()&&Rotated==0)
            {
                if(calcHeight(root.left.right)>calcHeight(root.left.left))
                {
                    root.left = root.left.RotateLeft();
                    root = root.RotateRight();
                    Rotated++;
                }
                
                else
                {
                    root = root.RotateRight();
                    Rotated++;
                }
                System.out.println("true");
            }
            

        }
        
        else
        {
            root.right = Rotate(temp.right, data);
            
            if(root.isRightHeavy()&&Rotated==0)
            {
                if(calcHeight(root.right.left)>calcHeight(root.right.right))
                {
                    System.out.println("Reaches here");
                    root.right = root.right.RotateRight();
                    root = root.RotateLeft();
                    Rotated++;
                }
                
                else
                {
                    System.out.println("Before Rotation : "+root.data);
                    root = root.RotateLeft();
                    Rotated++;
                    System.out.println("After Rotation : "+root.data);
                }
                System.out.println("true1");
            }
            
        }
        
        //System.out.println(root.data);
        return root;
    }
    
    public static AVLNode RotateRight(AVLNode pivot)
    {
        AVLNode np = pivot.left;
        
        pivot.left = np.right;
        np.right = pivot;
        return np;
    }
    
    
    
    public static AVLNode RotateLeft(AVLNode pivot)
    {
        AVLNode np = pivot.right;
        
        pivot.right = np.left;
        np.left = pivot;
        return np;
    }
    
    public static void BFS(AVLNode root)
    {
        Queue q = new Queue(20);
        q.Enqueue(root);
        
        AVLNode tn2 = root;
        AVLNode tn = null;
        
        while(!q.isEmpty())
        {
            tn = (AVLNode) q.array[q.front];
            
            tn.height = calcHeight(tn);
            System.out.println(tn.data+"    height : "+tn.height);
            
            if(tn.left!=null)
                q.Enqueue(tn.left);
            
            if(tn.right!=null)
                q.Enqueue(tn.right);
            
            q.Dequeue();
        }
    }

    public static void main(String[] args) 
    {
        AVLTree b = new AVLTree();
        /*
        b.root = Insert(b.root, 15);
        b.root = Insert(b.root, 10);
        b.root = Insert(b.root, 20);
        b.root = Insert(b.root, 5);
        b.root = Insert(b.root, 13);
        b.root = Insert(b.root, 2);
        b.root = Insert(b.root, 7);
        b.root = Insert(b.root, 12);
        b.root = Insert(b.root, 14);
        b.root = Insert(b.root, 18);
        b.root = Insert(b.root, 30);
        b.root = Insert(b.root, 17);
        b.root = Insert(b.root, 19);
        b.root = Insert(b.root, 25);
        b.root = Insert(b.root, 35);
        b.root = Insert(b.root, 22);//1
        b.root = Insert(b.root, 40);//0
        b.root = b.AVLInsert(37);//
        
        System.out.println("height : "+b.root.Height());
        
        
        
        int a = calcHeight(b.root);
        
        BFS(b.root);
        
        //Rotate(b.root, 37);
        
        System.out.println("times rotated : "+Rotated);
        
        System.out.println("height : "+b.root.right.right.right.Height()+"   data : "+b.root.right.right.right.data);

        
        //System.out.println(a+"  "+b.root.right.right.right.right.isRightHeavy());

        */
        
        b.root = Insert(b.root,20);
        b.root = Insert(b.root,15);
        b.root = Insert(b.root,25);
        b.root = Insert(b.root,30);
        b.root = b.AVLInsert(40);
        b.root = b.AVLInsert(45);
        b.root = Insert(b.root,10);
        b.root = b.AVLInsert(12);
        
        BFS(b.root);
        //System.out.println("height : "+b.root.left.height+"   data : "+b.root.left.data);
        //System.out.println(" : "+b.root.left.data);
        

    }
    
}
