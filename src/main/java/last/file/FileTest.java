package last.file;

public class FileTest {
    public static void main(String[] args) {

        FileUtil fu = new FileUtil();
        fu.save("hello world", "test.txt");
        String content = fu.load("test.txt");

        System.out.println(content);

    }


}
