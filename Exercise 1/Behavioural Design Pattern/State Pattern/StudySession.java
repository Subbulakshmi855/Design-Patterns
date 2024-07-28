class StudySession {
    private StudyState state;

    public StudySession() {
        this.state = new LectureState(); 
    }

    public void setState(StudyState state) {
        this.state = state;
    }

    public void execute() {
        state.handleRequest(this);
    }
}