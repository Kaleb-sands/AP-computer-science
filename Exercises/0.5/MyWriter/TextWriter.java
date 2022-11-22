/*
 * This class takes an input and outputs it as a print.
 */
public class TextWriter{
    private String inputText; //Text to be displayed

    public void setInputText(String userText){
        inputText = userText;
    }
    public String getInputText(){
        return inputText;
    }
    public void displayInputText(){
        System.out.println(inputText);
    }
 }