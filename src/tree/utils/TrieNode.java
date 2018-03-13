package tree.utils;

public class TrieNode {
	char letter;
	TrieNode[] links;
	boolean leaf;
	
	TrieNode(char letter)
    {
        this.letter = letter;
        links = new TrieNode[26];
        leaf = false;
    }
}
