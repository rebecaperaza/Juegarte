package cr.ac.ucr.juegarte;

public class Answers {

    private String answers [][] =
            {
                    {"Alajuela", "San Jose", "Cartago", "Hereda"},
                    {"Panama", "Colon", "Herrera", "Los Santos"},
                    {"La serena", "Temuco", "Santiago", "Los Lagos"},
                    {"Miami", "New York", "Colorado", "Whasington DC"}
            };

    public String getAnswer(int row, int column){
        return answers[row][column];
    }
}
