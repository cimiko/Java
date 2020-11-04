package go.g2academy.ArrayDay7;

public class ArrayResizing {
    public int[] resize(int[] initialArray, int n) {
        //create new array
        int[] resizedArray = new int[n];

        System.arraycopy(initialArray,0,resizedArray,0,initialArray.length);
        //hasil: {1,2,3,0,0} setelah dicopy dengan arraycopy.
        //initialArray = {1,2,3}
        //resizedArray = {0,0,0,0,0}
        //format arraycopy
        //System.arraycopy(nama array yg dicopy, dimulai dari baris keberapa? [0], nama tujuan array yg dicopy, mau disimpan dibaris ke berapa? [0], jumlah yang dicopy? length)

        //copy old array to new array
//        for (int i = 0; i < initialArray.length; i++) {
//            resizedArray[i] = initialArray[i];
//        }
        return resizedArray;
    }
}
