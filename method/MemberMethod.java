package method;

import Member.Member;
import Member.Members;
import exception.*;
import exception.message.Message;
import jdk.jshell.EvalException;

import java.util.Scanner;

public class MemberMethod {
    Scanner sc = new Scanner(System.in);
    private final Members allMembers = Members.getInstance();

    String phoneNumRegex = "^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$";

    public void registerMember(String ID, String password, String memberName, String memberPhoneNum) {
        Member member = new Member(ID, password, memberName, memberPhoneNum);

        try {
            if (memberPhoneNum.matches(phoneNumRegex)) {
                allMembers.add(member);
            } else {
                throw new ValidationException();
            }
        } catch (ValidationException e) {
            System.out.println(Message.ERR_MSG_VALIDATION_EXCEPTION);
        }

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
                System.out.println("이름을 입력하세요.");
                String name = sc.next();
                updateMember.setMemberName(name);
                break;
            case "2" :
                while (true) {
                    System.out.println("전화번호를 입력하세요.");
                    String phoneNum = sc.next();
                    try {
                        if (phoneNum.matches(phoneNumRegex)) {
                            updateMember.setMemberPhoneNum(phoneNum);
                            break;
                        } else {
                            throw new ValidationException();
                        }
                    } catch (ValidationException e) {
                        System.out.println(Message.ERR_MSG_VALIDATION_EXCEPTION);
                    }
                }
                break;
            case "3" :
                System.out.println("비밀번호를 입력하세요.");
                String password = sc.next();
                updateMember.setPassword(password);
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
