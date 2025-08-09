//print the number of 7's that are in the  2d arrays
//Example : Input - int [][] array = {4,7,8} {8,8,7};
//output - 2
public class twodarray{
    public static void main (String args []){
        int [][] array = {{4,7,8}, {8,8,7}};

        int count = 0;
        for (int i =0; i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if (array[i][j] == 7){
                    count++;

                }
            }
        }
        System.out.println("Count of 7 is " + count);

    }
    
}

