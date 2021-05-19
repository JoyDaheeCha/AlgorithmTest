public class AlgorithmTest {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        String[] test1 = {"119", "97674223", "1195524421"};
        String[] test2 = {"123", "456", "789"};
        String[] test3 = {"12", "123", "1235", "567", "88"};

        // false
        System.out.println(pb.solution(test1));

        // true
        System.out.println(pb.solution(test2));

        // false
        System.out.println(pb.solution(test3));
    }
}
