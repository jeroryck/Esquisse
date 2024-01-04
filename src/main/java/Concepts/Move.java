package Concepts;

public class Move<T extends Movable> {

    int coding;
    public T apply(T t){
        T result = t;
        if (coding > 0) {
            for (int i = 0; i < coding; i++) {
                result = (T) t.succ();
            }
        } else {
            for (int i = 0; i <-coding ; i++) {
                result = (T) t.pred();
            }
        }
        return result;
    }
    public Move(int coding){
        this.coding = coding;
    }
}
