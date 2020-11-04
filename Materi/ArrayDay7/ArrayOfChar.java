package go.g2academy.ArrayDay7;

public class ArrayOfChar {
    public char[] createArray(){
        //char[] s = new char[26];
        //atau
        char[] s;

        //new char[26] adalah membuat char[] s menjadi mempunyai 26 char kosong ('')
        s = new char[26];

        //membuat char mempunyai isi huruf A-Z
//        for (int i = 0; i < 26; i++) {
//            s[i] = (char) ('A' + i); // A + 1 default menjadi B
//        }

        for (int i = 0; i < s.length; i++) {
            // A + 1 default menjadi B
            s[i] = (char) ('A' + i);
            // Karena 'A'=char dan i=int, maka diberi (char) untuk mengubah semuanya menjadi tipe char
        }

        return s;
    }
}
