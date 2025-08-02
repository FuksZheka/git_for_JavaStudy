package Exercism_java.Gotta_Snatch_Em_All;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> set = new HashSet<>(cards);
        return set;
    }

    static boolean addCard(String card, Set<String> collection) {
         return collection.add(card);
    }

    public static boolean canTrade(Set<String> yourCollection, Set<String> friendCollection) {
        // Find cards you have that friend doesn't
        Set<String> yourUniqueCards = new HashSet<>(yourCollection);
        yourUniqueCards.removeAll(friendCollection);

        // Find cards friend has that you don't
        Set<String> theirUniqueCards = new HashSet<>(friendCollection);
        theirUniqueCards.removeAll(yourCollection);

        // Trade is possible if both have at least one unique card
        return !yourUniqueCards.isEmpty() && !theirUniqueCards.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCardsCollection = new HashSet<>(collections.get(0));
        for (int i = 0; i < collections.size(); i++) {
            commonCardsCollection.retainAll(collections.get(i));
            if (commonCardsCollection.isEmpty()){
                break;
            }
        }
        return commonCardsCollection;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCardsCollection = new HashSet<>(collections.get(0));
        for (int i = 0; i < collections.size(); i++) {
            allCardsCollection.addAll(collections.get(i));
            if (allCardsCollection.isEmpty()){
                break;
            }
        }
        return allCardsCollection;
    }
}
