package Member;

import java.util.Objects;

public class Member {

    private String ID;
    private String password;
    private String memberName;
    private String memberPhoneNum;

    public Member () {}

    public Member(String ID, String password, String memberName, String memberPhoneNum) {
        this.ID = ID;
        this.password = password;
        this.memberName = memberName;
        this.memberPhoneNum = memberPhoneNum;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPhoneNum() {
        return memberPhoneNum;
    }

    public void setMemberPhoneNum(String memberPhoneNum) {
        this.memberPhoneNum = memberPhoneNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(ID, member.ID) && Objects.equals(password, member.password) && Objects.equals(memberName, member.memberName) && Objects.equals(memberPhoneNum, member.memberPhoneNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, password, memberName, memberPhoneNum);
    }

    @Override
    public String toString() {
        return "Member{" +
                "ID='" + ID + '\'' +
                ", password='" + password + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberPhoneNum='" + memberPhoneNum + '\'' +
                '}';
    }

}

