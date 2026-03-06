package school.coda.java.ecoconception.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CollectionsJavadoc {

    static void main() {
        {
            HashSet<String> c = new HashSet<>();
        }

        {
            HashMap<String,String> c = new HashMap<>();
        }

        {
            LinkedHashSet<String> c = new LinkedHashSet<>();
        }

        {
            LinkedList<String> c = new LinkedList<>();
        }

        {
            Stack<String> c = new Stack<>();
        }

        {
            Hashtable<String,String> c = new Hashtable<>();
        }

        {
            ArrayList<String> c = new ArrayList<>();
        }

        {
            List<String> c = List.of("A","B","C");
        }


    }
}
