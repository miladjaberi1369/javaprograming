package day13;

public class eligibleToVote {
    public static void main(String[] args) {
    eligibleToVote(35, true);
    }
    public static void eligibleToVote(int age , boolean isAmerican){
        if (age >= 18 && isAmerican){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }

}




  //create method name eligibleToVote that take two arguments:
// 1. age (int)
// 2. isAmerican   (boolan)

//  then the method should determine if the person eligible to vote
//     EX :
//          eligible to vote (23,true)
//          output:
//          You are eligible to vote