public class etudiant{
    private String nom1;
    private String Cne;
    private String notesMain;
    private String notes;

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