package exception.ex2;


public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        try { 
            client.connect(); // 정상 흐름
            client.send(data); // 정상 흐름
            
        } catch (NetworkClientExceptionV2 e) { // 예외 흐름
            System.out.println("[오류] 코드: " + e.getErrorCode() + " 메세지: " + e.getMessage());

        } finally {
            client.disconnect();
        }
    }
}
