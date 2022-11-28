/**
 * Created by kobis on 27 Nov, 2022
 */
public class Line {

    private int idx;
    private String content;

    public Line(int idx, String content) {
        this.idx = idx;
        this.content = content;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Line{" +
                "idx=" + idx +
                ", content='" + content + '\'' +
                '}';
    }
}
