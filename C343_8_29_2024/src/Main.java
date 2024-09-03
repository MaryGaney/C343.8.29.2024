import org.jetbrains.annotations.Nullable;

public class Main {
    public static void main(String[] args) {
        //a bit about complexity analysis of algorithms
        /**
         * we have a list of n items that may contain duplicates
         * goal is to remove duplicates
         *
         * ideas on how to remove:
         *      -first idea: create new list with all the books, if the books are already there, don't put in list
         *      -second idea: for each item, search the current list, if it is present then delete the extra
         *      -Sam suggests a java string function that already exists, sorry Sam :(
         *      -:| suggests a hashset like he didn't just hear what Sam said
         *
         *      example:
         *          input: {2,1,1,3,4,1,2,3,2}
         *          first idea:
         *              {2,...} check if 2, not so {2}
         *              {..1...} check if 1, not so {2,1}
         *              {...1...} check if 1, there is so stays the same {2,1}
         *              {...3...} check if 3, not so {3,1,2}
         *              ...
         *              final output: {4,3,1,2}
         *              algorithm analysis:
         *                  n (the element in the first list) * n (the element in the second list)
         *                  so O(n^2)
         *          can we do better than O(n^2)
         *          We know that removing duplicates from list of n items can be solved in O(n^2)
         *          If the list is sorted removing duplicates, all elements equal next to each other (come in blocks)
         *              everything equal to it throw away
         *              next element
         *                  everything equal to it throw away
         *
         *          If the list is sorted, we can remove duplicates in O(n) because we are going over the list only once
         *          What about sorting?
         *              Assagak???
         *              sorting ideas:
         *                  -merge sort O(nlogn)
         *                  -bubble sort O(n^2)
         *                  -Bogo sort :)
         *
         *              2^10 = 1024
         *              log[base2](1024) = 10
         *
         *              How does merge sort work?
         *                  {7,2,3,4,1,6,8,5}
         *                  becomes
         *                  {7,2,3,4} and {1,6,8,5}
         *                  becomes {7,2} and {3,4}  as well as {1,6} and {8,5}
         *                  becomes {2,7} and {3,4} as well as {1,6} and {5,8}
         *                  look at 2 and 3
         *                  {2, ...}
         *                  then look at 3 and 4
         *                  {2,3,4,7}
         *                  look at 1 and 5
         *                  {1, ...}
         *                  look at 5 and 6
         *                  {1, 5, 6, 8}
         *                  look at 1 and 2
         *                  {1,
         *                  look at 2 and 3
         *                  {1, 2,
         *                  look at 3 and 5
         *                  {1, 2, 3
         *                  look at 5 and 4
         *                  {1, 2, 3, 4
         *                  look at 5 and 6
         *                  {1, 2, 3, 4, 5
         *                  look at 6 and 7
         *                  {1, 2, 3, 4, 5, 6
         *                  look at 7 and 8
         *                  {1, 2, 3, 4, 5, 6, 7
         *                  only have 8
         *                  {1, 2, 3, 4, 5, 6, 7, 8}
         *                  after we sort we have to do a pass of the list so that adds the n to the log(n) so it becomes O(nlogn)
         *
         *          Hash set
         *          {2,3,2,1,1,2,4,3,2}
         *          a[i] = x
         *          0 -
         *          1 - 1
         *          2 - 2
         *          3 - 3
         *          4 - 4
         *          5 -
         *          6 -
         *          7 -
         *              take 2 and update a[2], if position is full don't do it, if it's empty add it
         *              O(n) algorithm but probabilistic (could be really bad, but also, could be very very efficient)
         *
         *
         *         Wants the following functions committed to memory
         *         O(1) - constant, time doesn't depend on size of data
         *         O(logn)
         *         O(n)
         *         O(n^k)
         *         O(nlogn)
         *         O(2^n) - intractable, n = 60 would be impossible
         *
         *         Undecidable problems
         *              self-reference
         *              program is a file with text but also compilable and executable
         *              what happens when running a compiler on itself
         *                  the paradox: you want to download something from a website and says click here:
         *                      runs something when clicked, you'd like some assurance that what you clicked on is not a virus
         *                      can we write virus detection that is perfect?
         *                      no, because there is always a possibility
         *                      if this hypothetical thing exists then running it on itself creates a paradox (false true true false etc etc)
         *                      cannot tell about a program is undecidable
         *                      some problems cannot be solved and the best we can do is work until the new problem, there is no end, thanks Sabry, lovely.
         */
    }
}