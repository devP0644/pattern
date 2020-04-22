package helper;

public class DefaultGameConnectionHelper extends AbstGameConnectHelper {
    @Override
    protected String doSecurity(String str) {
        System.out.println("디코드");
        return str;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("암호 계정 확인");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("인증 과정");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속단계");
        return info;
    }
}
