class IndividualStudyState implements StudyState {
    @Override
    public void handleRequest(StudySession session) {
        System.out.println("From IndividualStudyState : Individual study time.");
        session.setState(new LectureState()); 
    }
}