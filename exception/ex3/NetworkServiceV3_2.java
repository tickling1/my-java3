package exception.ex3;


import exception.ex3.excetion.ConnectExceptionV3;
import exception.ex3.excetion.NetworkClientExceptionV3;
import exception.ex3.excetion.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); // 추가

        try { 
            client.connect();
            client.send(data);
//        } catch (ConnectExceptionV3  | SendExceptionV3 e) { // 둘의 공통 분모만 쓸 수 있음 ㅌ(부모의 메세지)
//            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());

        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네크워크 오류] 메세지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메세지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
