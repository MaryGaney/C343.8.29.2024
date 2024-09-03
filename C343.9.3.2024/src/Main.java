public class Main {
    public static void main(String[] args) {


        //Recursion
            //when a function calls itself until a specified condition is met

        /*
        f(){
            print(1)               //output 1
            f(1)                    //continues to output 1 until run out of stack space -> stack overflow
        }
         */

        /*
          stack overflow -> numerous func calls just waiting ot be executed
          <p>
          base case ->
          count = 0
          f(){
               if (count == 3){
                   return count;
               }
               print(count);
               count++;
               f();
          }
          base case here stops when the counter gets to (3) so it outputs 0, 1, and 2
           f() -> 0 f() -> 1 f() -> 2 f() -> f()
                      return <- return <- return <-
         */

        /**
         * print linearly from 1 to N (by backtracking)
         * not allowed to use f(i+1,N)
         *
         * sum of first N natural numbers
         * functional way
         * n=3
         * if f(n): sum of first n natural numbers
         *      f(3) = 3 + f(2)
         *      f(n) = n + f(n-1)
         *
         * n = N
         * f(n) {
         *      if (n ==0){
         *          return 0;
         *      }
         *      return n + f(n-1)
         * }
         *
         *
         * parameterized way
         * i = N, sum = 0
         * f(i, sum){
         *      if (i<1){
         *          return sum;
         *      }
         *      f(i-1, sum + i)
         * }
         *
         *
         * Check if a given string is a palindrome (true or false to be returned)
         * for the word Madam
         * m i = 0
         * a i = 1
         * d
         * a = n -2 = 3
         * m = n - 1 = 4
         * can be read as <- as n - 1 - i
         * left to right is i = 0, i = 1, but right to left is n - 1 - i
         *
         * f(i){
         *    if(i>= n/2){
         *          return True;
         *    }
         *    if(s[i] != s[n-1-i]){
         *        return False;
         *    }
         *    return f(i+1);
         * }
         *
         *
         * Fibonacci
         * f(4) = f(3) + f(2)
         * f(n) = f(n-2) + f(n-1)
         * f(n){
         *      if(n == 0){
         *          return 1;
         *      }
         *      if(n == 1){
         *          return 1;
         *      }
         *      return f(n-2) + f(n-1)
         * }
         *
         * subsequence sum equals to some target:
         * return true if there exists a subseq with sum equal to k
         * return False if there dne a subseq with sum equal to k
         * {1,2,3,4}, k = 4
         * {1,3}, 4
         * k = 4
         * 4 - 4 = 0, so keep subtracting the elements of the list from k
         * 4 - 3 = k = 1, so go through list until find something less than 1, so k - 1 = 0
         * if k = 0 then return True
         * if i == 0 then return array[0] == k
         * bool not_take = f(i-1,k)
         * book take = false;
         * if(array[i] <= k){
         *      take = f(i-1,k-array[i])
         * }
         *
         * generate all the subsequences and check if any gives a sum of k -> useless, takes too much time
         * -we can just keep a check (while generating subsequences via recursion) if there is such a subsequence
         *
         * generic approach to such problems:
         *      -express in terms of (index, target) (and do we need more parameters?)
         *      -explore possibilities of that index
         *          -value at that index is a part of such a subsequence
         *          -value is not a part of such a subsequence
         *      -returning true/false for the possibilities
         *
         * f(n-1,k) -> in the entire array until index n-1, does there exist a target k?
         */


    }
}