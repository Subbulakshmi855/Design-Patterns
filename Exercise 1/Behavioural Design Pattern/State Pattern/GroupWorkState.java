class GroupWorkState implements StudyState {
    @Override
    public void handleRequest(StudySession session) {
        System.out.println("From GroupWorkState : Conducting group work.");
        session.setState(new IndividualStudyState());
    }
}