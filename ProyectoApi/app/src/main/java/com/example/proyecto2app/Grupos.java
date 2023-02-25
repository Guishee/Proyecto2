package com.example.proyecto2app;

public class Grupos {
    private int grupoId;
    private int curs;
    private String cicle;
    private String aula;
    private String grup;

    public int getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(int grupoId) {
        this.grupoId = grupoId;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Grupo ID: ").append(grupoId)
                .append("\nCurs: ").append(curs)
                .append("\nAula: ").append(aula)
                .append("\nCicle: ").append(cicle)
                .append("\nGrup: ").append(grup)
                .append("\n\n");
        return stringBuilder.toString();
    }
}
