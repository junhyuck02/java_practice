package programmers.ct_start.Day23;

public class Solution4 {
    public String solution(String[] id_pw, String[][] db) {
        int check = 0;
        for (int i = 0; i < db.length; i++) {
            for (int j = 0; j < db[i].length; j++) {
                if (id_pw[0].equals(db[i][j])) {
                    check = 1;
                    continue;
                }
                if (check == 1 && id_pw[1].equals(db[i][j])) {
                    return "login";
                } else if (check == 1) {
                    return "wrong pw";
                }
            }
        }
        return "fail";

        // for(int i = 0; i < db.length; i++){
        // if(db[i][0].equals(id_pw[0])){
        // if(db[i][1].equals(id_pw[1])){
        // return "login";
        // }
        // return "wrong pw";
        // }
        // }
        // return "fail";
    }

}
