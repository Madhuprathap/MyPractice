package tree.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;

public class Trie {
	//static String[] matches = new String[100];
	static TrieNode createTree() {
		return(new TrieNode('\0'));
	}

	static void insertWord(TrieNode root, String word) {
		int offset = 97;
		int l = word.length();
		char[] letters = word.toCharArray();
		TrieNode curNode = root;

		for (int i = 0; i < l; i++)
		{
			if (curNode.links[letters[i]-offset] == null)
				curNode.links[letters[i]-offset] = new TrieNode(letters[i]);
			curNode = curNode.links[letters[i]-offset];
		}
		curNode.leaf = true;
	}

	static boolean find(TrieNode root, String word) {
		char[] letters = word.toCharArray();
		int l = letters.length;
		int offset = 97;
		TrieNode curNode = root;

		int i;
		for (i = 0; i < l; i++)
		{
			if (curNode == null)
				return false;
			curNode = curNode.links[letters[i]-offset];
		}

		if (i == l && curNode == null)
			return false;
		findSuffix(curNode, word.substring(0, word.length()-1));

		/*if (curNode != null && !curNode.leaf)
			return false;*/

		return true;
	}

	private static void findSuffix(TrieNode curNode, String word) {
		if (curNode.leaf == true) {
			System.out.println(word+curNode.letter);
		}
		for (int i = 0; i < 26; i++) {
			if (curNode.links[i] != null) {
				findSuffix(curNode.links[i], word+curNode.letter);
			}
		}
	}

	/*public static void main(String[] args) {
		TrieNode tree = createTree();

		 String[] words = {"an", "ant", "all", "allot", "alloy", "aloe", "are", "ate", "be"};
	        for (int i = 0; i < words.length; i++)
	            insertWord(tree, words[i]);
	        String searchWord = "b";
	        if (find(tree, searchWord))
	        {
	            System.out.println("The word was found");
	        }
	        else
	        {
	            System.out.println("The word was NOT found");
	        }
	}*/

	@Test
	public void test(){
		TrieNode tree = createTree();

		String[] words = {"an", "ant", "all", "allot", "alloy", "aloe", "are", "ate", "be"};
		for (int i = 0; i < words.length; i++)
			insertWord(tree, words[i]);

		String searchWord = "b";

		assertTrue(find(tree, searchWord));

		if (find(tree, searchWord))
		{
			System.out.println("The word was found");
		}
		else
		{
			System.out.println("The word was NOT found");
		}
	}
}
