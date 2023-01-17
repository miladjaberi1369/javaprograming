package HomeWork;

public class Day08_chooseLanguage {
    public static void main(String[] args) {
   int lan = 3;
   String result = "";
 //  result = lan == 1 ? "Hello, thank for your call":
 //        lan == 2 ? "Hola, gracias para llamar":
 //        lan == 3 ? "Merhaba, aradiginiz icin tesekkurler":
 //        lan == 4 ? "Privet, spasibo za vash zvonok":
 //        lan == 5 ? "Merci ,pour votre appel":
 //        "Invalid Number";
 //       System.out.println(result);
  if (lan == 1){
      result = "Hello, thank for your call";
  }
  else if (lan == 2){
      result = "Hola, gracias para llamar";
  }
  else if (lan == 3){
      result = "Merhaba, aradiginiz icin tesekkurler";
  }
  else if (lan == 4){
      result = "Privet, spasibo za vash zvonok";
  }
  else if (lan == 5){
      result = "Merci ,pour votre appel";
  }
  else {
      result = "Invalid Number";
  }
        System.out.println(result);







//Create a class called ChooseLanguage,
// 		Given an integer variable named selection that has a number between 1~5.
// 		Write a program that can select the language based on the number that's given in selection and prints the following message:
//
//			for 1: Hello, thank for your call
//			for 2: Hola, gracias para llamar
//			for 3: Merhaba, aradiginiz icin tesekkurler
//			for 4: Privet, spasibo za vash zvonok
//			for 5: Merci ,pour votre appel
//
//			for any other numbers print "Invalid Number"
//
//		Solution 1: Must use ternary
//		Solution 2:	MUST use switch statement














    }
}
