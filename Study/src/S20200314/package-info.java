/**
 * 연결 수락을 위해 서버가 accept()를 실행 하거나 서버 연결 요청을 위해 Socket 생성 자
 * 또는 connect()를 실행할 경우에는 해당 작업이 완료되기 전까지 블로킹 된다.
 * 데이터 통신도 마찬가지 인데 스트림의 read()나 write() 메소드는 상대방이 데이터를 보내거나 자신이 받을때
 * 블로킹 되므로 ServerSocket와 Socket은 동기(블로킹) 방식으로 구현 및 구동된다.
 * 서버가 스레드 병렬처리를 통해 이러한 작업을 처리 하지 않으면 한 클라이언트의 작업이 끝날때까지
 * 다른 클라이언트의 작업요청을 처리할 수가 없다. 그러므로 accept(), connect(), read(), write() 4가지 작업은
 * 작업 스레드를 생성해서 처리해 주는게 낫다.
 * 다만, 작업을 별도의 스레드를 이용해 처리하게 된다면 많은 클라이언트가 동시에 작업 요청시 서버성능이 치명적이게 저하 된다.
 * 따라서, 스레드 풀 을 이용해 병렬처리를 하는게 좋다.
 */
/**
 * @author Bong
 *
 */
package S20200314;