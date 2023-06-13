package member;

public class Member {

    private String ID;
    private String password;private String memberName;
    private String memberPhoneNum;

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
}

