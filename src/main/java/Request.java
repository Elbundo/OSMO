public class Request {
    private long updated_at;
    private Swapping[] data;

    public void setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
    }

    public void setData(Swapping[] data) {
        this.data = data;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    public Swapping[] getData() {
        return data;
    }
}
