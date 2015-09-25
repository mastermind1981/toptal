package toptal;

class Main {
   public static void main(String[] args) {
      Solution sol = new Solution();
      System.out.println(sol.solution(new int[] { 1,0,0,1,1 }));
   }
}

class Solution {
   public int[] solution(int[] A) {
       int[] ret = new int[A.length];

      int initial = 0;
      for (int i = 0; i < A.length; i++) {
         initial += A[i] * Math.pow(-2, i);
      }
      
      int finall;
      if (initial > 0)
         finall = -initial;
      else
         finall = initial;
      
      

      // write your code in Java SE 8
      return ret;
   }
}

class Solution2 {
   public int solution(int X, int[] A) {
      for (int i = 0; i < A.length; i++) {
         if (findEqual(A, X, i) == findDifferent(A, X, i)) {
            return i;
         }
      }
      return -1;
   }

   public long findEqual(int[] Ar, int source, int stop) {
      long equals = 0;
      for (int i = 0; i < stop; i++) {
         if (source == Ar[i])
            equals++;
      }
      return equals;
   }

   public long findDifferent(int[] Ar, int source, int begin) {
      long diff = 0;
      for (int i = begin; i < Ar.length; i++) {
         if (source != Ar[i])
            diff++;
      }
      return diff;
   }

}

class Solution3 {

   public int solution(int[] A) {
      for (int i = 0; i < A.length; i++) {
         if (sumLower(A, i) == sumHigher(A, i)) {
            return i;
         }
      }
      return -1;
   }

   public long sumLower(int[] Ar, int indice) {
      long soma = 0;
      for (int i = 0; i < indice; i++) {
         soma += Ar[i];
      }
      return soma;
   }

   public long sumHigher(int[] Ar, int indice) {
      long soma = 0;
      int len = Ar.length;
      for (int i = len - 1; i > indice; i--) {
         soma += Ar[i];
      }
      return soma;
   }

}
