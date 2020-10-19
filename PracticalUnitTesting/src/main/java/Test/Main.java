package Test;

public class Main {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println("x - " + s);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
