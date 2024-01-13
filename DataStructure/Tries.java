class TrieNode{
    char data ;    // it is the word itself
    boolean isTerminated;     // Terminating point defines , if there is any end of a word
    TrieNode[] children;    //Array of all 26 Alphabet
    int childCount;    //keeping the size of Children , so that during the deletion we don't have to travel through each and every index of children.

    public TrieNode(char data){
        this.data = data ;
        isTerminated = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class Tries {
    private final TrieNode root;
    public Tries(){
        root= new TrieNode('\0');
    }

//    ********************ADD FUNCTION **********************
    private void add(TrieNode root , String word){
        if(word.length() == 0){
            root.isTerminated = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));
    }

    public void add(String word){
        add(root, word);
    }


//    ********************SEARCH FUNCTION **********************

    private boolean search(TrieNode root, String word){
        if(word.length() == 0){
            return root.isTerminated;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return false;
        }
       return search(child, word.substring(1));
    }

    public boolean search(String word){
         return search(root, word);
    }

//    ********************DELETE FUNCTION **********************

//    "note" -> "not"
    private void delete(TrieNode root, String word){
        if(word.length()== 0){
            root.isTerminated  = false;
            return;
        }
        int childIndex = word.charAt(0)- 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return ;
        }
        delete(child, word.substring(1));

        if(!child.isTerminated && child.childCount == 0){
            root.children[childIndex]= null;
            root.childCount--;

        }

//        We can delete the child node only if it is non-terminating, and it's no. of children is 0
//        if(!child.isTerminated){
////            we are counting how many children are there
//                int numChild = 0;
//                for(int i=0; i<26 ; i++){
//                    if(child.children[i] != null){
//                        numChild++;
//                    }
//                }
//                if(numChild == 0){
////                  if number of Child is 0(there is no children).
//                      root.children[childIndex]= null;
//                      child = null;
//                      root.childCount--;
//                }
//        }

//        ************************************COUNT CHILD****************************************


    }
    public void delete(String word){
        delete(root, word);
    }


    public static void main(String[] args) {
        Tries trie = new Tries();
        trie.add("this");
        trie.add("news");
        trie.add("new");
        System.out.println("this: "+trie.search("this"));
        System.out.println("new: "+ trie.search("new"));
        System.out.println("news: "+ trie.search("news"));
        trie.delete("new");
        System.out.println("new: "+ trie.search("new"));

    }
}
