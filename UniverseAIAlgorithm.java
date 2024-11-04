import java.util.ArrayList;
import java.util.LinkedList; 
import java.util.Random;

import javax.management.Query;

//The Main Driver class for the UniverseAI ONline module, uses the Query Class
public class UniverseAIAlgorithm {
    //This is the ArrayList holding the information inputs of the Query objects
    //Query objects will hold the two dropdown answers then a string of the question
    ArrayList<Query> Queries = new ArrayList<Query>();

    //Now we need a way to access the Strings from their user input website and create a Query Object.
    //The Query object has 3 parameters

    //(StudyArea, SubjectInArea, Question)
    //StudyArea is the area of study, Ex: Calculus, Biology, Computer Science
    //SubjectInArea is that subject in that area, Ex: In Biology there is Molecular Genetics, Evolution, Symbiosis
    //Question is the question the User asks, Ex: Why did fishes evolve into humans?

    public ArrayList<Query> getQueries(){
        return Queries;
    }

    
}
