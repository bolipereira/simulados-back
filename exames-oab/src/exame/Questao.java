package exame;

import java.util.ArrayList;

public class Questao {

    private int exam_id;
    private int serial;
    private String statement;
    private ArrayList<Opcao> opcoes;
    private final int professor_id = 1;
    private final int coordinator_id = 1;
    private final int subarea_id = 1;
    private final boolean approved = true;
    private final String studyMaterials = null;
    private final String coment = null;
    private char opcaoCorreta;

     public Questao(int exam_id, int serial, String statement, char opcaoCorreta) {
        this.exam_id = exam_id;
        this.serial = serial;
        this.statement = statement;        
        this.opcaoCorreta = opcaoCorreta;
    }

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public ArrayList<Opcao> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(ArrayList<Opcao> opcoes) {
        this.opcoes = opcoes;
    }

    public int getProfessor_id() {
        return professor_id;
    }

    public int getCoordinator_id() {
        return coordinator_id;
    }

    public int getSubarea_id() {
        return subarea_id;
    }

    public boolean isApproved() {
        return approved;
    }

    public String getStudyMaterials() {
        return studyMaterials;
    }

    public String getComent() {
        return coment;
    }

    public char getOpcaoCorreta() {
        return opcaoCorreta;
    }

    public void setOpcaoCorreta(char opcaoCorreta) {
        this.opcaoCorreta = opcaoCorreta;
    }

    @Override
    public String toString() {
        return "Questao{" + "exam_id=" + exam_id + ", serial=" + serial + ", statement=" + statement + ", opcoes=" + opcoes + ", professor_id=" + professor_id + ", coordinator_id=" + coordinator_id + ", subarea_id=" + subarea_id + ", approved=" + approved + ", studyMaterials=" + studyMaterials + ", coment=" + coment + ", opcaoCorreta=" + opcaoCorreta + '}';
    }
    
}
