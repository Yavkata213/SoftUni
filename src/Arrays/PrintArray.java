package Arrays;

public class PrintArray {
    public static void main(String[] args) {
        String names = "Gosho Penka Viktor";
        String[] array = names.split(" ");

        String join = String.join(" ", array);

        System.out.println(join);
    }
}
