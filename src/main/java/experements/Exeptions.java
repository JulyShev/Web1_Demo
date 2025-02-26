package experements;

public class Exeptions {
    public static void main(String[] args) {
        String[] strArray ={"str1", "str2", "str3", "str4"};
        System.out.println("============");
        pause();
        System.out.println("Horey!");
        uncheckedExeption(strArray);
    }
    private static void uncheckedExeption(String[] strArray){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(strArray[i]);
            }
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Created exeption");
            throw new RuntimeException(e);
        }
        System.out.println("The program is working");
    }
    private static void pause(){
        try {
            checkedExeption();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static void checkedExeption() throws InterruptedException {
        Thread.sleep(3000);
    }
}
