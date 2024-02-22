public class etudiant{
    private String nomNouhaila;
    private String Cne;
    private String notesMain;
    private String notes;
    private String ecole;
    private String conflit2;

    public double calculerMoyenne() {
        double moyenne = 0.0;
        if (notes != null && !notes.isEmpty()) {
            String[] notesArray = notes.split(",");
            for (String note : notesArray) {
                moyenne += Double.parseDouble(note.trim());
            }
            moyenne /= notesArray.length;
        }
        return moyenne;
    }
}