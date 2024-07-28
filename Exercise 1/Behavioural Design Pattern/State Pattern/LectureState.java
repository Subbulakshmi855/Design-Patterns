class LectureState implements StudyState {
    @Override
    public void handleRequest(StudySession session) {
        System.out.println("From LectureState : Conducting a lecture.");
        session.setState(new DiscussionState());
    }
}