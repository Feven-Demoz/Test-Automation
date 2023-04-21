public class Main {
    public static void main(String[] args) { //passing array of strings as a parameter in the main function

        if(args.length !=0) {  // if the lenght is not zero
            if (args.length >= 1 )  // if the length is bigger or equal to 1

                System.out.println("The first argument entered is " + args[0]); // printing and accessing the first command line argument
                System.out.println("The second argument entered is " + args[1]);  // printing and accessing the second command line argument
        }
        else
            System.out.println("No arguments found "); // if zero error message

    }
}