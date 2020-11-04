package go.g2academy.ArrayDay7;

public class MyDate {
        private int day = 1; //state, field, intance variable
        private int month = 1;
        private int year = 2000;

        public MyDate(){}

        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        // public String toString() {
        //     String d = String.valueOf(this.day);
        //     String m = String.valueOf(this.month);
        //     String y = String.valueOf(this.year);

        // }

        public void showMyDate() {
            System.out.println("\nMy Date is: "
                    + day + "-" + month + "-" + year);
        }

        public void birthDay() {
            this.year = this.year + 1;
        }

        public void setDay(int day) { //argument, parameter variable
            this.day = day;
        }
}
