package helper;

public abstract class AbstGameConnectHelper {

    protected abstract String doSecurity(String str);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    public String requestConnection(String encodedInfo) {
        //보안
        String decodedInfo = doSecurity(encodedInfo);

        //인증
        String id = "aaa";
        String password = "bbb";
        if(!authentication(id, password)) {
            throw new Error("아이디 암호 불일치");
        }

        String userName = "userName";

        int i = authorization(userName);

        switch (i) {
            case 0://게임 매니저
                break;
            case 1://유료 회원
                break;
            case 2://무료 회원
                break;
            case 3://권한 없음
                break;
            default://그 외
                break;
        }

        return connection(decodedInfo);
    }

}
