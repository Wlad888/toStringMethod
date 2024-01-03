public class correct {

// Correct way to print all details of an object using internal toString method



        int number;
        String city;

        String country;

        public correct(int number, String city, String country) {
            this.number = number;
            this.city = city;
            this.country = country;
        }

        public String toString() {
            return number+ "" + city + "" + country;
        }



        public static void main(String[] args) {

            correct n1 = new correct(21, "Warsahw", "Great");

            System.out.println(n1);



        }

    }



