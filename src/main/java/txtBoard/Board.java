package txtBoard;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Post> posts = new ArrayList<>();

        while(true) {
            System.out.print("명령어 : ");
            String command = sc.nextLine();

            if(command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if(command.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String body = sc.nextLine();

                Post post = new Post(title, body);
//                post.setTitle(title);
//                post.setBody(body);

                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
            }
        }
    }
}
