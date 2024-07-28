class DiscussionState implements StudyState {
    @Override
    public void handleRequest(StudySession session) {
        System.out.println("From DiscussionState : Conducting a discussion.");
        session.setState(new GroupWorkState());
    }
}