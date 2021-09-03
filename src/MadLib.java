import java.util.Scanner;

public class MadLib {
    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String Noun;
        String place;
        String adjective;
        String verb;
        String Noun2;

        //Users Noun
        System.out.println(" Put a noun ");
        Noun = read.nextLine();

        System.out.println("Put a plural Noun");
        Noun2 = read.nextLine();

        // Place
        System.out.println("lemme get a place");
        place = read.nextLine();

        //adjective
        System.out.println("give me an adjective");
        adjective = read.nextLine();

        //verb
        System.out.println("Give me a verb or sumn");
        verb = read.nextLine();

        System.out.println( "Two " + Noun + "" + " Was going down the road and went backwards." + place + " " + " is where they went." + " There was a " + adjective
        + "." + "After that night they did a. " + verb + "" + " It was all fun and games till the " + Noun2 + " " + " Came then they ran off screaming. " );


        }

    }