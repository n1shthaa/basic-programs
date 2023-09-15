public class first011 {
    public static void main(String[] args) {
        System.out.println("Numbers between 1000 and 2000 that are divisible by 8 and multiple of 5:");
        
        for (int i = 1000; i <= 2000; i++) {
            if (i % 8 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
