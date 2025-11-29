public class CafeteriaPoll {
   public static void main(String [] args) {
    int[] ratings = {
        7, 8, 6, 9, 5, 10, 8, 7, 6, 9,
        7, 6, 8, 9, 5, 7, 6, 8, 9, 10,
        6, 7, 8, 5, 9, 10, 7, 6, 8, 9,
        7, 8, 6, 9, 5, 10, 8, 7, 6, 9
    };

    int sum = 0;

    System.out.println(" Ratings given by students :");
    for(int i = 0;i < ratings.length;i++) {
        System.out.println("Response" + (i + 1) + ":" + ratings[i]);
        sum += ratings[i];

        double average = (double) sum / ratings.length;

        System.out.println("\nTotal Ratings: " + sum);
        System.out.println("Number of Responses: " + ratings.length);
        System.out.println("Average Rating: " + average);
    }

    }


   } 