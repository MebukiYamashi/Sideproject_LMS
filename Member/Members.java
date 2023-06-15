package Member;

import java.util.ArrayList;

public class Members extends ArrayList<Member> {

    private static Members allMembers;

    private Members() {}

    public static Members getInstance() {
        if (allMembers == null) {
            allMembers = new Members();
        }
        return allMembers;
    }

}
