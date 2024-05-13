package week11;
import java.io.ObjectStreamException;
public class ListArrayObject {
    public void add(Object o) {     // 데이터 추가하는 메서드 정보를 전달하면 해당 정보를 가장 뒤에 추가한다.


    }
    public Object get(int i) {      // 순번을 전달하면 해당하는 순번에 있는 데이터를 조회한다. 해당 순번에 데이터가 없는 경우에는 null을 리턴한다.


        return null;
    }
    public void remove(int i) {     // 순번을 전달하면 해당하는 순번에 있는 데이터를 삭제한다. (중간에 있는 순번의 데이터가 삭제되는 경우, 후순위 데이터의 순번은 1씩 감소한다.) 해당 순번에 데티어가 없는 경우에는 삭제가 이루어지지 않는다.


    }
    public void remove() {      // 가장 마지막에 있는 정보를 삭제한다.

    }
    public int size() {     // 목록의 개수를 호출한다.

        return 0;
    }
}
