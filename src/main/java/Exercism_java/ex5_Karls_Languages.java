package Exercism_java;
/*Introduction
Generic Types

A generic type is a generic class or interface that is parameterized over types. This allows the compiler to enforce type safety on the class or interface.

Consider this non-generic Container interface:

class Container {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}

Since it accepts and returns Object types, it works with any non-primitive type. However, this comes at a cost because some code may call get expecting Integers while other code calls set adding Strings resulting in a runtime exception.

A generic class and generic interface have the following formats:

class ClassName<T1, T2, ..., Tn> { ... }
interface InterfaceName<T1, T2, ..., Tn> { ... }

The type parameter section, delimited by angle brackets (<>), following the class or interface name specifies the type parameters (also called type variables) T1, T2, ..., and Tn. These can be used inside the body of the class or interface to get generic type safety.

Here is the generic version of Container:

class Container<E> {
    private E object;

    public void set(E object) { this.object = object; }
    public E get() { return object; }
}

        When created, now we have to declare what type it holds and the compiler will enforce that constraint:

// empty <> can infer from context
Container<String> stringContainer = new Container<>();
// compiler knows this is a String, so it is allowed
stringContainer.set("Some string");
// no cast needed, compiler knows it is a String
String result = stringContainer.get();
// this causes a compiler error:
stringContainer.set(42);

Lists

Lists are the ordered sequence collection in Java. Unlike arrays, a List can grow in size to accommodate any number of items. One standard implementation is the ArrayList which is backed by a re-sizable array. Another standard implementation is the LinkedList class which is backed by a doubly-linked list.

Lists may be empty or hold any number of items (including duplicates). Lists are a generic interface typed to indicate which type of objects they can contain. For example:

List<String> emptyListOfStrings = List.of();
List<Integer> singleInteger = List.of(1);
List<Boolean> threeBooleans = List.of(true, false, true);
List<Object> listWithMultipleTypes = List.of("hello", 1, true);

Lists have various helpful methods to add, remove, get, and check for an element to be present:

List<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'i', 'e', 'a'));
int startingSize = vowels.size(); // 7
vowels.add('u'); // vowels is now ['a', 'e', 'i', 'o', 'i', 'e', 'a', 'u']
char a = vowels.get(0); // 'a'
boolean hadI = vowels.remove('i'); // true and vowels is now ['a', 'e', 'o', 'i', 'e', 'a', 'u']
boolean hasI = vowels.contains('i'); // true (still have one more left)

Instructions

Karl wants to keep track of a list of languages to learn on Exercism's website. Karl needs to be able to add new languages, remove old ones and check if certain languages are in the list. It would be very exciting if Karl wants to learn Java or Kotlin!
        */

import java.util.ArrayList;
import java.util.List;

public class ex5_Karls_Languages {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        this.languages.add(language);
    }

    public void removeLanguage(String language) {
        this.languages.remove(language);
    }

    public String firstLanguage() {
        return this.languages.getFirst();
    }

    public int count() {
        return this.languages.size();
    }

    public boolean containsLanguage(String language) {
        return this.languages.contains(language);
    }

    public boolean isExciting() {
        return containsLanguage("Java") || containsLanguage("Kotlin");
    }

    public static void main(String[] args) {
        ex5_Karls_Languages karlsLanguagesEx5 = new ex5_Karls_Languages();
        System.out.println(karlsLanguagesEx5.isEmpty());
    }
}
