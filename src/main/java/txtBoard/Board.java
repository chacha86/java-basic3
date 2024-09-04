package txtBoard;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Post> posts = new ArrayList<>();
        int lastestId = 1;

        while (true) {
            System.out.print("명령어 : ");
            String command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String body = sc.nextLine();

                Post post = new Post(lastestId, title, body);
                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
                lastestId++;

            } else if (command.equals("list")) {

                System.out.println("==================");
                for (Post post : posts) {
                    System.out.printf("번호 : %d\n", post.getId());
                    System.out.printf("제목 : %s\n", post.getTitle());
                    System.out.println("==================");
                }
            } else if (command.equals("update")) {

                System.out.print("수정할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());

                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        System.out.print("수정할 제목 : ");
                        String newTitle = sc.nextLine();
                        System.out.print("수정할 내용 : ");
                        String newBody = sc.nextLine();

                        post.setTitle(newTitle);
                        post.setBody(newBody);
                        System.out.println("수정이 완료되었습니다.");
                        break;
                    }
                }

            } else if(command.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());

                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        posts.remove(post);
                        System.out.println("삭제가 완료되었습니다.");
                        break;
                    }
                }
            }
        }
    }
}
