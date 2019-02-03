
package dsaa;

class checkBST
        
{   static int x;
    static int arr[];
    
    int isBST(TreeNode root)  
    {
        x=0;
        arr = new int[100];
        int res = 1;
        
        fill(root);
        
        for(int i=0; i<x-1; i++)
        {
            
            if(arr[i]>arr[i+1])
            {
                res = 0;
            }
            
        }
        
        return res;
        
    }
    
    public static void fill(TreeNode root)
    {
        if(root==null)
            return;
            
        fill(root.left);
        
        arr[x] = root.data;
        
        x++;
        
        fill(root.right);
    }
}