import Member.Members;
import method.MemberMethod;

public class TestRun {
    public static void main(String[] args) {
        Members allMembers = Members.getInstance();
        MemberMethod MM = new MemberMethod();
        MM.registerMember("123", "asdf", "han", "12345");
        MM.registerMember("456", "asdf", "kim", "12345");
        MM.registerMember("789", "asdf", "lee", "12345");

        System.out.println(allMembers);

        MM.findMemberByID();

        MM.updateMember();
        System.out.println(allMembers);

        MM.deleteMemberByID();
        System.out.println(allMembers);

    }
}
