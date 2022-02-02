import edu.ufl.cise.plc.IToken;

public class Token implements IToken
{
    // - Token Data - //

    Kind kind;
    String input;
    int pos;
    int length;

    // --------------- //

    // Returns the kind - TM
    @Override
    public Kind getKind() {
        return kind;
    }

    // Returns the text of the token - TM
    @Override
    public String getText() {
        return input;
    }

    // Returns the Integer value of the token if the kind is an int - TM
    @Override
    public int getIntValue() {
        if(kind==Kind.INT_LIT){
            return Integer.parseInt(getText());
        } else {
            throw new NumberFormatException();
        }
    }

    // Returns the float value if the kind is a float - TM
    @Override
    public float getFloatValue() {
        if(kind==Kind.FLOAT_LIT){
            return Float.parseFloat(getText());
        } else {
            throw new NumberFormatException();
        }
    }

    @Override
    public boolean getBooleanValue() {
        if(kind==Kind.BOOLEAN_LIT){
            if(getText().compareToIgnoreCase("true")){
                return true;
            }  else {
                return false;
            }
        } else {
            throw new NumberFormatException();
        }
    }

}