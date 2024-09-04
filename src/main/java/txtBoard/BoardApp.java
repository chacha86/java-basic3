package txtBoard;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {

    ArrayList<Post> posts = new ArrayList<>();

    public void run() {
        Scanner sc = new Scanner(System.in);

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


                // 현재 날짜와 시간 가져오기
                LocalDateTime currentDateTime = LocalDateTime.now();
                // 원하는 포맷 지정하기
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
                // 포맷 적용하여 출력하기
                String formattedDateTime = currentDateTime.format(formatter);

                Post post = new Post(lastestId, title, body, formattedDateTime);
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

                Post post = findPostById(targetId);

                if(post == null) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                }

                System.out.print("수정할 제목 : ");
                String newTitle = sc.nextLine();
                System.out.print("수정할 내용 : ");
                String newBody = sc.nextLine();

                post.setTitle(newTitle);
                post.setBody(newBody);
                System.out.println("수정이 완료되었습니다.");

            } else if (command.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());
                Post post = findPostById(targetId);

                if(post == null) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                }

                posts.remove(post);
                System.out.println("삭제가 완료되었습니다.");

            } else if(command.equals("detail")) {

                System.out.print("상세보기 할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());

                Post post = findPostById(targetId);

                if(post == null) {
                    System.out.println("없는 게시물 번호 입니다.");
                    continue;
                }

                System.out.printf("번호 : %d\n", post.getId());
                System.out.printf("제목 : %s\n", post.getTitle());
                System.out.printf("내용 : %s\n", post.getBody());
                System.out.printf("등록날짜 : %s\n", post.getCreateDate());


            }
        }
    }

    public Post findPostById(int id) {

        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }

        return null;
    }
}
