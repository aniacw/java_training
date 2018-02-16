package ManyStrings;

import java.util.List;

public class ManyStringOperations {
    private List<String> myString;
    private String theLetter;

    public ManyStringOperations(List<String> myString) {
        this.myString = myString;
    }

    public void setMyString(List<String> myString) {
        this.myString = myString;
    }

    public String concatenate(List<String> myString) {
        String helpWord = "";
        for (int i = 0; i < myString.size(); i++) {
            helpWord += myString.get(i);
        }
        return helpWord;
    }

//    public boolean contains(String theLetter) {
//        for(int i = 0; i<myString.size(); i++) {
//            if (myString.get(i).contains(theLetter)) {
//                System.out.println("The word: "+ myString.get(i) + "contains the searched letter");
//                return true;
//            } else {
//                System.out.println("This word doesn't contain searched letter");
//                return false;
//            }
//        }
//    }

    public void setTheLetter(String theLetter) {
        this.theLetter = theLetter;
    }
}