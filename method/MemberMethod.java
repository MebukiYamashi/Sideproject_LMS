package method;

import Book.Book;
import Book.Books;
import Member.Member;
import Member.Members;

import java.util.Scanner;

public class MemberMethod {
    Scanner sc = new Scanner(System.in);
    private final Members allMembers = Members.getInstance();

    public void registerMember(String ID, String password, String memberName, String memberPhoneNum) {
        Member member = new Member(ID, password, memberName, memberPhoneNum);
        allMembers.add(member);
    }

    public void findMemberByID() {
        System.out.print("찾을 회원의 ID를 입력하세요: ");
        String ID = sc.next();
        for (int i = 0; i < allMembers.size(); i++) {
            if ( ID.equals(allMembers.get(i).getID()) ) {
                System.out.println(allMembers.get(i));
                break;
            }
        }
    }

    public void updateMember() {
        System.out.print("수정할 회원의 ID를 입력하세요: ");
        int geti = 0;
        String ID = sc.next();
        for (int i = 0; i < allMembers.size(); i++) {
            if ( ID.equals(allMembers.get(i).getID()) ) {
                geti = i;
                break;
            }
        }
        Member updateMember = allMembers.get(geti);
        System.out.println("수정할 정보를 선택하세요");
        System.out.println("1. 이름 2. 전화번호 3. 비밀번호");
        String chooseNum = sc.next();
        switch ( chooseNum ) {
            case "1" :
                System.out.println("이름을 다시 입력하세요.");
                String name = sc.next();
                updateMember.setMemberName(name);
                break;
            case "2" :
                System.out.println("전화번호를 다시 입력하세요.");
                String phoneNum = sc.next();
                updateMember.setMemberName(phoneNum);
                break;
            case "3" :
                System.out.println("비밀번호를 다시 입력하세요.");
                String password = sc.next();
                updateMember.setMemberName(password);
                break;
        }

    }

    public void deleteMemberByID() {
        System.out.print("삭제할 회원의 ID를 입력하세요: ");
        String ID = sc.next();
        for (int i = 0; i < allMembers.size(); i++) {
            if ( ID.equals(allMembers.get(i).getID()) ) {
                allMembers.remove(i);
                break;
            }
        }
    }
}
