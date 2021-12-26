package Trie;

import java.util.HashMap;
import java.util.Map;

public class _208 {

    class Trie {

        private class TrieNode {
            Map<Character, TrieNode> edges;
            boolean isWordEnd;

            TrieNode() {
                this.edges = new HashMap<>();
                isWordEnd = false;
            }
        }

        private TrieNode root;

        /**
         * Initialize your data structure here.
         */
        public Trie() {
            root = new TrieNode();
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            TrieNode currentNode = root;
            for (char c : word.toCharArray()) {
                if (!currentNode.edges.containsKey(c))
                    currentNode.edges.put(c, new TrieNode());
                currentNode = currentNode.edges.get(c);
            }
            currentNode.isWordEnd = true;
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            TrieNode currentNode = root;
            for (char c : word.toCharArray()) {
                if (!currentNode.edges.containsKey(c))
                    return false;
                currentNode = currentNode.edges.get(c);
            }
            return currentNode.isWordEnd;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            TrieNode currentNode = root;
            for (char c : prefix.toCharArray()) {
                if (!currentNode.edges.containsKey(c))
                    return false;
                currentNode = currentNode.edges.get(c);
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
}
