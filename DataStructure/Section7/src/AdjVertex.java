/**
 * <h3></h3>
 * Created by root on 2016/11/8.
 */
public class AdjVertex {

    private String mName;

    private AdjVertex mEdgeHead;

    public AdjVertex(String mName, AdjVertex mEdgeHead) {
        this.mName = mName;
        this.mEdgeHead = mEdgeHead;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public AdjVertex getmEdgeHead() {
        return mEdgeHead;
    }

    public void setmEdgeHead(AdjVertex mEdgeHead) {
        this.mEdgeHead = mEdgeHead;
    }
}
