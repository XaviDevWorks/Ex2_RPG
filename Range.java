public enum Range {
    CAC(1), MEDIO(10), LARGO(25);
    int distance;
    Range(int distance) {
        this.distance = distance;
    }
    public int distance() {
        return distance;
    }
}
