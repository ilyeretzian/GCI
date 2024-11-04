//This class is responsible for creating query objects to be stored in a list which is then returned to the professor
public class Query {

    //member variable
    private String m_StudyArea;
    private String m_SubjectInArea;
    private String m_Question;

    


    //constructor of default ace of spades card.
    public Query(String StudyArea, String SubjectInArea, String Question){
        m_StudyArea=StudyArea;
        m_SubjectInArea=SubjectInArea;
        m_Question=Question;
    }


    public String getStudyArea(){
        return m_StudyArea;
    }

    public String getSubjectInArea(){
        return m_SubjectInArea;
    }

    public String getQuestion(){
        return m_Question;
    }

}
