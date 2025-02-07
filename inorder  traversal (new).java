class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> a=new ArrayList<>();
        if(root!=null){
            a.addAll(inOrder(root.left));
            a.add(root.data);
            a.addAll(inOrder(root.right));
            
        }
        return a;
    }
}