public class Main {
    static int jump(int start, int end, int key, int previous, int jump, int arr[]) {
        while (start <= end) {
            if (arr[start] < key) {
                previous = start;
                start = start + jump;
            } else if (arr[start] == key) {
                System.out.println(start);
                return start;
            } else {
                for (int k = previous; k < start; k++) {
                    if (arr[k] == key) {
                        System.out.println(k);
                        return k;

                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,9,11,16};
        int start=0;
        int key=9;
        int end=arr.length-1;
        int previous=0;
        int jump=(int)Math.sqrt(end);
        Main.jump(start,end,key,previous,jump,arr);

            }


        }


