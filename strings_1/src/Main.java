import java.util.Scanner;

/*
One person hands over the list of digits to Mr. String, But Mr. String understands only strings.
Within strings also he understands only vowels. Mr. String needs your help to find the total number of pairs
which add up to a certain digit D.The rules to calculate digit D are as follow :-

Take all digits and convert them into their textual representation.

Next, sum up the number of vowels i.e. {a, e, i, o, u} from all textual representation.

Input

First line contains an integer N which represents number of elements to be processed as input

Second line contains N numbers separated by space

Output

Lower case representation of textual representation of number of pairs in input that sum up to digit D

Note: – (If the count exceeds 100 print “greater 100”)

Constraints:
1 <= N <= 100
1 <= value of each element in second line of input <= 100

Number 100, if and when it appears in input should be converted to textual representation as
hundred and not as one hundred. Hence number of vowels in number 100 should be 2 and not 4

Example:
Example 1

Input

5

1 2 3 4 5

Output

one



Explanation:
Explanation

1 -> one -> o, e

2 -> two -> o

3 -> three -> e, e

4 -> four -> o, u

5 -> ﬁve - > i, eT

hus, couScanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int max=1;
        int start=0;
        int end=0;
        int maxx=Integer.MIN_VALUE;
        int arr[]=new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }nt of vowels in textual representation of numbers in input = {2 + 1 +2 + 2 + 2} = 9.
Number 9 is the digit D referred to in section above.Now from given list of number {1,2,3,4,5} ->
ﬁnd all pairs that sum up to 9.
Upon processing this we know that only a single unordered pair {4, 5} sum upto 9.
Hence the answer is 1. However, output speciﬁcation requires you to
print textual representation of number 1 which is one. Hence output is one.Note: -
Pairs {4, 5} or {5, 4} both sum up to 9. But since we are asking to count only unordered pair,
the number of unordered pair is this combination is only one.
 */
import java.util.ArrayList;
class mrString{
    static int count_vowels(String s){

    }
    static String int_text(int arr[]){
        char vowels[]={'a','b','c','d','e'};
        ArrayList<String> ar=new ArrayList<>();
        for (int i =0;i<=100;i++){
            ar.add(sc.next());
        }
        for (int i:arr){
           String str= ar.get(i);
           for(int m=0;m<str.length();m++){
               for(int k=0;k<vowels.length;k++){
                   if (str.charAt(m)==vowels[k]){
                       count++;
                   }
                           ]
               }

           }
        }



    }
    static void elementPairs(int arr[]){

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mrString.int_text(arr);


    }
}