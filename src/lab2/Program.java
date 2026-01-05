//void main(String[] args) {
//
//    int mark = 43;
//    String grade;
//
//    grade = switch (mark) {
//        case mark>=71 -> "Distinction";
//        case mark<=70 && mark>=61 -> "Merit";
//        case mark<=60 && mark>=50 -> "Pass";
//        case mark<=49 -> grade = "Fail";
//        default -> throw new IllegalArgumentException("Error: marks must be between 1..100");
//    };
//    System.out.println("The students grade is " + grade);
//}

// This would hypothetically work if instead of a boolean, I listed all numbers between x and y.
// Should just use a normal if else statement

    public static void main(String[] args) {

        int mark = 72;
        String grade;

        if (mark >= 71) {
            grade = "Distinction";
        } else if (mark >= 61) { // implicitly mark <= 70
            grade = "Merit";
        } else if (mark >= 50) { // implicitly mark <= 60
            grade = "Pass";
        } else if (mark >= 0) { // implicitly mark <= 49
            grade = "Fail";
        } else {
            throw new IllegalArgumentException("Error: marks must be between 0..100");
        }

        System.out.println("The student's grade is " + grade);
    }


    //test commit