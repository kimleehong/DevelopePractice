package Board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//# 기능9 : 검색기능1, 제목으로 검색
//        - 명령어 : search
//        - 설명 : 제목으로 게시물 검색 기능 구현. 제목에 검색 키워드가 포함된 게시물 목록을 출력해주세요.
//        - 입출력 예시
//        - 힌트 : String의 contains 메서드
//
//        ```
//        명령어 : list
//        ==================
//        번호 : 1
//        제목 : 안녕하세요 반갑습니다. 자바 공부중이에요.
//        ==================
//        번호 : 2
//        제목 : 자바 질문좀 할게요~
//        ==================
//        번호 : 3
//        제목 : 정처기 따야되나요?
//        ==================
//        명령어를 입력해주세요 : search
//        검색 키워드를 입력해주세요 : 자바
//        번호 : 1
//        제목 : 안녕하세요 반갑습니다. 자바 공부중이에요.
//        =============
//        번호 : 2
//        제목 : 자바 질문좀 할게요~
//        =============
//        명령어를 입력해주세요 : search
//        검색 키워드를 입력해주세요 : 정처기
//        ==================
//        번호 : 3
//        제목 : 정처기 따야되나요?
//        ==================
//        명령어를 입력해주세요 : search
//        검색 키워드를 입력해주세요 : hihi
//        ==================
//        검색 결과가 없습니다.
//        ==================
//        ```
public class _09_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> titles = new ArrayList<>();
        List<String> contents = new ArrayList<>();
        List<String> today = new ArrayList<>();
        List<Integer> num = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");

        // 초기 데이터 추가
        num.add(1);
        titles.add("안녕하세요 반갑습니다. 자바 공부중이에요.");
        contents.add("자바 공부 중인데 궁금한 점이 있어요.");
        LocalDateTime currentDateTime = LocalDateTime.now();
        today.add(currentDateTime.format(formatter));

        num.add(2);
        titles.add("자바 질문좀 할게요~");
        contents.add("자바에 대해 궁금한 게 있어서요.");
        currentDateTime = LocalDateTime.now();
        today.add(currentDateTime.format(formatter));

        num.add(3);
        titles.add("정처기 따야되나요?");
        contents.add("정처기 자격증을 따는 것이 좋을까요?");
        currentDateTime = LocalDateTime.now();
        today.add(currentDateTime.format(formatter));

        while (true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();

            if (cmd.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = sc.nextLine();
                currentDateTime = LocalDateTime.now();
                String formattedDateTime = currentDateTime.format(formatter);

                int newNumber = num.get(num.size() - 1) + 1; // 새로운 게시물의 번호 설정
                num.add(newNumber);
                titles.add(title);
                contents.add(content);
                today.add(formattedDateTime);

                System.out.println("게시물이 등록되었습니다.");
            } else if (cmd.equals("list")) {
                if (titles.isEmpty()) {
                    System.out.println("등록된 게시물이 없습니다.");
                } else {
                    System.out.println("==================");
                    for (int i = 0; i < titles.size(); i++) {
                        System.out.println("번호 : " + num.get(i));
                        System.out.println("제목 : " + titles.get(i));
                        System.out.println("==================");
                    }
                }
            } else if (cmd.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int index = sc.nextInt();
                sc.nextLine();

                if (index < 1 || index > titles.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.print("새로운 제목 : ");
                    String newTitle = sc.nextLine();
                    System.out.print("새로운 내용 : ");
                    String newContent = sc.nextLine();
                    currentDateTime = LocalDateTime.now();
                    String formattedDateTime = currentDateTime.format(formatter);

                    titles.set(index - 1, newTitle);
                    contents.set(index - 1, newContent);
                    today.set(index - 1, formattedDateTime);

                    System.out.println(index + "번 게시물이 수정되었습니다.");
                }
            } else if (cmd.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int index = sc.nextInt();
                sc.nextLine();

                if (index < 1 || index > titles.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    titles.remove(index - 1);
                    contents.remove(index - 1);
                    num.remove(index - 1);
                    System.out.println(index + "번 게시물이 삭제되었습니다.");

//                    // 삭제한 게시물의 번호 이후 게시물 번호 재조정
//                    for (int i = index - 1; i < titles.size(); i++) {
//                        num.set(i, num.get(i) - 1);
//                    }
                }
            } else if (cmd.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                int index = sc.nextInt();
                sc.nextLine();
                if (index < 1 || index > titles.size()) {
                    System.out.println("존재하지 않는 게시물 번호입니다.");
                } else {
                    System.out.println("==================");
                    System.out.println("제목 : " + titles.get(index - 1));
                    System.out.println("내용 : " + contents.get(index - 1));
                    System.out.println("등록날짜 : " + today.get(index - 1));
                    System.out.println("==================");
                }
            } else if (cmd.equals("search")) {
                System.out.print("검색할 키워드를 입력해주세요 : ");
                String keyword = sc.nextLine();
                boolean found = false; // 검색 결과가 있는지 여부를 체크하는 변수

                try {
                    int searchNum = Integer.parseInt(keyword); // 입력값을 정수로 변환 시도
                    // 게시물 번호로 검색
                    int index = num.indexOf(searchNum);
                    if (index != -1) { // 검색 결과가 있으면
                        System.out.println("==================");
                        System.out.println("번호 : " + num.get(index));
                        System.out.println("제목 : " + titles.get(index));
                        System.out.println("==================");
                        found = true;
                    }
                } catch (NumberFormatException e) {
                    // 입력값이 숫자가 아닌 경우 예외 처리
                    // 제목으로 검색
                    for (int i = 0; i < titles.size(); i++) {
                        if (titles.get(i).contains(keyword)) {
                            System.out.println("==================");
                            System.out.println("번호 : " + num.get(i));
                            System.out.println("제목 : " + titles.get(i));
                            System.out.println("==================");
                            found = true; // 검색 결과가 있다면 found를 true로 변경
                        }
                    }
                }

                if (!found) { // 검색 결과가 없는 경우에만 메시지 출력
                    System.out.println("검색 결과가 없습니다.");
                }
            } else if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 명령어입니다. 다시 입력해주세요.");
            }
        }

    }
}