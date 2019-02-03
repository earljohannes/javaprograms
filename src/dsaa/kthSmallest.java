
package dsaa;



class kthSmallest
{   
    static int x;
    static int c;
    public static int kthSmallest(TreeNode root,int k)
    {
        x=0;
        c=0;
        
        check(root, k);
        
        return c;
        
    }
    
    public static void check(TreeNode root, int k)
    {
        if(root==null)
            return;
            
        check(root.left, k);
        
        x++;
        if(x==k)
            c=root.data;
            
        check(root.right, k);
    }
}
