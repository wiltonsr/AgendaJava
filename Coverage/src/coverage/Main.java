package coverage;
public class Main {

    public void testMethod() {
        verify(1);
    }

    private String check(String a) {
        return "";
    }

    private String verify(int i) {
        StringBuffer retVal = new StringBuffer("verified.");
        if(i == 0) {
            retVal.append("i == 0");
        }
        if(i == 1) {
            retVal.append("i == 1");
            if(i == 2) { /* partial coverage */ retVal.append("i == 2");}
        }
        return retVal.toString();
    }
}