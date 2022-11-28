/**
 * Created by kobis on 27 Nov, 2022
 */
public class Score {

    private int id;
    private int numOfGoals;

    public Score(int id, int numOfGoals) {
        this.id = id;
        this.numOfGoals = numOfGoals;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumOfGoals() {
        return numOfGoals;
    }

    public void setNumOfGoals(int numOfGoals) {
        this.numOfGoals = numOfGoals;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", numOfGoals=" + numOfGoals +
                '}';
    }
}
