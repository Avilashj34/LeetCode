class Trie {
    private class Node{
        Map<Character, Node> child;
        boolean endofNode;
        public Node(){
            child = new HashMap<>();
            endofNode = false;
        }
    }
    private Node root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node current = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            Node node = current.child.get(c);
            if(node == null){
                node = new Node();
                current.child.put(c, node);
            }
            current = node;
        }
        current.endofNode = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node current = root;
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            Node node = current.child.get(c);
            if(node == null){
                return false;
            }
            current = node;
        }
        return current.endofNode;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node current = root;
        for(int i=0; i<prefix.length();i++){
            char c = prefix.charAt(i);
            Node node = current.child.get(c);
            if(node == null){
                return false;
            }
            current = node;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */