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
            } else if(command.equals("list")) {
                System.out.println("==================");
                for(int i = 0; i < posts.size(); i++) {
                    System.out.printf("번호 : %d\n", i + 1);
                    System.out.printf("제목 : %s\n", posts.get(i).getTitle());
//                    System.out.printf("내용 : %s\n", posts.get(i).getBody());
                    System.out.println("==================");
                }

//                System.out.println("==================");
//                for(Post post : posts) {
//                    System.out.printf("제목 : %s\n", post.getTitle());
//                    System.out.println("==================");
//                }
            } else if(command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int targetIdx = Integer.parseInt(sc.nextLine());

                // 논리연산자
                // 조건1 || 조건2 -> 조건1 조건2 둘 중 하나만 만족해도 실행
                // 조건1 && 조건2 -> 조건1 조건2가 동시에 만족(모두 만족)해야만 실행
                if(targetIdx < 0 || targetIdx >= posts.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                }

                System.out.print("수정할 제목 : ");
                String newTitle = sc.nextLine();
                System.out.print("수정할 내용 : ");
                String newBody = sc.nextLine();

//                Post newPost = new Post(newTitle, newBody);
//                posts.set(targetIdx - 1, newPost); // 원하는 위치의 post를 newPost로 교체

                Post post = posts.get(targetIdx - 1);
                post.setTitle(newTitle);
                post.setBody(newBody);

                System.out.println("수정이 완료되었습니다.");


            }
        }
    }
}
